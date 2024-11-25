package com.generation.freelancerweb.model.repositories;

import com.generation.freelancerweb.model.entities.Contract;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ContractRepository extends RepositoryGenerica<Contract>
{
	//SINGLETON
	private static ContractRepository instance;

	public static ContractRepository getInstance()
	{
		if (instance == null)
			instance = new ContractRepository();
		return instance;
	}

	private ContractRepository()
	{
		//ogni COSTRUTTORE di un SOTTOTIPO
		//è OBBLIGATO a richiamare un COSTRUTTORE del SUPERTIPO
		super(Contract.class);
	}
	//FINE SINGLETON


	public List<Contract> queryJpql(Integer ageMin,Integer ageMax)
	{
		//se ho tutti e 2 allora prendo in quel range
		//se ho solo il primo allora l'eta max può essere qualsiasi
		//se ho solo il secondo l'eta min può essere qualsiasi
		//20 40 voglio quelli tra 20 e 40
		//20 null quelli maggiori di 20
		//null 40 quelli minori di 40
		TypedQuery<Contract> q = em.createQuery("SELECT c.commission,c.payment FROM Contract c WHERE c.freelancer.age>:a AND freelancer.age<:b", Contract.class);
		if(ageMin!=null)
			q.setParameter("a", ageMin);
		else
			q.setParameter("a", 0);
		if(ageMax!=null)
			q.setParameter("b", ageMax);
		else
			q.setParameter("b", 1000);

		return q.getResultList();

	}
//
//	SELECT c.commission,c.payment FROM contract  c
//	JOIN freelancer on c.freelancer_id = freelancer.id
//	WHERE freelancer.age=29
}

package com.generation.freelancerweb.model.repositories;


import com.generation.freelancerweb.model.entities.Freelancer;

import java.util.List;

public class FreelancerRepository extends RepositoryGenerica<Freelancer>
{
	private static FreelancerRepository instance;

	public static FreelancerRepository getInstance()
	{
		if (instance == null)
			instance = new FreelancerRepository();
		return instance;
	}

	private FreelancerRepository()
	{
		super(Freelancer.class);
	}

	public List<Freelancer> findAllFreelancerBySurname(String surname)
	{
		return 	em.createQuery("SELECT f FROM Freelancer f WHERE surname LIKE :surname",Freelancer.class)
				.setParameter("surname", "%" + surname + "%")
				.getResultList();
	}

	public List<Freelancer> findAllFreelancerByAgeRange(int ageMin, int ageMax)
	{
		//JPQL
		return 	em.createQuery("SELECT f FROM Freelancer f WHERE age>=:am AND age<=:aM",Freelancer.class)
				.setParameter("am", ageMin)
				.setParameter("aM",ageMax)
				.getResultList();
	}

}

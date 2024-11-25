package com.generation.freelancerweb.model.repositories;


import com.generation.freelancerweb.model.entities.Employer;

public class EmployerRepository extends RepositoryGenerica<Employer>
{
	//SINGLETON
	private static EmployerRepository instance;

	public static EmployerRepository getInstance()
	{
		if (instance == null)
			instance = new EmployerRepository();
		return instance;
	}

	private EmployerRepository()
	{
		super(Employer.class);
	}
	//FINE SINGLETON


}

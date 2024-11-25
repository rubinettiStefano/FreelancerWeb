package com.generation.freelancerweb.helpers;


import com.generation.freelancerweb.model.entities.Employer;
import com.generation.freelancerweb.model.entities.Freelancer;
import com.generation.freelancerweb.model.repositories.EmployerRepository;
import com.generation.freelancerweb.model.repositories.FreelancerRepository;

import java.util.List;

public class ControllerHelper
{

	private static ControllerHelper instance;
	public static ControllerHelper getInstance()
	{
		if(instance == null)
			instance = new ControllerHelper();
		return instance;
	}
	private ControllerHelper(){}

	FreelancerRepository fRepo 	= FreelancerRepository.getInstance();
	EmployerRepository eRepo 	= EmployerRepository.getInstance();

	public String nomiTuttiFreelancer()
	{
		List<Freelancer> freelancers = fRepo.findAll();
		String nomi = "";

		for(Freelancer freelancer : freelancers)
			nomi+=freelancer.getName()+"\n";

		return nomi;
	}

	public String nomiTutteAziende()
	{
		List<Employer> aziende = eRepo.findAll();
		String nomi = "";

		for(Employer e : aziende)
			nomi+=e.getName()+"\n";

		return nomi;
	}

	public String nomiTuttiFreelanceEta(int ageMin, int ageMax)
	{
		List<Freelancer> freelancers = fRepo.findAllFreelancerByAgeRange(ageMin, ageMax);
		String nomi = "";

		for(Freelancer freelancer : freelancers)
			nomi+=freelancer.getName()+"\n";

		return nomi;
	}
}

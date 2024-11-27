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

	public Freelancer findOne(int id)
	{
		return fRepo.find(id);
	}

	public List<Freelancer> allFreelancer()
	{
		return fRepo.findAll();
	}
	public void inserisciFreelancer(String name,String surname,int age,String p_iva)
	{
		Freelancer f = new Freelancer();
		f.setName(name);
		f.setSurname(surname);
		f.setAge(age);
		f.setP_iva(p_iva);
		fRepo.insert(f);
	}

	public void deleteOneFreelancer(int id)
	{
		fRepo.delete(id);
	}

	public void modificaFreelancer(int id, String name, String surname, String pIva, int age)
	{
		Freelancer f = findOne(id);
		f.setName(name);
		f.setSurname(surname);
		f.setAge(age);
		f.setP_iva(pIva);
		fRepo.modify(f);
	}
}

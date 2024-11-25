package com.generation.freelancerweb.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	//public - ovunque
	//private - solo dentro la classe stessa
	//package/default all'interno dello stesso package
	//protected - package + tutti i sottotipi, dovunque essi siano


	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
}

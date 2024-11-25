package com.generation.freelancerweb.controllers;

import com.generation.freelancerweb.helpers.ControllerHelper;
import com.generation.freelancerweb.model.entities.Freelancer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "mostraTuttiFreelancer",value = "/mostraTuttiFreelancer")
public class MostraTuttiFreelancer extends HttpServlet
{
	private ControllerHelper helper = ControllerHelper.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		List<Freelancer> freelancers = helper.allFreelancer();
		//i dati che una Servlet passa ad una JSP vengono detti ATTRIBUTI
		//li allega all'oggetto req
		req.setAttribute("freelancersAttr", freelancers);
		//possiamo DROGARE (arricchire) la request con degli ATTRIBUTI

		req.getRequestDispatcher("mostraTuttiFreelancer.jsp").forward(req, resp);
	}
}

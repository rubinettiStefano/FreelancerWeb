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

@WebServlet(name = "formInsFree",value = "/formInsFree")
public class FormInsFreelancer extends HttpServlet
{

	//una richiesta Http possiede un VERBO (method)
	//ne parleremo approfonditamente in futuro
	//per ora parliamo di 2 di essi: GET e POST
	//allo stesso URL possono essere collegati più metodi di una SERVLET
	//quando io mando una richiesta a http://localhost:8080/FreelancerWeb_war_exploded/formsInsFree
	//non è detto che ci sia un solo metodo in ascolto
	//la request potrebbe avere come verbo GET
	//e in quel caso si attiva il metodo doGet
	//o potrebbe avere come verbo POST
	//e in quel caso si attiva doPost

	//request contengano un campo VERB
	//e la servlet faccia
	//switch(VERB)
	//	case "GET" -> doGet();
	//  case "POST"-> doPost();



	private ControllerHelper helper = ControllerHelper.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//mi mostrerà la form
		//tutte le request che mandate tramite barra del browser
		//o tramite LINK sono SEMPRE GET
		req.getRequestDispatcher("formInsFree.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//gestirà invece il submit della form
		//nelle form invece potete scegliere
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		int age = Integer.parseInt(req.getParameter("age"));
		String p_iva = req.getParameter("p_iva");

		helper.inserisciFreelancer(name, surname, age, p_iva);

		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
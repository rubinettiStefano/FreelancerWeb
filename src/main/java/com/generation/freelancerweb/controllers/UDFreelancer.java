package com.generation.freelancerweb.controllers;

import com.generation.freelancerweb.helpers.ControllerHelper;
import com.generation.freelancerweb.model.entities.Freelancer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "udFreelancer",value = "/udFreelancer")
public class UDFreelancer extends HttpServlet
{
	private ControllerHelper helper = ControllerHelper.getInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));

		if(req.getParameter("cmd").equals("delete"))
		{
			helper.deleteOneFreelancer(id);
			resp.sendRedirect("mostraTuttiFreelancer");
		}
		else if (req.getParameter("cmd").equals("update"))
		{
			helper.modificaFreelancer(id,req.getParameter("name"),req.getParameter("surname"),req.getParameter("p_iva"),Integer.parseInt(req.getParameter("age")));
			resp.sendRedirect("dettaglioFreelancer?id="+id);
		}

	}
}

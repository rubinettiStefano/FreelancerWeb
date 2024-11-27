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

@WebServlet(name = "dettaglioFreelancer",value = "/dettaglioFreelancer")
public class DettaglioFreelancer extends HttpServlet
{
	private ControllerHelper helper = ControllerHelper.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));
		Freelancer f = helper.findOne(id);
		req.setAttribute("freelancer", f);

		if(req.getParameter("modifica")!=null && req.getParameter("modifica").equals("true"))
			req.setAttribute("modifica",true);
		else
			req.setAttribute("modifica",false);

		req.getRequestDispatcher("jsp/dettaglioFreelancer.jsp").forward(req, resp);

	}
}

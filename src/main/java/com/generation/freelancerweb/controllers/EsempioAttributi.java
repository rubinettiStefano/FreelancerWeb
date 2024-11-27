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

@WebServlet(name = "esempioAttributi",value = "/esempioAttributi")
public class EsempioAttributi extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String tema = req.getParameter("tema");

		boolean temaScuro = tema.equals("S");

		req.setAttribute("temaScuro",temaScuro);
		req.getRequestDispatcher("jsp/esempioAttributi.jsp").forward(req,resp);
	}
}

package com.generation.freelancerweb.controllers;

import com.generation.freelancerweb.helpers.ControllerHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mostraTuttiFreelancer",value = "/mostraTuttiFreelancer")
public class MostraTuttiFreelancer extends HttpServlet
{
	private ControllerHelper helper = ControllerHelper.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String contenuto = helper.nomiTuttiFreelancer();

		resp.getWriter().print(contenuto);
	}
}

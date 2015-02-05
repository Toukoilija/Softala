package fi.softala.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.softala.helpers.EmailTools;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/email")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("vahvistus.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Haetaan käyttäjän syöttämä tieto
		String vastaus=request.getParameter("InputMessage");
		
		//Luodaan EmailTools-olio, joka lähettää sähköpostin haluttuun osoitteeseen
		EmailTools email = new EmailTools();
		email.lahetaSahkoposti("softalamail@gmail.com", "softala1", "softala2015@gmail.com",  "Palaute", vastaus);
		
		//Välitys seuraavalle jsp-sivulle
		response.sendRedirect("vahvistus.jsp");
	}
}
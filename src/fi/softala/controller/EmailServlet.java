package fi.softala.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.Message;

import fi.softala.bean.Email;
import fi.softala.helpers.EmailTools;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/EmailServlet")
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
		EmailTools email = new EmailTools();
		email.lahetaSahkoposti("softalamail@gmail.com",  "softala1", "aleksi.tilli@gmail.com","Palaute", "testi sisältö");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//muutetaan, kun tiedossa mitä tietoja sivulta tulee
		String answer = request.getParameter("html-form-string");
		
		EmailTools email = new EmailTools();
		email.lahetaSahkoposti("softalamail@gmail.com", "aleksi.tilli@gmail.com", "softala1", "Palaute", "testi sisältö");
		
		
		response.sendRedirect("vahvistus.jsp");
	}

}

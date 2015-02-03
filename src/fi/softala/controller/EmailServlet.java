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
		EmailTools email = new EmailTools();
	
		String jotain="";
		
		ArrayList<String> lista = new ArrayList<String>();
		
		Enumeration<String> e = request.getParameterNames();

		while(e.hasMoreElements()) {
			lista.add((String) e.nextElement());
		}
		for(int i=0; i<lista.size(); i++) {
			jotain=lista.get(i)+": "+request.getParameter(lista.get(i))+" ";
		}

		
		email.lahetaSahkoposti("softalamail@gmail.com", "softala1", "dekadenzdeville@gmail.com","Palaute", jotain);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//muutetaan, kun tiedossa mitä tietoja sivulta tulee
		
		String jotain="";
		ArrayList<String> lista = new ArrayList<String>();
		
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()) {
			lista.add((String) e.nextElement());
		}
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
			jotain=jotain+lista.get(i)+": "+request.getParameter(lista.get(i))+" ";
		}
		
		EmailTools email = new EmailTools();
		email.lahetaSahkoposti("softalamail@gmail.com", "softala1", "dekadenzdeville@gmail.com",  "Palaute", jotain);
		
		
		response.sendRedirect("vahvistus.jsp");
	}

}

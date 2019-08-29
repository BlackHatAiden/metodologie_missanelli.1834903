package it.uniroma1.fabbricasemantica.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name="AuthenticationServiceServlet", urlPatterns="/isLoggedIn.jsp")
public class AuthenticationServiceServlet extends BaseServlet {
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * il metodo controlla se l'utente e loggato oppure no attraverso una variabile booleana
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// L'oggetto writer scrive qualsiasi informazione si voglia restituire al chiamante 
		// (di solito ci si scrive la pagina html da restituire)
		// nel nostro caso ci scriviamo "true" o "false" a seconda se l'utente e' loggato o meno.
		
		
		HttpSession session = request.getSession();
		boolean isLoggedIn = session.getAttribute("username") != null;
		response.getWriter().write("\""+isLoggedIn+"\"" );
		
		//noon si riesce a comunicare bene con i file.java come se la chiamata json non avvenga
	}

}

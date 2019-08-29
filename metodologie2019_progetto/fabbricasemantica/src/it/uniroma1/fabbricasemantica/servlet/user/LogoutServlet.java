package it.uniroma1.fabbricasemantica.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name="LogoutServlet", urlPatterns="/logout.jsp")
public class LogoutServlet extends BaseServlet {
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * il metodo effettua il logout dell'utente attraverso il settaggio dello username a null e l'utente
	 * viene reindirizzato verso la pagina di login
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//TODO disconnettere l'utente dal sistema 
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("username", null);
		
		response.sendRedirect("login.html");
		
		
	}

}

package it.uniroma1.fabbricasemantica.servlet.user;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name="SignupServlet", urlPatterns="/signup.jsp")
public class SignupServlet extends BaseServlet 
{
	private static final long serialVersionUID = 8484501789787L;
	
	
	
	/**
	 * il metodo reindirizza l'utente verso la home una volta prese tutte le informazioni e salvate in un file
	 * sempre che siano valide altrimenti reindirizza nuovamente a signup 
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO implementare la logica per la registrazione
			
		
		//controllo inserimento stessa password e se sono stati inseriti i vari valori
		if(request.getParameter("email").equals("") || request.getParameter("password").equals("") || request.getParameter("password2").equals(""))
			
			response.sendRedirect("signup.html");
		
		else if( !(request.getParameter("password").equals(request.getParameter("password2"))) )
			response.sendRedirect("signup.html");
		
		else
		{
			
			
			File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
					+"Desktop"+File.separator+"Utenti.txt") ;

			FileWriter writer = new FileWriter(file,true) ;
			
			writer.write("\n");
			
			writer.write(request.getParameter("email"));
			
			writer.write("\t"+request.getParameter("password"));
			
			if(request.getParameter("checkBoxIta") != null)
				writer.write("\t"+"Italiano "+request.getParameter("levelIta"));
			else
				writer.write("\t"+"Italiano null");
			
			if(request.getParameter("checkBoxEng") != null)
				writer.write("\t"+"Inglese "+request.getParameter("levelEng"));
			else
				writer.write("\t"+"Inglese null");
			
			
			writer.close();
			
			
			response.sendRedirect("home.html");
			
		}
		
		
		
		
	}

}

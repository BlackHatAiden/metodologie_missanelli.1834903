package it.uniroma1.fabbricasemantica.servlet.user;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;


@WebServlet(name="LoginServlet", urlPatterns="/login.jsp")
public class LoginServlet extends BaseServlet 
{
	private static final long serialVersionUID = 8484501789787L;

	/**
	 * il metodo legge il file linea per linea controlla se trova email e password uguali a quelli inseriti
	 * se cosi fosse sett l'utente a loggato true e lo reindirizza verso la home altrimenti verso login
	 */
	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
				+"Desktop"+File.separator+"Utenti.txt") ;
		
		if(request.getParameter("email").equals("") || request.getParameter("password").equals(""))
				response.sendRedirect("login.html");
		else
		{
		try(BufferedReader reader = new BufferedReader(new FileReader(file)))
		{
			int var = 0 ; //variabile di comodo per poter reindirizzare bene
			
			 while(reader.ready())
			    {
				 String[] array =  reader.readLine().split("\t"); //serve per controllare email e password
						 
				 
				 if(!(array[0].equals(" ")) && request.getParameter("email").equals(array[0]) && request.getParameter("password").equals(array[1]))
				 {
					 HttpSession session = request.getSession() ;
					 session.setAttribute("username", request.getParameter("email"));
					 
					 
					 var++ ;
					
					 response.sendRedirect("home.html");
				 }
				 array = null ; //svuoto l'array
				
				}
			 if(var == 0)
				 response.sendRedirect("login.html");
		}
		catch(IOException e)
		{
			file.createNewFile();
			System.out.println("File non trovato") ;
			e.printStackTrace() ;	
		}
		}
		
	}

}

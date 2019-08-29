package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskWordAnnotationServlet", urlPatterns = "/wordAnnotation.jsp")
public class TaskWordAnnotationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
				+"Desktop"+File.separator+"Utenti.txt") ;

		FileWriter writer = new FileWriter(file,true) ;
		
		if(!(request.getParameter("traduzione").equals("")))
			writer.write("\t"+"-WA "+request.getParameter("traduzione"));
		else
			writer.write("\t"+"-WA null");
				
		writer.close();
				
				
		response.sendRedirect("definitionAnnotation.html");
	}

}

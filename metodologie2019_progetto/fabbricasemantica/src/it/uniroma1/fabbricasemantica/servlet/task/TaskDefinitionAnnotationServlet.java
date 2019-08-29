package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskDefinitionAnnotationServlet", urlPatterns = "/definitionAnnotation.jsp")
public class TaskDefinitionAnnotationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//il percorso del file posso renderlo non personalizzato potrei usare System.getProperty(user.dir)
		
		File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
				+"Desktop"+File.separator+"Utenti.txt") ;

		FileWriter writer = new FileWriter(file,true) ;
		
		if(!(request.getParameter("traduzione").equals("")))
			writer.write("\t"+"-DA "+request.getParameter("traduzione"));
		else
			writer.write("\t"+"-DA null");
		
		writer.close();
		
		response.sendRedirect("senseAnnotation.html");
		
		
		
	}

}

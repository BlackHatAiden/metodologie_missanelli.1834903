package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskMyAnnotationServlet", urlPatterns = "/myAnnotation.jsp")
public class TaskMyAnnotationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
				+"Desktop"+File.separator+"Utenti.txt") ;

		FileWriter writer = new FileWriter(file,true) ;
		
		if(!(request.getParameter("traduzione1").equals("")))
				writer.write("\t"+"-MA "+request.getParameter("traduzione1"));
		else
			writer.write("\t"+"-MA null");
		
		if(!(request.getParameter("traduzione2").equals("")))
			writer.write("\t"+request.getParameter("traduzione12"));
		else
			writer.write("\t"+"null");
		
		if(!(request.getParameter("traduzione3").equals("")))
			writer.write("\t"+request.getParameter("traduzione3"));
		else
			writer.write("\t"+"null");
		
		if(!(request.getParameter("traduzione4").equals("")))
			writer.write("\t"+request.getParameter("traduzione4"));
		else
			writer.write("\t"+"null");
		
		if(!(request.getParameter("traduzione5").equals("")))
			writer.write("\t"+request.getParameter("traduzione5"));
		else
			writer.write("\t"+"null");
		
		if(!(request.getParameter("traduzione6").equals("")))
			writer.write("\t"+request.getParameter("traduzione6"));
		else
			writer.write("\t"+"null");
		
		if(!(request.getParameter("traduzione7").equals("")))
			writer.write("\t"+request.getParameter("traduzione7"));
		else
			writer.write("\t"+"null");
		
				
		writer.close();
		
		response.sendRedirect("home.html");
	}

}

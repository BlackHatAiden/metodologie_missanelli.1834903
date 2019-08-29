package it.uniroma1.fabbricasemantica.servlet.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma1.fabbricasemantica.servlet.BaseServlet;

@WebServlet(name = "TaskTranslationValidationServlet", urlPatterns = "/translationValidation.jsp")
public class TaskTranslationValidationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doSomething(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
				
		File file = new File("C:"+File.separator+"Users"+File.separator+"matte"+File.separator
				+"Desktop"+File.separator+"Utenti.txt") ;

		FileWriter writer = new FileWriter(file,true) ;
						
		if(request.getParameter("frase1") != null)
			writer.write("\t"+"-TV "+"Signifiato1 ");
					
		else if(request.getParameter("frase2") != null)
			writer.write("\t"+"-TV "+" Signifiato2 ");
					
		else if(request.getParameter("frase3") != null)
			writer.write("\t"+"-TV "+" Signifiato3 ");
					
		else if(request.getParameter("frase4") != null)
			writer.write("\t"+"-TV "+" Signifiato4 ");
					
		else
			writer.write("\t"+"-TV null") ;
					
		writer.close();
						
		response.sendRedirect("senseValidation.html");
	}

}

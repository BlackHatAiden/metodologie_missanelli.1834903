package quickstart;

import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLTextAreaElement;
import def.jquery.JQueryXHR;
import def.js.JSON;

import static def.dom.Globals.window ;

public class DefinitionAnnotation 
{
	
	public static final String SERVLET_URL = "definitionAnnotation.jsp"; 
	
	public static final String REST_URL = "nextExample.jsp";
	
	public static final String AUTHENTICATION_URL = "isLoggedIn.jsp";
	
	public static final String LOGIN_URL = "login.html";
	
	public static final String HOME_URL = "home.html";
	
	public static final String LOGOUT_URL = "logout.jsp";
	
	public static void main(String[] args) 
	{
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL) //invio dati alla servlet
				 										   .method()
				                                           .build() ;
		
		
		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("3. Data la seguente parola e suo iperonimo,fornire una definizione")
																	.build() ;
		
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		HTMLLabelElement labelParola = new HTMLLabelElementBuilder().textContent("Parola ")
																	.build() ;
		
		
		HTMLDivElement divLabelParola = new HTMLDivElementBuilder().build();
		$(divLabelParola).append(labelParola);
		
		HTMLLabelElement labelHype = new HTMLLabelElementBuilder().textContent("iperonomio")
																	.build() ;


		HTMLDivElement divLabelHype = new HTMLDivElementBuilder().build();
		$(divLabelHype).append(labelHype);
		
		HTMLTextAreaElement casellaDefinizione = new HTMLTextAreaElementBuilder().className("form-control")
																				 .name("traduzione")
																				 .placeholder("Scrivi la traduzione qui...")
																				 .build() ;
		
		HTMLDivElement divDefinizione = new HTMLDivElementBuilder().build();
		$(divDefinizione).append(casellaDefinizione);
		
		
		HTMLInputElement bottoneNext = new HTMLInputElementBuilder().type("submit")
																	.name("Next")
																	.className("btn btn-primary")
																	.value("Next")
																	.build();
		
		
		HTMLInputElement bottoneSkip = new HTMLInputElementBuilder().type("submit")
																	.name("Skip")
																	.className("btn btn-primary")
																	.value("Skip")
																	.build();
		
		HTMLDivElement divButtons= new HTMLDivElementBuilder().className("form-group")
															.build();

		$(divButtons).append(bottoneNext).append(bottoneSkip);

		HTMLLabelElement labelLogout = new HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build() ;
		
		HTMLAnchorElement logout = new HTMLAnchorElementBuilder().href(LOGOUT_URL)
																.textContent(" Clicca qui")
																.build() ;

		
		HTMLAnchorElement linkHome = new HTMLAnchorElementBuilder().href(HOME_URL)
				                                                    .textContent("Home")
				                                                    .build();
		
		HTMLDivElement divLabelLogout = new HTMLDivElementBuilder().build();
		$(divLabelLogout).append(labelLogout).append(logout).append(linkHome);	
		
		
		
		
		$(form).append(divInizio);
		$(form).append(divLabelParola);
		$(form).append(divLabelHype);
		$(form).append(divDefinizione);
		$(form).append(divButtons);
		$(form).append(divLabelLogout);
		
		
		
		$("body").append(form);
		
		//formattazione estetica
		$(linkHome).css("float", "right"); 
		
		$(casellaDefinizione).width(1090) ;
		$(bottoneNext).width(200) ;
        $(bottoneSkip).width(200);
        $(bottoneNext).css("margin", "2% 0%");
        $(bottoneSkip).css("margin", "2% 0%");
        $(bottoneSkip).css("float", "right"); 
		
		$(form).css("margin", "1% 1.5%"); 
		
		$(labelLogout).css("color","white");
		
		
		$(labelParola).css("color","white");
		
		$(labelHype).css("color","white");
		
		$(labelInizio).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		//chiamata a servlet per prelevare dati
		$.getJSON(REST_URL, "task=DEFINITION_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			
			String sWord = json.$get("word"); 
			String sHypernym = json.$get("hypernym"); 
			
			$(labelParola).text(sWord);
			$(labelHype).text(sHypernym);
			
			return null;
		});
		
		//chiamata a servlet per verificare se l'utente e loggato
		$.getJSON(AUTHENTICATION_URL, (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			String sLogin = json.$get("isLoggedIn") ;
			
			if(sLogin.equals("false"))
				window.location.href = LOGIN_URL ;
			
			return null;
		});

	}

}

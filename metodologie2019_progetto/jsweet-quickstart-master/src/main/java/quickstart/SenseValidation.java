package quickstart;

import static def.dom.Globals.window;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.jquery.JQueryXHR;
import def.js.JSON;

public class SenseValidation 
{
	public static final String SERVLET_URL = "senseValidation.jsp";
	
	public static final String REST_URL = "nextExample.jsp";
	
	public static final String AUTHENTICATION_URL = "isLoggedIn.jsp";
	
	public static final String LOGIN_URL = "login.html";
	
	

	public static void main(String[] args) 
	{
		
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL)
														   .method()
										                   .build() ;

		
		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("6. Data una parola e una frase in cui appare scegliere se ha senso oppure no")
																	.build() ;
		
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		HTMLLabelElement labelParola = new HTMLLabelElementBuilder().textContent("Frase da mettere")
																	.build() ;
		
		HTMLDivElement divLabelParola = new HTMLDivElementBuilder().build();
		$(divLabelParola).append(labelParola);
		
		HTMLLabelElement labelEsempio = new HTMLLabelElementBuilder().textContent("Frase da mettere")
																	.build() ;

		HTMLDivElement divLabelEsempio = new HTMLDivElementBuilder().build();
		$(divLabelEsempio).append(labelEsempio);
		
		HTMLLabelElement labelSense = new HTMLLabelElementBuilder().textContent("Sense da mettere")
																	.build() ;

		HTMLDivElement divLabelSense = new HTMLDivElementBuilder().build();
		$(divLabelSense).append(labelSense);
		
		
		HTMLLabelElement labelSi = new HTMLLabelElementBuilder().textContent("Si")
																.build() ;
				
		HTMLInputElement radioButtonsSi = new HTMLInputElementBuilder().type("radio")
																		.name("radioSi")
																		.value("Si")
																		.build();

		HTMLDivElement divRadioButtons1= new HTMLDivElementBuilder().className("form-group")
																	.build();
		
		$(divRadioButtons1).append(radioButtonsSi).append(labelSi);
		
		HTMLLabelElement labelNo = new HTMLLabelElementBuilder().textContent("No")
																.build();
		
		HTMLInputElement radioButtonsNo = new HTMLInputElementBuilder().type("radio")
																		.name("radioNo")
																		.value("No")
																		.build();
		
		
		HTMLDivElement divRadioButtons2= new HTMLDivElementBuilder().className("form-group")
																	.build();

		$(divRadioButtons2).append(radioButtonsNo).append(labelNo);
		
		
		HTMLInputElement bottoneNext = new HTMLInputElementBuilder().type("submit")
																	.className("btn btn-primary")
																	.name("Next")
																	.value("Next")
																	.build();
		
		HTMLDivElement divButtons= new HTMLDivElementBuilder().className("form-group")
															.build();
		
		HTMLInputElement bottoneSkip = new HTMLInputElementBuilder().type("submit")
																	.name("Skip")
																	.className("btn btn-primary")
																	.value("Skip")
																	.build();

		$(divButtons).append(bottoneNext).append(bottoneSkip);
		
		
		HTMLLabelElement labelLogout = new HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ")
																	.build() ;
		
		HTMLAnchorElement logout = new HTMLAnchorElementBuilder().href("logout.jsp")
																.textContent(" Clicca qui")
																.build() ;
													
		HTMLAnchorElement linkHome = new HTMLAnchorElementBuilder().href("home.html")
													                .textContent("Home")
													                .build();
															

		HTMLDivElement divLabelLogout = new HTMLDivElementBuilder().build();
		$(divLabelLogout).append(labelLogout).append(logout).append(linkHome);

				
		$(form).append(divInizio);
		$(form).append(divLabelParola);
		$(form).append(divLabelEsempio);
		$(form).append(divLabelSense);
		
		$(form).append(divRadioButtons1) ;
		$(form).append(divRadioButtons2) ;
		
		$(form).append(divButtons);
		
		$(form).append(divLabelLogout);
		
		
		$("body").append(form);
		
		
		$(linkHome).css("float", "right"); 
		
		$(bottoneNext).width(200) ;
        $(bottoneSkip).width(200);
        
        $(bottoneSkip).css("float", "right"); 
        
		$(bottoneNext).css("margin", "2% 0%") ;
		$(bottoneSkip).css("margin", "2% 0%") ;
		
		$(form).css("margin", "1% 1.5%"); 
		
		$(labelLogout).css("color","white");
		
		
		$(labelParola).css("color","white");
		$(labelEsempio).css("color","white");
		$(labelSense).css("color","white");

		
		$(labelSi).css("color","white");
		
		$(labelNo).css("color","white");
		
		
		$(labelInizio).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		


		$.getJSON(REST_URL, "task=SENSE_VALIDATION", (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			String sWord = json.$get("word"); 
			String sExample = json.$get("example"); 
			String sSense = json.$get("sense");
			
			$(labelParola).text(sWord);
			$(labelEsempio).text(sExample);
			
			$(labelSense).text(sSense);
			return null;
		});
		
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

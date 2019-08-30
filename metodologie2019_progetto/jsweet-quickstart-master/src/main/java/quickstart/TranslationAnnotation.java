package quickstart;

import static def.jquery.Globals.$;
import static def.dom.Globals.window;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLTextAreaElement;
import def.jquery.JQueryXHR;
import def.js.JSON;


public class TranslationAnnotation 
{
	public static final String SERVLET_URL = "translationAnnotation.jsp";
	
	public static final String REST_URL = "nextExample.jsp";
	
	public static final String AUTHENTICATION_URL = "isLoggedIn.jsp";
	
	public static final String LOGIN_URL = "login.html";
	
	public static final String HOME_URL = "home.html";
	
	public static final String LOGOUT_URL = "logout.jsp";
	
	

	public static void main(String[] args) 
	{
		
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL)
														   .method()
										                .build() ;

		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("1. Data la seguente parola e definizione,fornire una traduzione")
																	.build() ;
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		HTMLLabelElement labelParola = new HTMLLabelElementBuilder().textContent("Parola da mettere")
																	.build() ;
		
		HTMLDivElement divLabelParola = new HTMLDivElementBuilder().build();
		$(divLabelParola).append(labelParola);
		
		HTMLLabelElement labelDescrizione = new HTMLLabelElementBuilder().textContent("Definizione da mettere")
																	.build() ;
		
		
		HTMLDivElement divLabelDescrizione = new HTMLDivElementBuilder().build();
		$(divLabelDescrizione).append(labelDescrizione);
		
		HTMLTextAreaElement casellaTraduzione = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();
		
		HTMLDivElement divTraduzione = new HTMLDivElementBuilder().build();
		$(divTraduzione).append(casellaTraduzione);
		
		
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
		$(form).append(divLabelDescrizione);
		$(form).append(divTraduzione);
		
		
		$(form).append(divButtons);
		$(form).append(divLabelLogout);
		
		
		$("body").append(form);
		
		$(linkHome).css("float", "right"); 
		
		$(casellaTraduzione).width(1090) ;
		
		$(bottoneNext).width(200) ;
        $(bottoneSkip).width(200);
        
		$(bottoneNext).css("margin", "2% 0%") ;
		
	    $(bottoneSkip).css("margin", "2% 0%");
	    $(bottoneSkip).css("float", "right"); 
			
		
		$(form).css("margin", "1% 1.5%"); 
		
		$(labelLogout).css("color","white");
		
		
		$(labelParola).css("color","white");
		$(labelDescrizione).css("color","white");
		
		$(labelInizio).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		$.getJSON(REST_URL, "task=TRANSLATION_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			
			String sWord = json.$get("word"); 
			String sDescription = json.$get("description"); 
			
			$(labelParola).text(sWord);
			$(labelDescrizione).text(sDescription);
			
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

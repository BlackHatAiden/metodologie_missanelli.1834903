package quickstart;

import static def.dom.Globals.window;
import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLTextAreaElement;
import def.jquery.JQueryXHR;
import def.js.JSON;

public class MyAnnotation 
{
	public static final String SERVLET_URL = "myAnnotation.jsp";
	
	public static final String REST_URL = "nextExample.jsp";
	
	public static final String AUTHENTICATION_URL = "isLoggedIn.jsp";
	
	public static final String LOGIN_URL = "login.html";

	public static void main(String[] args) 
	{
		
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL)
														   .method()
														   .build() ;

		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("7.Trdauci le seguenti parole nella tua lingua nativa")
																	.build() ;
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		
		
		HTMLLabelElement labelParola1 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																	.build() ;
		
		HTMLTextAreaElement casellaTraduzione1 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione1")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();
		
		HTMLDivElement divParola1 = new HTMLDivElementBuilder().build();
		$(divParola1).append(labelParola1).append(casellaTraduzione1);
		
		HTMLLabelElement labelParola2 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																		.build() ;
		
		HTMLTextAreaElement casellaTraduzione2 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione2")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola2 = new HTMLDivElementBuilder().build();
		$(divParola2).append(labelParola2).append(casellaTraduzione2);
		
		HTMLLabelElement labelParola3 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																		.build() ;
		
		HTMLTextAreaElement casellaTraduzione3 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione3")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola3 = new HTMLDivElementBuilder().build();
		$(divParola3).append(labelParola3).append(casellaTraduzione3);
		
		
		HTMLLabelElement labelParola4 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																	.build() ;
		
		HTMLTextAreaElement casellaTraduzione4 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione4")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola4 = new HTMLDivElementBuilder().build();
		$(divParola4).append(labelParola4).append(casellaTraduzione4);
		
		HTMLLabelElement labelParola5 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																	.build() ;
			
		HTMLTextAreaElement casellaTraduzione5 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione5")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola5 = new HTMLDivElementBuilder().build();
		$(divParola5).append(labelParola5).append(casellaTraduzione5);
		
		HTMLLabelElement labelParola6 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																	.build() ;
		
		HTMLTextAreaElement casellaTraduzione6 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione6")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola6 = new HTMLDivElementBuilder().build();
		$(divParola6).append(labelParola6).append(casellaTraduzione6);
		
		HTMLLabelElement labelParola7 = new HTMLLabelElementBuilder().textContent("parola da tradurre")
																	.build() ;
		
		
		HTMLTextAreaElement casellaTraduzione7 = new HTMLTextAreaElementBuilder().className("form-control")
																				.name("traduzione7")
																				.placeholder("Scrivi la traduzione qui...")
																				.build();

		HTMLDivElement divParola7 = new HTMLDivElementBuilder().build();
		$(divParola7).append(labelParola7).append(casellaTraduzione7);
		
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
		
		HTMLAnchorElement logout = new HTMLAnchorElementBuilder().href("logout.jsp")
																.textContent(" Clicca qui")
																.build() ;
													
		HTMLAnchorElement linkHome = new HTMLAnchorElementBuilder().href("home.html")
													                .textContent("Home")
													                .build();
															
		
		

		HTMLDivElement divLabelLogout = new HTMLDivElementBuilder().build();
		$(divLabelLogout).append(labelLogout).append(logout).append(linkHome);	
		
		
		
		$(form).append(divInizio);
		
		$(form).append(divParola1);
		
		$(form).append(divParola2);
		
		$(form).append(divParola3);
		
		$(form).append(divParola4);
		
		$(form).append(divParola5);
		
		$(form).append(divParola6);
		
		$(form).append(divParola7);
		
		$(form).append(divButtons);
		
		$(form).append(divLabelLogout);
		
		$("body").append(form);
		
		
		
		$(bottoneNext).width(200) ;
		$(bottoneSkip).width(200);
		 
		$(bottoneNext).css("margin", "2% 0%") ;
	
		$(bottoneSkip).css("margin", "2% 0%");
	    $(bottoneSkip).css("float", "right"); 
		
		
		$(linkHome).css("float", "right"); 
		
		
		
		$(labelLogout).css("color","white");
		
		
		$(labelParola1).css("color","white");
		$(labelParola2).css("color","white");
		$(labelParola3).css("color","white");
		$(labelParola4).css("color","white");
		$(labelParola5).css("color","white");
		$(labelParola6).css("color","white");
		$(labelParola7).css("color","white");
		
		$(labelInizio).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		
		$(form).css("margin", "1% 1.5%"); 

		$.getJSON(REST_URL, "task=MY_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			
			String sWord1 = json.$get("word1");
			String sWord2 = json.$get("word2");
			String sWord3 = json.$get("word3");
			String sWord4 = json.$get("word4");
			String sWord5 = json.$get("word5");
			String sWord6 = json.$get("word6");
			String sWord7 = json.$get("word7");
			
			$(labelParola1).text(sWord1);
			$(labelParola2).text(sWord2);
			$(labelParola3).text(sWord3);
			$(labelParola4).text(sWord4);
			$(labelParola5).text(sWord5);
			$(labelParola6).text(sWord6);
			$(labelParola7).text(sWord7);
			
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

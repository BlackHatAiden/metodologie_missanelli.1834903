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

public class SenseAnnotation 
{
	public static final String SERVLET_URL = "senseAnnotation.jsp";
	
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

		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("4. Selezione il significato più corretto della parola nelle seguenti frasi")
																	.build() ;
		
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		HTMLLabelElement labelParola = new HTMLLabelElementBuilder().textContent("Frase da mettere")
																	.build() ;
		
		HTMLDivElement divLabelParola = new HTMLDivElementBuilder().build();
		$(divLabelParola).append(labelParola);
		
		HTMLLabelElement labelDescrizione = new HTMLLabelElementBuilder().textContent("Frase da mettere")
																		.build() ;

		HTMLDivElement divLabelDescrizione = new HTMLDivElementBuilder().build();
		$(divLabelDescrizione).append(labelDescrizione);
		
		
		
		HTMLInputElement check1 = new HTMLInputElementBuilder().type("checkbox")
																.name("frase1")
																.build();
		
		HTMLLabelElement labelCheck1 = new HTMLLabelElementBuilder().textContent("  aaa")
																	.build() ;
		
		HTMLDivElement divCheck1= new HTMLDivElementBuilder().className("form-group")
															.build();
		
		$(divCheck1).append(check1).append(labelCheck1);
		
		HTMLInputElement check2 = new HTMLInputElementBuilder().type("checkbox")
																.name("frase2")
																.build();
		
		HTMLLabelElement labelCheck2 = new HTMLLabelElementBuilder().textContent("  bbb")
																	.build() ;

		
		HTMLDivElement divCheck2= new HTMLDivElementBuilder().className("form-group")
																.build();
		
		$(divCheck2).append(check2).append(labelCheck2);
		
		HTMLInputElement check3 = new HTMLInputElementBuilder().type("checkbox")
																.name("frase3")
																.build();

		HTMLLabelElement labelCheck3 = new HTMLLabelElementBuilder().textContent("  ccc")
																	.build() ;
		
		
		HTMLDivElement divCheck3 = new HTMLDivElementBuilder().className("form-group")
																.build();
		
		$(divCheck3).append(check3).append(labelCheck3);
		
		HTMLInputElement check4 = new HTMLInputElementBuilder().type("checkbox")
																.name("frase4")
																.build();

		HTMLLabelElement labelCheck4 = new HTMLLabelElementBuilder().textContent("  ddd")
																	.build() ;
		
		
		HTMLDivElement divCheck4 = new HTMLDivElementBuilder().className("form-group")
																.build();
		
		$(divCheck4).append(check4).append(labelCheck4);
		
		
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
		
		$(form).append(divCheck1);
		$(form).append(divCheck2);
		$(form).append(divCheck3);
		$(form).append(divCheck4);
		
		$(form).append(divButtons);
		
		$(form).append(divLabelLogout);
		
		
		$("body").append(form);
		
		$(linkHome).css("float", "right"); 
		
		$(bottoneNext).width(200) ;
        $(bottoneSkip).width(200);
        $(bottoneNext).css("margin", "2% 0%");
        $(bottoneSkip).css("margin", "2% 0%");
        
        $(bottoneSkip).css("float", "right"); 
	
		
		$(form).css("margin", "1% 1.5%"); 
		
		$(labelLogout).css("color","white");
		
		
		$(labelParola).css("color","white");
		$(labelDescrizione).css("color","white");
		$(labelCheck1).css("color","white");
		$(labelCheck2).css("color","white");
		$(labelCheck3).css("color","white");
		$(labelCheck4).css("color","white");
		
		$(labelInizio).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		$.getJSON(REST_URL, "task=SENSE_ANNOTATION", (Object result, String a, JQueryXHR ctx) -> 
		{
			JSON json = (JSON) result;
			String sWord = json.$get("word"); 
			String sDescription = json.$get("description"); 
			
			String sSenses1 = json.$get("senses1");
			String sSenses2 = json.$get("senses2");
			String sSenses3 = json.$get("senses3");
			String sSenses4 = json.$get("senses4");
			
			$(labelParola).text(sWord);
			$(labelDescrizione).text(sDescription);
			
			$(labelCheck1).text(sSenses1);
			$(labelCheck2).text(sSenses2);
			$(labelCheck3).text(sSenses3);
			$(labelCheck4).text(sSenses4);
			
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

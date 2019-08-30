package quickstart;


import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;



public class Login 
{
	public static final String SERVLET_URL = "login.jsp";
	
	public static final String SIGNUP_URL = "signup.html";
	
	
	
	
	public static void main(String[] args)
	{
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL)
														   .method()
										                   .build() ;
		
		
		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("Accedi a FabbricaSemantica")
																	.build() ;
		
		
		
		HTMLDivElement divInizio = new HTMLDivElementBuilder().build();
		$(divInizio).append(labelInizio);
		
		HTMLLabelElement labelEmail = new HTMLLabelElementBuilder().textContent("Email:")
																	.build() ;
		
		
		
		HTMLDivElement divLabelEmail = new HTMLDivElementBuilder().build();
		$(divLabelEmail).append(labelEmail);
		
		HTMLInputElement casellaEmail = new HTMLInputElementBuilder().type("Email")
																	.name("email")
																	.placeholder("Inserire Email")
																	.build();
		
		HTMLDivElement divEmail = new HTMLDivElementBuilder().build();
		$(divEmail).append(casellaEmail);
		
		HTMLLabelElement labelPassword = new HTMLLabelElementBuilder().textContent("Password:")
																	.build() ;
		
		
		HTMLDivElement divLabelPas = new HTMLDivElementBuilder().build();
		$(divLabelPas).append(labelPassword);
		
		HTMLInputElement casellaPassword = new HTMLInputElementBuilder().type("Password")
																		.name("password")
																		.placeholder("Inserire Password")
																		.build();
	
		
		HTMLDivElement divPas = new HTMLDivElementBuilder().build();
		$(divPas).append(casellaPassword);
		
		HTMLInputElement bottoneLogin = new HTMLInputElementBuilder().type("submit")
																	.name("login")
																	.className("btn btn-primary")
																	.value("login")
																	.build();
		
		
		
		HTMLDivElement divButtons= new HTMLDivElementBuilder().className("form-group")
																.build();
		$(divButtons).append(bottoneLogin);
		
		
		HTMLLabelElement labelSignup = new HTMLLabelElementBuilder().textContent("Nuovo su FabbricaSemantica ? ")
																	.build() ;
		
		
		HTMLAnchorElement link = new HTMLAnchorElementBuilder().textContent(" Crea un Account.")
																.href(SIGNUP_URL)
																.build();
		
		
		
		HTMLDivElement divSignup= new HTMLDivElementBuilder().build();
		$(divSignup).append(labelSignup).append(link);
		
		
		
		
		
		$(form).append(divInizio) ;
		
		$(form).append(divLabelEmail) ;
		$(form).append(divEmail);
		$(form).append(divLabelPas) ;
		$(form).append(divPas);
		
		$(form).append(divButtons);
		$(form).append(divSignup);
		
		
		$("body").append(form);
		
		$(labelInizio).css("font-size","200%") ;  
        $(labelInizio).css(" font-weight","bolder") ;
        $(labelInizio).css("margin","7%") ;
        $(bottoneLogin).css("margin","1% 0%") ;
		$(bottoneLogin).width(300) ;
		$(casellaEmail).width(300) ;
		$(casellaPassword).width(300) ;
        
		
		$(labelInizio).css("color","white");
		$(labelEmail).css("color","white");
		$(labelPassword).css("color","white");
		$(labelSignup).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		
		$(form).css("margin", "5% 40%");
		
		
		
	}

}

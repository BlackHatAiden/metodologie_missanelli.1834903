package quickstart;


import static def.jquery.Globals.$;

import def.dom.HTMLAnchorElement;
import def.dom.HTMLDivElement;
import def.dom.HTMLFormElement;
import def.dom.HTMLInputElement;
import def.dom.HTMLLabelElement;
import def.dom.HTMLOptionElement;
import def.dom.HTMLSelectElement;


public class Signup 
{
	public static final String SERVLET_URL = "signup.jsp";

	public static void main(String[] args) 
	{
		
		HTMLFormElement form = new HTMLFormElementBuilder().action(SERVLET_URL)
														   .method()
										                .build() ;

		
		HTMLLabelElement labelInizio = new HTMLLabelElementBuilder().textContent("Iscriviti a FabbricaSemantica")
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
		
		HTMLLabelElement labelPassword2 = new HTMLLabelElementBuilder().textContent("Password:")
																		.build() ;

		
		HTMLDivElement divLabelPas2 = new HTMLDivElementBuilder().build();
		$(divLabelPas2).append(labelPassword2);
		
		HTMLInputElement casellaPassword2 = new HTMLInputElementBuilder().type("Password")
																		.name("password2")
																		.placeholder("Inserire Password")
																		.build();

		
		HTMLDivElement divPas2 = new HTMLDivElementBuilder().build();
		$(divPas2).append(casellaPassword2);
		
		
		HTMLLabelElement labelMadreLingua = new HTMLLabelElementBuilder().textContent("Selezionare il livello della tua lingua ")
																		.build() ;
		
		HTMLDivElement divMadreLingua = new HTMLDivElementBuilder().build();
		$(divMadreLingua).append(labelMadreLingua);
		
		HTMLLabelElement labelItaliano = new HTMLLabelElementBuilder().textContent("Italiano")
																	.build() ;
		
		
		HTMLInputElement checkBoxIta = new HTMLInputElementBuilder().type("checkbox")
																	.name("checkBoxIta")
																	.build();
		
		HTMLOptionElement M = new HTMLOptionElementBuilder().text("Madrelingua")
															.build();
		
		HTMLOptionElement A1 = new HTMLOptionElementBuilder().text("A1")
															.build();
		HTMLOptionElement A2 = new HTMLOptionElementBuilder().text("A2")
															.build();
		
		HTMLOptionElement B1 = new HTMLOptionElementBuilder().text("B1")
															.build();
		
		HTMLOptionElement B2 = new HTMLOptionElementBuilder().text("B2")
															.build();
		
		HTMLOptionElement C1 = new HTMLOptionElementBuilder().text("C1")
															.build();
		
		HTMLOptionElement C2 = new HTMLOptionElementBuilder().text("C2")
															.build();
		
		HTMLSelectElement levelIta = new HTMLSelectElementBuilder().name("levelIta")
																	.build();
		$(levelIta).append(M,A1,A2,B1,B2,C1,C2) ;
		
		HTMLDivElement divLingua = new HTMLDivElementBuilder().className("form-group")
				  .build();
		
		$(divLingua).append(checkBoxIta).append(labelItaliano).append(levelIta);
		
		
		
		
		HTMLLabelElement labelInglese = new HTMLLabelElementBuilder().textContent("Inglese")
																		.build() ;


		HTMLInputElement checkBoxEng = new HTMLInputElementBuilder().type("checkbox")
																	.name("checkBoxEng")
																	.build();
		
		HTMLOptionElement MM = new HTMLOptionElementBuilder().text("Madrelingua")
															.build();
		
		HTMLOptionElement A11 = new HTMLOptionElementBuilder().text("A1")
																.build();
		HTMLOptionElement A22 = new HTMLOptionElementBuilder().text("A2")
																.build();

		HTMLOptionElement B11 = new HTMLOptionElementBuilder().text("B1")
																.build();

		HTMLOptionElement B22 = new HTMLOptionElementBuilder().text("B2")
																.build();

		HTMLOptionElement C11 = new HTMLOptionElementBuilder().text("C1")
																.build();

		HTMLOptionElement C22 = new HTMLOptionElementBuilder().text("C2")
																.build();
		
		
		HTMLSelectElement levelEng = new HTMLSelectElementBuilder().name("levelEng")
																	.build();
		$(levelEng).append(MM,A11,A22,B11,B22,C11,C22) ;
		
		HTMLDivElement divLingua2 = new HTMLDivElementBuilder().className("form-group")
				.build();
		
		$(divLingua2).append(checkBoxEng).append(labelInglese).append(levelEng);
		
		
		HTMLInputElement bottoneSignup = new HTMLInputElementBuilder().type("submit")
																	  .name("Signup")
																	  .className("btn btn-primary")
																	  .value("Signup") 
																	  .src("signup.jsp")
																	  .build();
		
		
		
		HTMLDivElement divButtons= new HTMLDivElementBuilder().className("form-group")
																.build();
		
		$(divButtons).append(bottoneSignup);
		
		HTMLLabelElement labelLogin = new HTMLLabelElementBuilder().build() ;
		labelLogin.textContent = "Sei già registrato ? ";
		
		HTMLAnchorElement link = new HTMLAnchorElementBuilder().textContent(" Accedi a Fabbricasemantica")
																.href("login.html")
																.build();
		
		HTMLDivElement divLink= new HTMLDivElementBuilder().className("form-group")
															.build();
		$(divLink).append(labelLogin).append(link);

		
		
		$(form).append(divInizio);
		$(form).append(divLabelEmail);
		$(form).append(divEmail);
		$(form).append(divLabelPas);
		$(form).append(divPas);
		$(form).append(divLabelPas2);
		$(form).append(divPas2);
		$(form).append(divMadreLingua);
		
		$(form).append(divLingua);
		
		
		$(form).append(divLingua2);
		
		
		$(form).append(divButtons);
		
		$(form).append(divLink);
		
		
		$("body").append(form);
		
		$(labelInizio).css("font-size","200%") ;  
        $(labelInizio).css(" font-weight","bolder") ;
        $(labelMadreLingua).css("margin", "2% 0%");
		$(casellaEmail).width(300) ;
		$(casellaPassword).width(300) ;
		$(casellaPassword2).width(300) ;
		
		$(labelItaliano).css("margin", "0% 2.5%");
        $(labelInglese).css("margin", "0% 2.5%");
		
		$(bottoneSignup).width(300) ;
		$(bottoneSignup).css("margin", "2% 0%") ;
		
		
		
		$(labelInizio).css("color","white");
		$(labelEmail).css("color","white");
		$(labelPassword).css("color","white");
		$(labelLogin).css("color","white");
		$(labelPassword2).css("color","white");
		$(labelInglese).css("color","white");
		$(labelItaliano).css("color","white");
		$(labelMadreLingua).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
		
        $(form).css("margin", "0% 1.5%"); 
		

	}

}

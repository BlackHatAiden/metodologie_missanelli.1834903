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

public class Home 
{
	public static final String REST_URL = "nextExample.jsp";
	
	public static final String AUTHENTICATION_URL = "isLoggedIn.jsp";
	
	public static final String LOGIN_URL = "login.html";
	
	public static final String LOGOUT_URL = "logout.jsp";

	public static void main(String[] args) 
	{
		
		
		HTMLFormElement form = new HTMLFormElementBuilder().action("translationAnnotation.html")
														   .method()
														   .build() ;
		
												
		
		
		HTMLInputElement image = new HTMLInputElementBuilder().type("image")
															  .src("https://st.depositphotos.com/1745180/1354/i/950/depositphotos_13547685-stock-photo-play-button.jpg)")
															  .build();
	
		
		HTMLDivElement divImgLinkata = new HTMLDivElementBuilder().build();
		$(divImgLinkata).append(image);
		
		
		
		HTMLLabelElement labelLogout = new HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build() ;
		
		HTMLAnchorElement logout = new HTMLAnchorElementBuilder().href(LOGOUT_URL)
																.textContent(" Clicca qui")
																.build() ;
		
		
		HTMLDivElement divLabelLogout = new HTMLDivElementBuilder().build();
		$(divLabelLogout).append(labelLogout).append(logout);		
		
		
		$(form).append(divImgLinkata) ;
		$(form).append(divLabelLogout) ;
		
		
		$("body").append(form);
		
		
		
		$(image).width(250) ;
		$(image).css("margin", "10% 38%");
		
		$(labelLogout).css("color","white");
		
		$("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
		
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

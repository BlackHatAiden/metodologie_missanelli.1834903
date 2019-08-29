package quickstart;

import def.dom.HTMLFormElement;
import static def.dom.Globals.document;
import jsweet.util.StringTypes;

public class HTMLFormElementBuilder 
{

	private HTMLFormElement form = document.createElement(StringTypes.form);
	
	/**
	 * il metodo imposta il contenuto testuale da visualizzare
	 * @param s stringa
	 * @return this
	 */
	public HTMLFormElementBuilder  textContent(String s)
	{
		form.textContent = s ;
		
		return this ;
	}
	
	/**
	 * il metodo permette di impostare a quale URL inviare i dati
	 * @param s stringa
	 * @return this
	 */
	public HTMLFormElementBuilder  action(String s)
	{
		form.action = s ;
		
		return this ;
	}
	
	/**
	 * il metodo se serve viene impostato di default a POST
	 * @param s stringa
	 * @return this
	 */
	public HTMLFormElementBuilder  method()
	{
		form.method = "POST" ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return form
	 */
	public HTMLFormElement build()
	{
		
		return form ;
	}
		

}

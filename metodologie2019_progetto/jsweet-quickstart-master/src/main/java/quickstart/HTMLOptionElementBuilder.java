package quickstart;

import static def.dom.Globals.document;

import def.dom.HTMLOptionElement;
import jsweet.util.StringTypes;

public class HTMLOptionElementBuilder 
{
	private HTMLOptionElement option = document.createElement(StringTypes.option) ;
	
	/**
	 * il metodo preso in input una stringa imposta il testo dell'opzione
	 * @param s stringa
	 * @return this
	 */
	public HTMLOptionElementBuilder text(String s)
	{
		option.text = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return option
	 */
	public HTMLOptionElement build()
	{
		
		return option ;
	}

	
}

package quickstart;

import static def.dom.Globals.document;

import def.dom.HTMLSelectElement;
import jsweet.util.StringTypes;

public class HTMLSelectElementBuilder 
{
	private HTMLSelectElement  select = document.createElement(StringTypes.select);;
	
	/**
	 * il metodo imposta il nome della select
	 * @param s stringa
	 * @return this
	 */
	public HTMLSelectElementBuilder name(String s)
	{
		select.name = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return select
	 */
	public HTMLSelectElement build()
	{	
		return select ;
	}

	
}

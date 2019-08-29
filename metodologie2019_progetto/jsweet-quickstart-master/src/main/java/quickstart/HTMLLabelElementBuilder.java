package quickstart;

import def.dom.HTMLLabelElement;

import jsweet.util.StringTypes;
import static def.dom.Globals.document;

public class HTMLLabelElementBuilder 
{
	private HTMLLabelElement label = document.createElement(StringTypes.label); ;
	 
	
	/**
	 * il metodo imposta il testo della label
	 * @param s stringa
	 * @return this
	 */
	public HTMLLabelElementBuilder textContent(String s)
	{
		label.textContent = s ;
		
		return this ;
	}
	
	
	/**
	 * il metodo  aggiunge paramnetro className impostandolo attraverso la stringa
	 * @param s stringa
	 * @return this
	 */
	public HTMLLabelElementBuilder className(String s)
	{
		label.className = s ;
		
		return this ;
	}
	
	/**
	 * il metodo imposta il setAttribut basandosi su due stringhe tipo e valore
	 * @param name tipo
	 * @param value valore
	 * @return this
	 */
	public HTMLLabelElementBuilder setAttribute(String name,String value)
	{
		label.setAttribute(name,value) ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return label
	 */
	public HTMLLabelElement build()
	{
		return label ;
	}

	
}

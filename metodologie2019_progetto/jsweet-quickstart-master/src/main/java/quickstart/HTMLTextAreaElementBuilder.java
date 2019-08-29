package quickstart;

import def.dom.HTMLTextAreaElement;
import static def.dom.Globals.document;
import jsweet.util.StringTypes;

public class HTMLTextAreaElementBuilder 
{
	
	private HTMLTextAreaElement textArea = document.createElement(StringTypes.textarea);
	
	/**
	 * il metodo imposta il parametro name basandosi su una stringa
	 * @param name stringa
	 * @return this
	 */
	public HTMLTextAreaElementBuilder name(String name)
	{
		textArea.name = name ;
		
		return this ;
	}
	
	/**
	 * il metodo imposta il className prendendo in input una stringa
	 * @param s stringa
	 * @return this
	 */
	public HTMLTextAreaElementBuilder className(String s)
	{
		textArea.className = s ;
		
		return this ;
	}
	
	/**
	 * il metodo imposta il parametro placeHolder quindi la stringa da visualizzare nella
	 * casella vuota
	 * @param s stringa
	 * @return this
	 */
	public HTMLTextAreaElementBuilder placeholder(String s)
	{
		textArea.placeholder = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return textArea
	 */
	public HTMLTextAreaElement build()
	{
		return textArea ;
	}

	
}

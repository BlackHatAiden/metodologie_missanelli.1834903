package quickstart;

import static def.dom.Globals.document;

import java.util.function.Function;

import def.dom.HTMLAnchorElement;
import jsweet.util.StringTypes;

public class HTMLAnchorElementBuilder 
{
	private HTMLAnchorElement link = document.createElement(StringTypes.a);
	
	
	/**
	 * il metodo preso in input una stringa imposta il contenuto testuale del link
	 * @param s stringa
	 * @return this
	 */
	public HTMLAnchorElementBuilder textContent(String s)
	{
		link.textContent = s ;
	
		return this ;
	}
	
	/**
	 * il metodo setta la funzione una volta cliccato su esso
	 * @param f funzione
	 * @return this
	 */
	public HTMLAnchorElementBuilder onclick(Function f)
	{
		link.onclick = f ;
	
		return this ;
	}
	
	/**
	 * il metodo presa in input una stringa imposta il collegamento del link
	 * @param s stringa
	 * @return this
	 */
	public HTMLAnchorElementBuilder href(String s)
	{
		link.href = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return link
	 */
	public HTMLAnchorElement build()
	{	
		return link ;
	}


}

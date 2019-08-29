package quickstart;


import static def.dom.Globals.document;


import def.dom.HTMLDivElement;
import jsweet.util.StringTypes;

public class HTMLDivElementBuilder 
{
	private HTMLDivElement div = document.createElement(StringTypes.div);
	
	/**
	 * il metodo imposta il className prendendo in input una stringa
	 * @param s stringa
	 * @return this
	 */
	public HTMLDivElementBuilder className(String s)
	{
		div.className = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return div
	 */
	public HTMLDivElement build()
	{
		return div ;
	}

	
}

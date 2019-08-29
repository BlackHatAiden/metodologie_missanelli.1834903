package quickstart;


import static def.dom.Globals.document;

import def.dom.HTMLInputElement;

import jsweet.util.StringTypes;

public class HTMLInputElementBuilder 
{
	
	private HTMLInputElement input = document.createElement(StringTypes.input) ;
	
	/**
	 * il metodo imposta il tipo dell'elemento sotto forma di stringa
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder type(String s)
	{
		input.type = s ;
		
		return this ;
	}
	
	
	
	/**
	 * il metodo presa in input una stringa imposta il percorso
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder src(String s)
	{
		input.src = s ;
		
		return this ;
	}
	
	/**
	 * il metodo imposta il nome dell'elemento
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder name(String s)
	{
		input.name = s ;
		
		return this ;
	}
	
	
	
	/**
	 * il metodo imposta il testo dell'elemento
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder textContent(String s)
	{
		input.textContent = s ;
		
		return this ;
	}
	
	/**
	 * il metodo presa in input una stringa imposta il testo della casella vuota
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder placeholder(String s)
	{
		input.placeholder = s ;
		
		return this ;
	}
	
	/**
	 * il metodo presa in input una stringa imposta il className
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder className(String s)
	{
		input.className = s ;
		
		return this ;
	}
	
	/**
	 * il metodo imposta il valore dell'elemento 
	 * @param s stringa
	 * @return this
	 */
	public HTMLInputElementBuilder value(String s)
	{
		input.value = s ;
		
		return this ;
	}
	
	/**
	 * il metodo costruisce l'ogetto con le impostazioni volute
	 * @return input
	 */
	public HTMLInputElement build()
	{
		return input ;
	}


}

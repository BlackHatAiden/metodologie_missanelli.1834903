
public class ContieneStringa 
{
	private String[] array ;
	private String stringa ;
	
	
	public ContieneStringa(String[] array,String stringa)
	{
		this.array = array ;
		this.stringa = stringa ;
	}
	
	public boolean presenzaStringa()
	{
		return indiceParola() != - 1 ;
	}
	
	
	/**
	 * il metodo confronta le singole lettere della stringa con ogni
	 * lettera della stringa dentro l'array e  e la posizione se
	 * la trova altrimenti -1
	 * @return pos
	 */
	private int indiceParola() 
	{
		int pos = 0 ;
		int lunghezzaStringaIniziale = stringa.length()-1 ;
		
		/*
		 * mi porta le parole della stringa o dell'array alla stessa lunghezza
		 */
		for(int i = 0 ; i < array.length ; i++)
		{
			if (stringa.length() > array[i].length())
				
				while (stringa.length() > array[i].length())
					array[i] += " " ;
			
			else if (stringa.length() < array[i].length())
				
				while (stringa.length() < array[i].length())
					stringa += " " ;
		}
		
		
		
		/*
		 * scorrende l'array confronto i vari caratteri e se sono sempr uguali
		 * fino all'ultimo carattere allora mi slavo la posizione e restituisco la posizione
		 * altrimenti esco subito dal secondo for
		 */
	
		for(int x = 0 ; x < array.length ; x++)
		{
			
			for(int k = 0 ; k < array[x].length() ; k++ )
			{
				
				
				if(stringa.charAt(k) == array[x].charAt(k))
				{
					
					if(k == lunghezzaStringaIniziale  )
					{
						
						pos = x ;
						return pos ;
					}
					
				}
			
				else
				{
					pos = - 1 ;
					break ;
				}
				
			}
		}
				
		
		return pos;
	}

	public static void main(String[] args) 
	{
		String [] arr = {"ciao","bella"} ;
		
		ContieneStringa c1 = new ContieneStringa(arr,"ciao")  ;
		
		System.out.println(c1.indiceParola()) ;
		
		System.out.println(c1.presenzaStringa()) ;

	}



	

}

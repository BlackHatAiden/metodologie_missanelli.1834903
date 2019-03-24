
public class CorniceWord 
{
	private int numero ;
	private String parola ;
	
	
	public CorniceWord (int numero,String parola)
	{
		this.numero = numero ;
		this.parola = parola ;
	}
	
	/**
	 * stampa a video una cornice NxN con all'interno 
	 * la stringa scelta
	 */
	public void stampaCorniceWord()
	{
		int r = 0 ;
		int k = 0 ;
		
		for( int i = 0 ; i <= numero -1  ; i++)
		{
			
			while ( r < numero)
			{
				if (i == 0 || i == numero-1)
					System.out.print("*");
			
				else
					if(r == 0 || r == numero-1 && i != 0)
						System.out.print("*");
					
					else
					{
						System.out.print(parola.charAt(k));
						
						if (k != parola.length()-1)
							k++ ;
						
					}
					
				r++ ;
			}
			r=0 ;
			System.out.print("\n");
		}
		
	}
	
	/**
	 *  stessa cosa del metodo sopra solo sposto tutto in una variabile
	 *  avrei potuto riutilizzare il codice sopra se avessi potuto cambiare il ritorno
	 *  della funzione precedente perche avrei aggiunto la String finale che avrei riempito
	 *  e alla fine restituito. nel metodo sotto mi sarebbe bastato restituire il valore
	 *  del metodo restituito sopra
	 */
	
	
	public String toString()
	{
		int r = 0 ;
		int k = 0 ;
		String finale = "" ;
		
		for( int i = 0 ; i <= numero -1  ; i++)
		{
			
			while ( r < numero)
			{
				if (i == 0 || i == numero-1)
					finale += "*" ;
				
				
				else
					if(r == 0 || r == numero-1 && i != 0)
						finale += "*" ;
					
					else
					{
						finale += parola.charAt(k) ;
						
						if (k != parola.length()-1)
							k++ ;
						
						
					}
					
				r++ ;
			}
			r=0 ;
			finale += "\n" ;
		}
		return finale ;
	}
	
	
	public static void main(String[] args)
	{
		CorniceWord  cw1 = new CorniceWord (6,"Cornice in Java ") ;
		
		cw1.stampaCorniceWord();
		
		// altra implementazione
		System.out.println("\n"+cw1.toString()) ;
	}

}


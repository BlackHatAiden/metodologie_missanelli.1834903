
public class Istogrammi 
{
	private int intervallo0 ;
	private int intervallo1 ;
	private int[] persone  ;
	
	
	/**
	 * Costruisce l'oggetto di partenza con un range di valori
	 * in piu inizializza un array di intervallo+1 elementi
	 * @param i  range 0
	 * @param j  range 1
	 */
	public Istogrammi(int i, int j)
	{
		intervallo0 = i ;
		intervallo1 = j ;
		
		persone = new int[intervallo1+1] ;
		
		
		
	}
	
	/**
	 * il metodo stampa a video l'istogramma
	 * le posizioni sono in realta i voti in questo caso
	 * e gli underscore sono quante persone hanno preso quel voto
	 */
	public void creaOrizzontale()
	{
		for(int i = intervallo0 ; i < intervallo1+1 ; i++)
		{
			System.out.print(i + ") ") ;
			
			
			for(int j =  0 ; j < persone[i] ; j++)
				System.out.print("__  ") ;
			
			System.out.println("\n") ;
				
		}
	}
	
	/**
	 * il metodo aggiunge in base all'indice preso in input
	 * il valore desiderato che rappresenta qunate persone
	 * hanno preso quel voto
	 * @param indice che rappresenta alla fine il voto
	 * @param numeroPersone  che rappresenta quante persone hanno preso quel voto
	 * @return array
	 */
	public int[] aggiungiPersone(int indice,int numeroPersone)
	{
		 
		//qui avrei potuto fare una gestione delle eccezioni
		//in caso mettessero un indice che non c'e nell'array
		
		for(int i = 0 ; i < persone.length ; i++)
			if(i == indice)
				persone[i] = numeroPersone ;
		
		return persone ;
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Istogrammi i1 = new Istogrammi(0,31) ;
		
		i1.aggiungiPersone(25, 12) ;
		i1.aggiungiPersone(30, 5) ;
		i1.aggiungiPersone(29, 2) ;
		i1.aggiungiPersone(28, 10) ;
		
		i1.creaOrizzontale() ;
		
		

	}

}

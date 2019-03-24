
public class EstrazioneDelLotto 
{
	private static int numeroEstrazioni = - 1 ;
	
	
	private int[] [] array = new int[5][5];

	/**
	 * il metodo ritorna un array di interi
	 * casuali tra 1 e 90 
	 * @return
	 */
	public int[] [] estrae()
	{
		numeroEstrazioni++ ;
		int[] estrazione = new int[5] ;
				
		for(int i = 0 ; i < estrazione.length; i++)
		
			estrazione[i] = (int) (Math.random() * (90-1) + 1) ;
		
		
			
		for(int k  = 0 ; k < estrazione.length  ; k++)
			array[numeroEstrazioni][k] = estrazione[k] ;
			
		
		
		return array ;
	}
	
	/**
	 * il metodo ritorna lestrazione sotto forma di stringa
	 */
	public String toString()
	{
		String visualizza = "" ;
		
		
			for(int j  = 0 ; j <= numeroEstrazioni  ; j++)
			{
				visualizza += (j == 0  ? "[ " : "") ;
				
				
				for(int i = 0 ; i < array[j].length  ; i++)
				{
					
					
					visualizza +=  (i == 0  ? "[ " : "") + array[j][i] +  (i == array[j].length - 1  ? " ] " : " , ") ;
					
					
				}
				
				visualizza += (j == numeroEstrazioni   ? " ]" : "") ;
			}
		
		
		return visualizza ;
		
		
		
	}
	
	/**
	 * il metodo controlla quanti dei numeri giocati
	 * sono nell'estrazione e ne restituisce il numero
	 * @param puntata array da confrontare
	 * @return quanti numeri trovati
	 */
	public int numeriContenuti(int[] puntata)
	{
		int trovati = 0 ;
		
		for(int k = 0 ; k <= numeroEstrazioni ; k++)
		
			for(int i = 0 ; i < puntata.length ; i++)
				
				for(int j = 0 ; j < array[k].length ; j++)
					
					if(puntata[i] == array[k][j])
						trovati++ ;
					
		
		return trovati ;		
					
	}
	
	/**
	 * il metodo riutilizza numeriContenuti
	 * e restituisce true o false in base se trova almeno 2 numeri
	 * @param puntata array di interi
	 * @return vincita
	 */
	public boolean vincita(int[] puntata)
	{
		boolean vincita = false ;
		
		switch(numeriContenuti(puntata)) 
		{
		case 2 :  vincita =  true ; break ;
		
		case 3 :  vincita =  true ; break ;
		
		case 4 :  vincita =  true ; break ;
		
		case 5 :  vincita =  true ; break ;
		
		
		}
		return vincita ;
		
	}
	
	/**
	 * il metodo ritorna la somma di tutti i numeri di ogni estrazione 
	 * @return somma
	 */
	public int getTotaleNumeriEstratti()
	{
		int somma = 0 ;
		
		
		for(int j  = 0 ; j <= numeroEstrazioni ; j++)
			
			for(int i = 0 ; i < array[j].length ; i++)
				somma += array[j][i] ;
			
		
		return somma ;
	}
	
	public static void main(String[] args) 
	{
		
		EstrazioneDelLotto e1 = new EstrazioneDelLotto () ;
		
		e1.estrae() ;
		System.out.println(e1.toString()) ;
		
		
		System.out.println(e1.numeriContenuti(new int[] {1,20,35,4,55,67,7,80,9}) ) ;
		
		e1.estrae() ;
		System.out.println(e1.toString()) ;
		
		System.out.println(e1.getTotaleNumeriEstratti()) ;
		
		System.out.println(e1.vincita(new int[] {1,20,35,4,55,67,7,80,9})) ;
		
		
		
		
		
		
		
	}

}

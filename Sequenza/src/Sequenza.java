import java.util.Arrays;

public class Sequenza 
{
	private int[] array ;
	
	/*
	 * istaziare costruttore con array in ingresso
	 */
	public Sequenza(int[] array)
	{
		this.array = array ;
	}
	
	/*
	 * il metodo stampa a video l'array con l'utilizzo
	 * della libreria Arrays
	 */
	public void toArray()
	{
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)) ;
	}

	/*
	 * il metodo ritorna la media dei valori dell'array
	 */
	public int getMedia()
	{
		int somma = 0 ;
		
		for (int i = 0 ; i < array.length ; i++)
			somma += array[i] ;
		
		return somma/array.length ;
			
	}
	
	/*
	 * il metodo ritorna il valore centrale dell'array
	 * se di dimensione pari ritorna quello nella prima meta
	 */
	public int getMediana()
	{
	     
		return array[(int) ((array.length-1) / 2)] ;
	}

	
	/*
	 * il metodo ritorna il valore che si ripete piu frequentemente
	 * se ci sono ripetizioni altrimenti ritorna ultimo elemento ( simbolo che tutti hanno la stessa
	 *  ripetiione)
	 */
	public int getModa()
	{
		int[] ripetizioni = new int[array.length] ;
		
		int max = ripetizioni[0] ;
		int pos = 0 ;
		
		
		for (int i = 0 ; i < array.length  ; i++)
			
			for(int j = 0 ; j < array.length ; j++)
				
				if(array[i] == array[j])
					
					ripetizioni[i] += 1 ;
		
		
	    for (int k= 1 ; k < ripetizioni.length  ; k++)
	    	
	    	
	    	
	    	if(ripetizioni[k] >= max )
	    	{
	    		max = ripetizioni[k] ;
	    		pos = k ;
	    	}
		
		
		
		return array[pos] ;
	}
	public static void main(String[] args)
	{
		int array[] =  {1,9,8,4,0} ;
		
		Sequenza s1 = new Sequenza(array) ;
		
		s1.toArray();
		
		System.out.println(s1.getMedia()) ;
		
		System.out.println(s1.getMediana()) ;
		
		System.out.println(s1.getModa()) ;
		
	}

}

import java.util.Arrays;

public class MioArray 
{
	private int[] array ;
	
	public MioArray(int[] array)
	{
		this.array = array ;
	}
	
	/**
	 * il metodo ritorna true se la posizione nell'array
	 * contiene esattamente l'intero specificato altrimenti false
	 * in piu se la lunghezza dell'array e 0 ritorno false
	 * mentre se e piu picoola della pos invece che  catturare un
	 * errore creo nuovi array con posizioni sempre piu grandi
	 * copiando i precedenti
	 * @param pos
	 * @param intero
	 * @return true false
	 */
	public boolean contiene(int pos,int intero)
	{
		
		
		if ( array.length == 0)
			return false ;
		else
		
			if(pos > array.length-1)
				
				while(array.length <= pos)
				{
					array = Arrays.copyOf(array, array.length + 1) ;
				}
				
		return array[pos] == intero ;
	}
	
	/**
	 * il metodo somma i primi 2 elementi di un array se piu grande di 2
	 * mentre se e 0 restituisco 0 se e 1 o 2 restituisco la posizione 0
	 * @return pos0+pos1
	 */
	public int somma2()
	{
		if(array.length == 2 || array.length == 1)
			return array[0] ;
		
		else if( array.length == 0) 
			return 0 ;
		else
			return array[0] + array[1] ;
	}
	
	/**
	 * il metodo crea una copia dell'array di partenza
	 * e prendendo 2 posizioni input scambia i valori
	 * @param pos1
	 * @param pos2
	 * @return array2
	 */
	public int[] scambia(int pos1,int pos2)
	{
		int t = 0 ;
		
		int[] array2 = Arrays.copyOf(array, array.length) ;
		
	    t = array2[pos1] ;
	    
		array2[pos1] = array2[pos2] ;
		
		array2[pos2] = t ;
		
		
		return array2 ;
	}
	
	/**
	 * il metodo calcola il max tra lelmento in posizione 0,
	 * posizione lunghezza/2,posizione lunghezza
	 * @return max
	 */
	public int maxtripla()
	{
		return Math.max((Math.max(array[0], array[array.length-1])),array[(int)(array.length / 2)]) ;
	}
	
	/**
	 * il metodo crea un nuovo array di 2 elementi
	 * il primo del vecchio array e l'ultimo
	 * @return array3
	 */
	public int[] falloinDue()
	{
		int[] array3 = {array[0],array[array.length-1]} ;
		
		return array3 ;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,7,4,5} ;
		
		MioArray a1 = new MioArray(arr) ;
		
		System.out.println(a1.contiene(3, 4)) ;
		
		System.out.println(a1.somma2()) ;
		
		System.out.println(Arrays.toString(a1.scambia(0, 3))) ;
		
		System.out.println(a1.maxtripla()) ;
		
		System.out.println(Arrays.toString(a1.falloinDue())) ;
	}

}

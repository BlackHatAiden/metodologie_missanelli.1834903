import java.util.Arrays;

public class EsArray 
{
	private double[] array ;
	
	public EsArray(double[] array)
	{
		this.array = array ;
	}
	
	/**
	 * il metodo calcola la somma di tutti gli 
	 * elementi dell'array
	 * @return somma
	 */
	public double sommaElementi()
	{
		double somma = 0.0 ;
		
		for(int i = 0 ; i < array.length ; i++)
			somma += array[i] ;
		
		return somma ;
	}
	
	
	/**
	 * il metodo riutilizza il risultato di 
	 * un metodo precedente e calcola la media
	 * attraverso la divisione della somma fratto
	 * la lunghezza dell'array
	 * @return media 
	 */
	public double mediaElementi()
	{
		return sommaElementi() / array.length ;
	}
	
	public double maxValore()
	{
		Arrays.sort(array);
		
		return array[array.length-1] ;
	}

	public static void main(String[] args) 
	{
		double[] arr = {1.0,3.7,3.5,4.5,1.6} ;
		
		EsArray a1 = new EsArray(arr) ;
		
		System.out.println(a1.sommaElementi()) ;
		
		System.out.println(a1.mediaElementi()) ;
		
		System.out.println(a1.maxValore()) ;

	}

}

import java.util.Arrays;

public class Filtro 
{
	private int[] array ;
	
	public Filtro(int[] array)
	{
		this.array = array ;
	}
	
	/**
	 * il metodo restituisce un array dove gli elementi sono nell'ordine
	 * iniziale ma ci sono solamente quei valori <= k
	 * @param k valore di confronto
	 * @return array3
	 */
	public int[] passaBasso(int k)
	{
		int[] array2 = new int[array.length] ;
		
		int elementi = 0 ;
				
		for(int i = 0  ; i < array.length ; i++)
			
			if(array[i] <= k)
			{
				array2[elementi] = array[i] ;
				elementi++ ;
			}
		int[] array3  = Arrays.copyOf(array2, elementi) ;
		
		return array3 ;
	}
	
	/**
	 * il metodo fa la stessa cosa di passBasso solo che la condizione qui
	 * e >= k
	 * @param k valore di confronto
	 * @return array3
	 */
	public int[] passaAlto(int k)
	{
		int[] array2 = new int[array.length] ;
		
		int elementi = 0 ;
				
		for(int i = 0  ; i < array.length ; i++)
			
			if(array[i] >= k)
			{
				array2[elementi] = array[i] ;
				elementi++ ;
			}
		int[] array3  = Arrays.copyOf(array2, elementi) ;
		
		return array3 ;
	}
	
	/**
	 * il metodo restituisce un array senza le occorrenza di k
	 * @param k valore di confronto
	 * @return array
	 */
	public int[] filtra(int k)
	{
		int[] array2 = new int[array.length] ;
		
		int elementi = 0 ;
		
		for(int i = 0  ; i < array.length ; i++)
			
			if(array[i] != k)
			{
				array2[elementi] = array[i] ;
				elementi++ ;
			}
	    array  = Arrays.copyOf(array2, elementi) ;
		
		return array ;
		
	}
	
	/**
	 * il metodo fa la stessa cosa di filtra solo che in 
	 * input questa volta si ha un array di interi
	 * @param arr array di interi
	 * @return array
	 */
	public int[] filtra2(int[] arr)
	{
		int[] array2 = new int[array.length] ;
		
		int elementi = 0 ;
		
		for(int i =  0 ,j  = 0; i < array.length ; i++)
		{
			
			for(int k  = 0 ; k < arr.length ; k++)
			{
				if(array[i] != arr[k])
					array2[elementi] = array[i] ;
				
				else
					j++ ;
					
			}
		if(j < 1)
			elementi++ ;
		j=0 ;
		}
		array  = Arrays.copyOf(array2, elementi) ;
		
		return array ;
	}

	public static void main(String[] args) 
	{
		Filtro f1 = new Filtro(new int[] {1,2,10,2,42,7,8}) ;
		
		System.out.println(Arrays.toString(f1.passaBasso(8))) ;
		
		System.out.println(Arrays.toString(f1.passaAlto(9))) ;
		
		//System.out.println(Arrays.toString(f1.filtra(2))) ;
		
		System.out.println(Arrays.toString(f1.filtra2(new int[] {2,7,42}))) ;

	}

}


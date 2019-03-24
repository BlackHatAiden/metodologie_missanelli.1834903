import java.util.Arrays;

public class SommaN 
{
	/**
	 * il metodo stampa a video la somma dei 2 numeri che lo precedono
	 * fino ad arrivare ad N
	 * @param numero1   numero iniziale pos 0
	 * @param numero2  numero iniziale pos 1
	 * @param sequenza lunghezza sequenza
	 */
	public void sommaN(int numero1,int numero2,int sequenza)
	{
		// creazione array con sequenza +2 di lunghezza prche le prime 2 posizioni 
		// ci metto numero1 e numero2
		int[] arr = new int[sequenza+2] ;
		
		arr[0] = numero1 ;
		arr[1] = numero2 ;
 		
		
		for (int i = 0 , a = 2; i < sequenza+2 ; i++, a++)	
		{
			//perche devo arrivare al massimo alla posizione (0---sequenza+2-1) 
			if (a == 8)
				break ;
			
			arr[a]  = arr[i] + arr[i+1] ;
			
		}
		
		System.out.println(Arrays.toString(arr)) ;
	}
	
	public static void main(String[] args)
	{
		SommaN  s = new SommaN() ;
		
		s.sommaN(2,3,6);
 	}
}

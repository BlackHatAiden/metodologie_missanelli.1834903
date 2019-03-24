public class Calcolatrice 
{
	private static int indice ;
	private int[] memoria = new int[10]  ;
	
	
	/**
	 * il metodo memorizza i valori presi in input
	 * in memoria e restituisce la somma di essi
	 * @param input valore
	 * @return somma += input
	 */
	public int somma(int input)
	{
		int somma = 0;
		
		memoria[indice] = input ;
		
		indice++ ;
		return  somma += input ;
	}
	
	
	/**
	 * il metodo riazzera il valore della memoria fino a indice -1 
	 * poi effettua lo scambio con la posizione indice e la posizione 0
	 * infine riporta indice a 1
	 * @return memoria 
	 */
	public int[] azzera()
	{
		int  t = 0 ;
		
		for(int i = 0 ; i < indice - 1 ; i++)
			memoria[i] = 0 ;
		
		t = memoria[indice] ;
		
		memoria[indice] = 0 ;
		
		memoria[0] = t ;
		
		indice = 1 ;
		
		
		return memoria ;
	}
	

	 /**
	  * il metodo inserisce nella memoria il
	  * valore delle somme precedenti e lo insierisce
	  * nella cella indice (implicito indice+1 vedi somma)
	  * @return memoria 
	  */
	public int[] memorizza()
	{
		int somma = 0 ;
		
		for(int i = 0 ; i < indice ; i++)
			somma += memoria[i] ;
		
		memoria[indice] = somma ;
		
		return memoria ;
		
	}
	
	/**
	 * il metodo dato in input k imposta
	 * come valore attuale della memoria il valore
	 * memoria[k] se esiste e restituisce true altrimenti
	 * false
	 * @param k indice
	 * @return true o false
	 */
	public boolean recupera(int k)
	{
		if(k <= indice)
		{
			memoria[indice] = memoria[k] ;
			
			return true ;
		}
		return false ;
	}

	
	/**
	 * il metodo restituisce la stringa con tutte le somme 
	 */
	public String toString()
	{
		String stringa = "" ;
		
		for(int i = 0 ; i < indice ; i++)
			stringa +=   memoria[i] + (i != indice - 1 ? " + " : "");
		
		
		return stringa ;
	}
	
	public static void main(String[] args)
	{
		Calcolatrice c = new Calcolatrice();
		
		c.somma(5); c.somma(3);
		System.out.println(c.toString());
		
		c.memorizza(); c.azzera(); c.recupera(0);c.somma(1);
		System.out.println(c.toString());
		
		c.memorizza(); c.azzera(); c.recupera(1);
		System.out.println(c.toString());
		
	}

}

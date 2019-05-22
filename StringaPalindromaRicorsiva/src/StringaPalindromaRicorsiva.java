
public class StringaPalindromaRicorsiva 
{
	
	/**
	 * il metodo facendo uso di quello privato ritorna true se la stringa e palindroma false altrimenti
	 * @param stringa
	 * @return
	 */
	public boolean getPalindorma(String stringa)
	{
		return getPalindroma(stringa,0,stringa.length()-1) ;
	}
	
	/**
	 * il metodo confronta prima il caso base dove gli indici se j >= k allora true altrimenti controllo se i caratteri alle posizioni
	 * k e j sono uguali se sono diversi restiuisco false altrimenti richiamo getpalindroma con gli indici rispettivamenti incrementati di 1 e decrementati
	 * di 1
	 * @param stringa
	 * @param k
	 * @param j
	 * @return
	 */
	private boolean getPalindroma(String stringa,int j,int k)
	{
		if(j >= k)
			return true ;
		
		
		return stringa.charAt(j) == stringa.charAt(k) ? getPalindroma(stringa,j+1,k-1) : false ;
	}

	public static void main(String[] args) 
	{
		StringaPalindromaRicorsiva s = new StringaPalindromaRicorsiva() ;
		
		System.out.println(s.getPalindorma("ailatiditalia")) ;

	}

}

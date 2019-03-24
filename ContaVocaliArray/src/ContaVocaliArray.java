
public class ContaVocaliArray 
{
	private String stringa ;
	
	public ContaVocaliArray(String stringa)
	{
		this.stringa = stringa ;
	}
	
	/**
	 * il metodo conta le ripetizioni delle vocali
	 * mettendole in un array e stampa a video le ripetizioni
	 */
	public void conteggio()
	{
		int[] aeiou = {0,0,0,0,0} ;
		
		
		for(int i = 0 ; i < stringa.length() ; i++)
			
			switch(stringa.charAt(i))
			{
			case 'a' : aeiou[0] += 1 ; break ;
			
			case 'e' : aeiou[1] += 1 ; break ;
			
			case 'i' : aeiou[2] += 1 ; break ;
			
			case 'o' : aeiou[3] += 1 ; break ;
			
			case 'u' : aeiou[4] += 1 ; break ;
			}
		
		System.out.println("a = "+aeiou[0] +" e = "+aeiou[1] +" i = "+aeiou[2] +" o = "+aeiou[3] +" u = "+aeiou[4]) ;
		
	}

	public static void main(String[] args) 
	{
		ContaVocaliArray s1 = new ContaVocaliArray ("le aiuole sono pulite") ;
		
		s1.conteggio() ;

	}

}

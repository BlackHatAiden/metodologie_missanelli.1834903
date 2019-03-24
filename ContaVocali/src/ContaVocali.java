
public class ContaVocali 
{
	
	private String stringa ;
	
	public ContaVocali (String stringa)
	{
		this.stringa = stringa ;
	}
	
	/**
	 * il metodo conta le ripetizioni delle vocali attraverso
	 * lo scorrimento della stringa e una cascata di if
	 */
	public void conteggio()
	{
		
		int a = 0 ;
		int e = 0 ;
		int i = 0 ;
		int o = 0 ;
		int u = 0 ;
		
		
		for (int j = 0 ; j < stringa.length() ; j++)
		{
			if(stringa.charAt(j) == 'a')
				 a++ ;
			
			else if(stringa.charAt(j) == 'e')
				e++ ;
			
			else if(stringa.charAt(j) == 'i')
				i++ ;
			
			else if(stringa.charAt(j) == 'o')
				o++ ;
			
			else if(stringa.charAt(j) == 'u' )
				u++ ;
		}
		
		System.out.println("A = "+a+"\n"+"E = "+e+"\n"+"I = "+i+"\n"+"O = "+o+"\n"+"U = "+u );
		
	}
	
	
	public static void main(String[] args) 
	{
		
		ContaVocali s = new ContaVocali("Le aiuole sono pulite") ;
		
		s.conteggio() ;
	}

}

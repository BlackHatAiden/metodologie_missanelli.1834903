
public class StringaMangiona 
{
	private String stringa ;
	
	public StringaMangiona (String stringa)
	{
		this.stringa = stringa ;
	}
	
	/**
	 * il metodo restituisce la stringa
	 */
	public String toString()
	{
		return stringa ;
	}
	
	/**
	 * il metodo restituisce la lunghezza della stringa
	 * fatto in modo meccanico al posto di usare .length()
	 * @return lunghezza
	 */
	public int length()
	{
		 return stringa.length() ;
	}

	/**
	 * il metodo ritorna il valore della posizone della stringa
	 * preso in input se ritorna vuoto e perche l'indice era superiore
	 * della lunghezza della stringa
	 * @param k indice
	 * @return carattere ;
	 */
	public char getCarattere(int k)
	{
		if( k > stringa.length()-1 )
			while(stringa.length()-1 < k)
		
					stringa += " " ;
					
		
		return stringa.charAt(k) ;
	}
	
	/**
	 * il metodo ritorna una nuova stringa con tutte 
	 * le ripetizioni della lettera tolte
	 * @param lettera
	 * @return stringa2
	 */
	public String mangiaLettera(final char lettera)
	{
		String stringa2 = "" ;
		
		
		for(int j = 0 ; j < stringa.length() ; j++)
			if( lettera != stringa.charAt(j))
				stringa2 += stringa.charAt(j) ;
			
		
		return stringa2 ;
	}
	
	
	/**
	 * il metodo crea una  nuova stringa dove la parte centrale si per eccesso che per difetto
	 * sono cancellate
	 * @return
	 */
	public String slurp()
	{
		String stringa3 = "" ;
		
		for(int i = 0 ; i < stringa.length() ; i++)
		{
			if(i >= (int) ((stringa.length() / 2) - 1) && i < (int) ((stringa.length() / 2) + 1))
				stringa3 += "" ;
			else
				stringa3 += stringa.charAt(i) ;
			
		}
		
		return stringa3 ;
	}
	
	/**
	 * il metodo data una stringa in input elimina tutte
	 * le occorenze dalla stringa principale
	 * @param stringa4 confronto
	 * @return stringa5
	 */
	public String mangiaStringaMangiona(String stringa4)
	{
		String stringa5 = "" ;
		
		for(int k = 0 ; k < stringa.length(); k++)
		{
			
			for(int j = 0 ; j < stringa4.length() ; j++)
			{
				
				if(stringa.charAt(k) == stringa4.charAt(j))
					break ;
				
				else if(stringa.charAt(k) != stringa4.charAt(j) && j == stringa4.length() - 1)
					stringa5 +=  stringa.charAt(k) ;
			}
			
			
		}
		return stringa5 ;
				
	}
	
	public static void main(String[] args) 
	{
		StringaMangiona s1 = new StringaMangiona ("ciao") ;
		
		
		
		
		System.out.println(s1.mangiaStringaMangiona("iao")) ;

	}

}


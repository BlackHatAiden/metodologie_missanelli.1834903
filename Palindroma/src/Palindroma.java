
public class Palindroma 
{
	private String stringa ;
	
	public Palindroma(String stringa)
	{
		this.stringa = stringa ;
	}
	
	/**
	 * il metodo ritorna true se la stringa e palindroma
	 * lo verifica mettendo i caratteri della stringa presi al contrario
	 *  in una di confronto , restituisce  false se non è palindroma
	 * @return true o false
	 */
	public boolean palindromi()
	{
		String confronto = "" ;
		
		for(int i = stringa.length()-1 ; i > -1; i --)
			confronto += stringa.charAt(i) ;
		
		
		return stringa.equals(confronto) ;
	}
	
	public static void main(String[] args)
	{
		Palindroma  p1 = new Palindroma ("angelalavalalegna") ;
		
		System.out.println(p1.palindromi()) ;
	}

}

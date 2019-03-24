
public class StringheVerticali
{
	
	private String stringa1,stringa2,stringa3 ;
	
	public StringheVerticali (String stringa1,String stringa2,String stringa3)
	{
		this.stringa1 = stringa1 ;
		this.stringa2 = stringa2 ;
		this.stringa3 = stringa3 ;
	}
	
	/*
	 * il metodo ritorna le parole spezzettate in verticale
	 * trovando la lunghezza massima sulla quale ciclare
	 * e modificando con gli psazi le parole piu corte
	 */
	public void toVerticalee()
	{
		int max = Math.max(Math.max(stringa1.length(), stringa2.length()), stringa3.length()) ;
		

		
		for(int i = 0 ; i < max;i++)
			{
				
			if(i >= stringa1.length()-1)
				stringa1 += " " ;
			
			if(i >= stringa2.length()-1)
				stringa2 += " " ;
			
			if(i >= stringa3.length()-1)
				stringa3 += " " ;
			
		System.out.println(stringa1.charAt(i)+" "+stringa2.charAt(i)+" "+stringa3.charAt(i));
				
				
			}
		
	}
	
	public static void main(String[] args)
	{
		StringheVerticali s1 = new StringheVerticali("ciao","buondi","hello") ;
		
		s1.toVerticalee();
		
	}

}


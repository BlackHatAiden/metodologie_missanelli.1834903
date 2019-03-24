
public class StringaNumeri 
{
	private String stringa ;
	
	public StringaNumeri(String stringa)
	{
		this.stringa = stringa ;
	}
	
	
	/** il metodo preso in input la stringa con i numeri a lettere
	 * li converte in una stringa di numeri
	 * 
	 * @return stringa finale
	 */
	public String stringaToNumeri()
	{
		String[] arr = stringa.split(" ") ;
		
		String finale = "" ;
		
		for( int i = 0 ; i < arr.length; i++)
		{
			switch(arr[i])
			{
			case "zero" :   finale += "0 " ; break ;
				
			case "uno" :    finale += "1 " ; break ;
				
			case "due" :    finale += "2 " ; break ;
				
			case "tre" :	finale += "3 " ; break ;
				
			case "quattro" :finale += "4" ; break ;
				
			case "cinque" : finale += "5 " ; break ;
				
			case "sei" :	finale += "6 " ; break ;
				
			case "sette" :  finale += "7 " ; break ;
				
			case "otto" :   finale += "8 " ; break ;
				
			case "nove" :   finale += "9 " ; break ;
			}
		}
		
		return finale ;
	}
	
	/**
	 * il metodo preso in input la stringa con i numeri li converte
	 * in lettere
	 * @return stringa finale
	 */
	public String numeriToStringa()
	{
		
		
		String finale = "" ;
		
		for( int i = 0 ; i < stringa.length(); i++)
		{
			switch(stringa.charAt(i))
			{
			case '0' :   finale += "zero " ; break ;
				
			case '1' :    finale += "uno " ; break ;
				
			case '2' :    finale += "due " ; break ;
				
			case '3' :	finale += "tre " ; break ;
				
			case '4' :finale += "quattro " ; break ;
				
			case '5' : finale += "cinque " ; break ;
				
			case '6' :	finale += "sei " ; break ;
				
			case '7' :  finale += "sette " ; break ;
				
			case '8' :   finale += "otto " ; break ;
				
			case '9' :   finale += "nove " ; break ;
			}
		}
		
		return finale ;
	}
	
	
	
	public static void main(String[] args)
	{
		StringaNumeri  sn1 = new StringaNumeri ("sei nove due") ;
		StringaNumeri  sn2 = new StringaNumeri ("692") ;
		
		System.out.println(sn1.stringaToNumeri()) ;
		
		System.out.println(sn2.numeriToStringa()) ;
		
		
	}

}


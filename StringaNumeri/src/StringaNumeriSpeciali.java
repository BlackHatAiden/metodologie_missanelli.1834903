
public class StringaNumeriSpeciali 
{
private String stringa ;
	
	public StringaNumeriSpeciali(String stringa)
	{
		this.stringa = stringa ;
	}
	
	
	/**
	 * il metdodo converte la stringa di lettere in una stringa di numeri 
	 * compresi casi speciali
	 * @return stringa finale
	 */
	public String stringaToNumeri()
	{
		String[] arr = stringa.split(" ") ;
		
		String finale = "" ;
		
		for( int i = 0 ; i < arr.length; i++)
		{
			if ( i == 0)
			{
				
			
			switch(arr[i])
			{
			
				
			case "mille" :    finale += "1" ; break ;
			
			case "duemila" :    finale += "2" ; break ;
				
			case "tremila" :	finale += "3" ; break ;
				
			case "quattromila" :finale += "4" ; break ;
				
			case "cinquemila" : finale += "5" ; break ;
				
			case "seimila" :	finale += "6" ; break ;
				
			case "settemila" :  finale += "7" ; break ;
				
			case "ottomila" :   finale += "8" ; break ;
				
			case "novemila" :   finale += "9" ; break ;
			}
			
			}
			
			if ( i == 1)
			{
				switch(arr[i])
				{
				
					
				case "cento" :    finale += "1" ; break ;
					
				case "duecento" :    finale += "2" ; break ;
					
				case "trecento" :	finale += "3" ; break ;
					
				case "quattrocento" :finale += "4" ; break ;
					
				case "cinquecento" : finale += "5" ; break ;
					
				case "seicento" :	finale += "6" ; break ;
					
				case "settecento" :  finale += "7" ; break ;
					
				case "ottocento" :   finale += "8" ; break ;
					
				case "novecento" :   finale += "9" ; break ;
				}
			}
			
			if ( i == 2)
			{
				if ( arr.length == 3)
				{
					switch(arr[i])
					{
					
					case "uno" : finale += "1" ; break ;
					
					case "due" : finale += "2" ; break ;
					
					case "tre" : finale += "3" ; break ;
					
					case "quattro" :finale += "4" ; break ;
					
					case "cinque" : finale += "5" ; break ;
						
					case "sei" :	finale += "6" ; break ;
						
					case "sette" :  finale += "7" ; break ;
						
					case "otto" :   finale += "8" ; break ;
						
					case "nove" :   finale += "9" ; break ;
					
					case "dieci" : finale += "10" ; break ;
					
					case "undici" : finale += "11" ; break ;
					
					case "dodici" : finale += "12" ; break ;
					
					case "tredici" : finale += "13" ; break ;
					
					case "quattordici" :finale += "14" ; break ;
					
					case "quindici" : finale += "15" ; break ;
						
					case "sedici" :	finale += "16" ; break ;
						
					case "diciasette" :  finale += "17" ; break ;
						
					case "diciotto" :   finale += "18" ; break ;
						
					case "diciannove" :   finale += "19" ; break ;
					}
				}
				else
				{
				
				switch(arr[i])
				{
				
				
				case "venti" :    finale += "2" ; break ;
					
				case "trenta" :	finale += "3" ; break ;
					
				case "quaranta" :finale += "4" ; break ;
					
				case "cinquanta" : finale += "5" ; break ;
					
				case "sessanta" :	finale += "6" ; break ;
					
				case "settanta" :  finale += "7" ; break ;
					
				case "ottanta" :   finale += "8" ; break ;
					
				case "novanta" :   finale += "9" ; break ;
				
			    
				}
				}
			}
			
			if ( i == 3)
			{
				switch(arr[i])
				{
				case "uno" : finale += "1" ; break ;
				
				case "due" : finale += "2" ; break ;
				
				case "tre" : finale += "3" ; break ;
				
				case "quattro" :finale += "4" ; break ;
				
				case "cinque" : finale += "5" ; break ;
					
				case "sei" :	finale += "6" ; break ;
					
				case "sette" :  finale += "7" ; break ;
					
				case "otto" :   finale += "8" ; break ;
					
				case "nove" :   finale += "9" ; break ;
				}
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
		
		for( int i = 0,a = 0 ; i < stringa.length(); i++)
		{
			if ( i == 0)
			{
				
			
			switch(stringa.charAt(i))
			{
			
				
			case '1' :    finale += "mille " ; break ;
				
			case '2' :    finale += "duemila " ; break ;
				
			case '3' :	finale += "tremila " ; break ;
				
			case '4' :finale += "quattromila " ; break ;
				
			case '5' : finale += "cinquemila " ; break ;
				
			case '6' :	finale += "seimila " ; break ;
				
			case '7' :  finale += "settemila " ; break ;
				
			case '8' :   finale += "ottomila " ; break ;
				
			case '9' :   finale += "novemila " ; break ;
			}
			
			}
			
			if ( i == 1)
			{
				switch(stringa.charAt(i))
				{
				
					
				case '1' :    finale += "cento " ; break ;
					
				case '2' :    finale += "duecento " ; break ;
					
				case '3' :	finale += "trecento " ; break ;
					
				case '4' :finale += "quattrocento " ; break ;
					
				case '5' : finale += "cinquecento " ; break ;
					
				case '6' :	finale += "seicento " ; break ;
					
				case '7' :  finale += "settecento " ; break ;
					
				case '8' :   finale += "ottocento " ; break ;
					
				case '9' :   finale += "novecento " ; break ;
				}
			}
			
			if ( i == 2)
			{
				if ( stringa.length() == 3)
				{
					
				
				
				switch(stringa.charAt(i))
				{
				
				case '0' : finale += " " ; break ;
				
				case '2' :    finale += "venti " ; break ;
					
				case '3' :	finale += "trenta " ; break ;
					
				case '4' :finale += "quaranta " ; break ;
					
				case '5' : finale += "cinquanta " ; break ;
					
				case '6' :	finale += "sessanta " ; break ;
					
				case '7' :  finale += "settanta " ; break ;
					
				case '8' :   finale += "ottanta " ; break ;
					
				case '9' :   finale += "novanta " ; break ;
				
				}
				}
				else
				{
					
				a++;
			     switch(stringa.charAt(i+1))
				{
				case '1' : finale += "undici " ; break ;
				
				case '2' : finale += "dodici " ; break ;
				
				case '3' : finale += "tredici " ; break ;
				
				case '4' :finale += "quattordici " ; break ;
				
				case '5' : finale += "quindici " ; break ;
					
				case '6' :	finale += "sedici " ; break ;
					
				case '7' :  finale += "diciassette " ; break ;
					
				case '8' :   finale += "diciotto " ; break ;
					
				case '9' :   finale += "diciannove " ; break ;
				}
				}
			}
			
			if ( i == 3 && a != 1)
			{
				switch(stringa.charAt(i))
				{
				case '1' : finale += "uno " ; break ;
				
				case '2' : finale += "due " ; break ;
				
				case '3' : finale += "tre " ; break ;
				
				case '4' :finale += "quattro " ; break ;
				
				case '5' : finale += "cinque " ; break ;
					
				case '6' :	finale += "sei " ; break ;
					
				case '7' :  finale += "sette " ; break ;
					
				case '8' :   finale += "otto " ; break ;
					
				case '9' :   finale += "nove " ; break ;
				}
			}
		}
		
		return finale ;
	}
	
	
	public static void main(String[] args)
	{
		StringaNumeriSpeciali  sns1 = new StringaNumeriSpeciali ("8413") ;
		StringaNumeriSpeciali  sns2 = new StringaNumeriSpeciali ("ottomila quattrocento tredici") ;
		
		System.out.println(sns1.numeriToStringa()) ;
		
		System.out.println(sns2.stringaToNumeri()) ;
	}

}

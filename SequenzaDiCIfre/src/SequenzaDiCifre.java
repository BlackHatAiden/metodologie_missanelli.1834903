import java.util.Arrays;

public class SequenzaDiCifre 
{
	
	
	public char[] aggiungiCifre(String stringa,int cifre)
	{
		int conta = 0 ;
		char[] finale = new char[cifre] ;
		
		for(int i = 0 ; i < stringa.length(); i++)
			
			if(conta < cifre)
			
				switch(stringa.charAt(i) )
				{
				case '0' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '1' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '2' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '3' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '4' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '5' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '6' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '7' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '8' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
				
				case '9' : finale[conta] = stringa.charAt(i) ; conta++ ; break ;
					
				}
			else
				return finale ;
		
		return finale ;
				
	}
	
	

	public static void main(String[] args) 
	{
		
		SequenzaDiCifre s1 = new SequenzaDiCifre() ;
		
		System.out.println(Arrays.toString(s1.aggiungiCifre("tfdes1kio2", 2))) ;
	}

}


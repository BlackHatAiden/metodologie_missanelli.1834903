
public class Fattoriale
{
	
	public int getFattoriale(int n)
	{
		if(n < 0)         //oppure lancio eccezione
			return 0 ;
		
		if(n == 0)
			return 1 ;
		return n * getFattoriale(n-1) ;
	}

	public static void main(String[] args) 
	{
		
		Fattoriale f = new Fattoriale() ;
		
		System.out.println(f.getFattoriale(5)) ;
	}

}


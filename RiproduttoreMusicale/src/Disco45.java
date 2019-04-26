
public class Disco45 extends Giradischi 
{
	
	
	private final int MAX_BRANI = 2 ;
	
	
	public Disco45(String titolo,String cantante) throws FuoriRangeException
	{
		super(titolo,cantante) ;
		
		if(lunghezzaLista < MAX_BRANI) throw new FuoriRangeException() ;
			
	}
	
	

	public static void main(String[] args)
	{
		

	}

}

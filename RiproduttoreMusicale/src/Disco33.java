
public class Disco33 extends Giradischi  
{
	
	
	private final int MAX_BRANI = 14 ;
	
	
	public Disco33(String titolo,String cantante) throws FuoriRangeException
	{
		super(titolo,cantante) ;
		
		if(lunghezzaLista < MAX_BRANI) throw new FuoriRangeException() ;
			
	}
	
	
	
	
	public static void main(String[] args) 
	{

	}

}

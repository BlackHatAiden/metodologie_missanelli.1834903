
public class CompactDisc extends LettoreCD
{
	
	
	private final int MAX_BRANI = 20 ;
	
	
	public CompactDisc(String titolo,String cantante) throws FuoriRangeException
	{
		super(titolo,cantante) ;
		
		if(lunghezzaLista < MAX_BRANI) throw new FuoriRangeException() ;
			
	}
	
	
	public static void main(String[] args) 
	{
		

	}

}

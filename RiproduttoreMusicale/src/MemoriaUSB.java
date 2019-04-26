
public class MemoriaUSB extends LettoreMp3 
{
	
	
	private final int MAX_BRANI = 1024 ;
	
	
	public MemoriaUSB(String titolo,String cantante) throws FuoriRangeException
	{
		super(titolo,cantante) ;
		
		if(lunghezzaLista < MAX_BRANI) throw new FuoriRangeException() ;
			
	}
	
	public void insertBrano(int k,String t,String c)
	{
		String[] lista = new String[2] ;
		
		lista[0] = t ;
		lista[1] = c ;
		
		 super.getLista().add(k,lista) ;
		
	}
	
	
	public static void main(String[] args) 
	{
		

	}

}

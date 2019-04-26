
public class Nastro extends MangiaNastri 
{
	
	
	private int minuti ;
	private final int MAX_BRANI = minuti / 5 ;
	
	
	public Nastro(String titolo,String cantante,int minuti) throws FuoriRangeException
	{
		super(titolo,cantante) ;
		
		this.minuti = minuti ;
		
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

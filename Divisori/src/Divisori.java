
public class Divisori 
{
	private int numero ;
	
	public Divisori(int numero)
	{
		this.numero = numero ;
	}
	
	/**
	 * il metodo stampa a video i divisori propri del numero
	 */
	public void divisoriPropri()
	{
		
 		for ( int i = 1 ; i < numero ; i++)
		
			if (numero % i == 0)
			
				System.out.print(i + (i < numero/ 2  ? "," :" ")) ;
 				
		
	}
	
	
	public static void main(String[] args) 
	{
		Divisori d1 = new Divisori(20) ;
		
		d1.divisoriPropri();
		
	}

}

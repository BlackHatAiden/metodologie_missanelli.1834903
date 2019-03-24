
public class Cornice 
{
	private int numero ;
	
	public Cornice (int numero)
	{
		this.numero = numero ;
	}
	
	/**
	 * il metodo stampa a video la cornice stando attento
	 * a quando stampare il carattere su tutta la riga,
	 * oppure solo all'inizio e alla fine e quando andare a 
	 * capo
	 */
	public void stampaCornice()
	{
		int r = 0 ;
		
		
		for( int i = 0 ; i <= numero -1  ; i++)
		{
			
			while ( r < numero)
			{
				if (i == 0 || i == numero-1)
					System.out.print("*");
				else
					if(r == 0 || r == numero-1 && i != 0)
						System.out.print("*");
					
					else
						System.out.print(" ");
				
				r++ ;
			}
			r=0 ;
			System.out.print("\n");	
				
		}
					
	}
	
	public static void main(String[] args)
	{
		Cornice c1 = new Cornice(5) ;
		
		c1.stampaCornice();
	}
}


public class StampaTriangolo 
{
	private int numero ;
	
	public StampaTriangolo (int numero)
	{
		this.numero = numero ;
	}
	
	/*
	 * il metodo stampa un trinagolo isosciele con la base alta
	 */
	public void stampaIsosciele()
	{
		int spazi = 0 ;
		while( numero > 0)
		{
			
		
		for(int j = 0 ; j < numero ; j++)
					System.out.print("*");
		
		System.out.print("\n");
		spazi++ ;
		
		numero-=2;
		
		//partendo con un numero dispari e sottraendo sempre 2
		//avro sempre un numero dispari andando a capo e incrementando gli spazi
		//avro un triangolo isosciele
		if ( numero % 2 == 1)
		
			for(int k = 0 ; k < spazi ;k++)
				System.out.print(" ");
		
		
		}
			
	}
	
	/**
	 * il metodo stampa il triangolo con la punta verso l'alto
	 */
	public void stampaIsoscele2()
	{
		int spazi = numero / 2 ;
		int asterischi = 0 ;
		
		for(int  i = 0, j = 1; i < (int)(numero / 2 + 1); i++)
		{
			
			for(int k  = 0 ; k < numero ; k++)
			{
				
				if( k == spazi  )                //mi serve per capire dove iniziano gli asterischi
				
					while(j > asterischi )       // per ogni livello ne faccio asterischi
					{
					System.out.print("*");
					asterischi++ ;
					}
					
				else
					System.out.print(" ");
				
					
				
			}
			spazi-- ;  // a ogni livello gli spazi a sinistra calano di uno
			j += 2 ; // gli asterischi per livello partono da 1 poi sempre + 2
			asterischi = 0 ;  //riazzero per capire al giro successivo quanti farne
			
			System.out.print("\n");
		}
		
		
			
			
	}
	
	
	public static void main(String[] args)
	{
		StampaTriangolo t1 = new StampaTriangolo(5) ;
		
		//t1.stampaIsosciele();
		
		t1.stampaIsoscele2();
	}
}


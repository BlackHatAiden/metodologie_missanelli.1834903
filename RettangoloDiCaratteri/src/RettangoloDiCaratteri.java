
public class RettangoloDiCaratteri 
{
	private int x,y,lunghezza,altezza ;
	
	private char carattere,carattere1,carattere2 ;
	
	public RettangoloDiCaratteri(int x, int y, int lunghezza, int altezza )
	{
		this.x = x ;
		this.y = y ;
		this.lunghezza = lunghezza ;
		this.altezza = altezza ;
		
		carattere = '*' ;
		carattere1 = '*' ;
		carattere2 = '*' ;
	}
	
	/**
	 * il metodo permette di modificare la posizione del 
	 * rettangolo differentemente dal default del costruttore
	 * @param x2 new x
	 * @param y2 mew y
	 */
	public void modificaPos(int x2,int y2)
	{
		x = x2 ;
		y = y2 ;
	}
	
	/*
	 * setta il carattere da usare per realizzare
	 * il rettangolo
	 */
	public void setCarattere(char c)
	{
		carattere = c ;
	}
	
	/*
	 * setta i caratteri da usare per realizzare
	 * il rettangolo
	 */
	public void setCarattere2(char c1,char c2)
	{
		carattere1 = c1 ;
		carattere2 = c2 ;
	}
	
	
	/*
	 * il metodo stampa a video un rettangolo di caratteri verticali
	 * stando attento alla posizione di partenza (x,y)
	 */
	public void drawVerticalStripes()
	{
		//spaziatura asse y
		for(int l = 0 ; l < y ; l++)
			System.out.print("\n");
		
			
		
		for (int i = 0 ; i < altezza ; i++)
		{	
			//spaziatura asse x
			for(int k = 0 ; k < x ; k++)
				System.out.print(" ");
			
			for(int j = 0 ; j < lunghezza ; j++)
			{
				if(j % 2 == 0)
					System.out.print(carattere1);
				else
					System.out.print(carattere2);
			}
			
			System.out.print("\n");
		}
		
			
	}
	
	/*
	 * il metodo stampa a video un rettangolo di caratteri orizzontali
	 * stando attento alla posizione di partenza (x,y)
	 */
	public void drawHorizontalStripes()
	{
		//spaziatura asse y
		for(int l = 0 ; l < y ; l++)
			System.out.print("\n");
		
			
		
		for (int i = 0 ; i < altezza ; i++)
		{	
			//spaziatura asse x
			for(int k = 0 ; k < x ; k++)
				System.out.print(" ");
			
			for(int j = 0 ; j < lunghezza ; j++)
			{
				if( i % 2 == 0)
					System.out.print(carattere1);
				else 
					System.out.print(carattere2);
				
				
				
			}
			
			System.out.print("\n");
		}
		
			
	}
	
	/*
	 * il metodo restituisce il rettangolo di caratteri
	 * a modi scacchiera
	 */
	
	public void drawChessBoard()
	{
			//spaziatura asse y
			for(int l = 0 ; l < y ; l++)
				System.out.print("\n");
			
				
			
			for (int i = 0 ; i < altezza ; i++)
			{	
				//spaziatura asse x
				for(int k = 0 ; k < x ; k++)
					System.out.print(" ");
				
				for(int j = 0 ; j < lunghezza ; j++)
				{
					//scacchiera
					if( j % 2 == 0 && i % 2 == 0)
						System.out.print(carattere1);
					else 
						if( j % 2 == 1 && i % 2 == 1)
							System.out.print(carattere1);
						else
						System.out.print(carattere2);
					
					
					
				}
				
				System.out.print("\n");
			}			
		
	}
	public static void main(String[] args)
	{
		RettangoloDiCaratteri r1 = new RettangoloDiCaratteri (2,2,4,3) ;
		
		r1.modificaPos(2, 2);
		
		r1.setCarattere('w');
		
		r1.setCarattere2('$','*');
		r1.drawVerticalStripes() ;
		
		r1.drawHorizontalStripes();
		
		r1.drawChessBoard();
		
		
	}

}

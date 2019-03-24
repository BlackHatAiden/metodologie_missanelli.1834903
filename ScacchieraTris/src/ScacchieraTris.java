
public class ScacchieraTris 
{
	private String[][] scacchiera = new String[3] [3];
	
 
	
	/**
	 * il metodo permette di inserire "O" oppure "X" in una casella
	 */
	public String[] [] setMossa(int riga,int colonna,String mossa)
	{
		scacchiera[riga] [colonna] = mossa ;
		
		return scacchiera ;
	}
	
	/**
	 * il metodo stampa la scacchiera
	 */
	public void stampaScacchiera()
	{
		
		for(int i = 0 ; i < scacchiera.length ; i++)
		{
			for(int j  = 0 ; j < scacchiera[i].length ; j++)
			{
				if(j == 0)
					System.out.print("\t" + scacchiera[i] [j]) ;
				
				else if(i == scacchiera.length - 1)
					System.out.print("\t | " + scacchiera[i] [j] + (j != scacchiera[i].length -1 ?" |\t" :"")) ;
				else
					System.out.print("________| " + scacchiera[i] [j] + (j != scacchiera[i].length -1 ?" | " :"")) ;
			}
				
			
		System.out.println() ;
		}
			
	}
	
	/**
	 * il metodo stampa il vincitore
	 */
	public void risultato()
	{

		
		//diagonaled
		if(scacchiera[0][0].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][2]) )
			System.out.println("Ha vinto " + scacchiera[0][0]) ;
		
		//diaagonales
		else if(scacchiera[0][2].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][0])  )
			System.out.println("Ha vinto " + scacchiera[0][2]) ;
		
		//verticali
		else if ((scacchiera[0][0].equals(scacchiera[1][0]) && scacchiera[1][0].equals(scacchiera[2][0])) )
			System.out.println("Ha vinto " + scacchiera[0][0]) ;
			
		else if (scacchiera[0][1].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[2][1]))
			System.out.println("Ha vinto " + scacchiera[0][1]) ;
		
		else if (scacchiera[0][2].equals(scacchiera[1][2]) && scacchiera[1][2].equals(scacchiera[2][2]))
			System.out.println("Ha vinto " + scacchiera[0][2]) ;
			
		//orizzontali	
		
		else if (scacchiera[0][0].equals(scacchiera[0][1]) && scacchiera[0][1].equals(scacchiera[0][2])  )
			System.out.println("Ha vinto " + scacchiera[0][0]) ;
		
		else if (scacchiera[1][0].equals(scacchiera[1][1]) && scacchiera[1][1].equals(scacchiera[1][2])  )
			System.out.println("Ha vinto " + scacchiera[1][0]) ;
		
		else if (scacchiera[2][0].equals(scacchiera[2][1]) && scacchiera[2][1].equals(scacchiera[2][2])  )
			System.out.println("Ha vinto " + scacchiera[2][0]) ;
		
		else
			System.out.println("Pareggio") ;
			
			
			
	}
	
	public static void main(String[] args)
	{
		//collaudo fatto dal main senza dover creare la classe Tris e cambiare quindi lo stato di alcuni metodi
		
		ScacchieraTris s1 = new ScacchieraTris() ;
		
		s1.setMossa(0, 0, "O") ;
		
		s1.setMossa(0, 1, "O") ;
		
		s1.setMossa(0, 2, "O") ;
		
		s1.setMossa(1, 0, "X") ;
		
		s1.setMossa(1, 1, "O") ;
		
		s1.setMossa(1, 2, "X") ;
		
		s1.setMossa(2, 0, "O") ;
		
		s1.setMossa(2, 1, "X") ;
		
		s1.setMossa(2, 2, "O") ;
		
		s1.stampaScacchiera();
		
		s1.risultato();

	}

}

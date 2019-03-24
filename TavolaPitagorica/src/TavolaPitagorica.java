
public class TavolaPitagorica 
{
	private int n ;
	private int matrice[] [] ;
	
	public TavolaPitagorica (int n )
	{
		this.n = n ;
		
		matrice = new int [n] [n] ;
	}
	
	/**
	 * il metodo crea la tavola pitagorica attraverso 2 for
	 * e l'ausilio della variabile pitagorica che si incrementa del valore di i,
	 * quando cambia i essa si riazzera
	 * @return
	 */
	public int[] [] creaTavola()
	{
		int pitagorica = 0 ;
		
		for(int i = 0 ; i < n ; i++)
		{
			
			for(int j = 0 ; j <  n  ; j++)
			{
				matrice[i][j] = pitagorica ;
				
				pitagorica += i   ;
			}
			pitagorica = 0 ;
			
			
			
		}
		return matrice ;
	}
	
	/**
	 * stampa la tavola pitagorica attraverso 2 for annidati
	 * e l'utilizzzo del tab e l'accapo
	 */
	public void stampaTavola()
	{
		//serve per rispettare l'immagine proposta dal pdf
		for(int k = 0 ; k < matrice.length ; k++)
			System.out.print("\t" + k) ;
		
		System.out.println() ;
			
		
		
		for(int i = 0 ; i < matrice.length ; i++) 
		{ 
			System.out.print( i ) ;       //serve per rispettare l'immagine proposta dal pdf
			
			for(int j = 0 ; j < matrice[i].length ; j++) 
				System.out.print("\t"  + matrice[i][j]) ;    
	
			System.out.println() ; 
		} 
	}
	
	/**
	 * il metodo dati in input gli indici della matrice
	 * restituisce il valore nella posizione indicata
	 * @param riga 
	 * @param colonna
	 * @return matrice[riga] [colonna]
	 */
	public int getValore(int riga , int colonna)
	{
		return matrice[riga] [colonna] ;
		
	}

	public static void main(String[] args) 
	{
		
		TavolaPitagorica t1 = new TavolaPitagorica (11);
		
		t1.creaTavola();
		t1.stampaTavola();
		
		System.out.println(t1.getValore(0, 1)) ;
	}

}


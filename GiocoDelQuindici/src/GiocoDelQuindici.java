
public class GiocoDelQuindici 
{
	
	private int[] [] matrice = new int[4] [4] ;
	
	public GiocoDelQuindici()
	{
		mischia() ;
	}
	
	/**
	 * il metodo mischia random le posizioni dei quadrati
	 * nella matrice
	 * @return
	 */
	public int[][] mischia()
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0} ;
		
		int t = 0 ;
		int casuale = (int) (Math.random()*(array.length - 1)) ;
		
		for(int k = 0 ; k < array.length - 1 ; k++)                       //mischio l'array
		{
			 t = array[k] ;
			
			array[k] = array[casuale]  ;
			
			array[casuale] = t ;
			
			casuale = (int) (Math.random()*(array.length - 1)) ;
			
		}
		
		
		int indice  = 0 ;
		
		for(int i  = 0 ; i < matrice.length ; i++)                             //metto nella matrice i valori gia mischiati
		{
			
			for(int j = 0 ; j < matrice[i].length ; j++)
			{
					
						matrice[i][j] = array[indice];
						indice++ ;
						
						
					
			}
		
		}
		matrice[matrice.length-1][matrice.length-1] = 0 ;
		return matrice ;

	}
	
	
	/**
	 * il metodo prende in ingresso le cordinate e la direzione in cui spostare
	 * il quadrato e riaggiorna la matrice
	 * @param x righe
	 * @param y colonne
	 * @param direzione 0(su) , 1(destra) , 2(sinistra) , 3(giu)
	 * @return matrice
	 */
	public int[][] scorri(int x, int y, int direzione)
	{
		
		int t = 0 ;
		
		int posx = 0 ;
		int posy = 0 ;
		
		for(int i = 0 ; i < matrice.length ; i++)                        //capisce dove si trova il vuoto
			
			for(int k  = 0 ; k < matrice[i].length ; k++)
				
				if(matrice[i] [k] == 0)
				{
					posx = i ;
					posy = k ;
				}
		
		if(x == posx && y == posy)                                   //set possibili mosse se l'utente sbaglia restituisce semplicemente la matrice senza modificarla
		{
			t = matrice[x] [y] ;
			
			if( x != 0 && direzione == 0)
			{
				matrice[x] [y] = matrice[x-1] [y] ;
				matrice[x-1] [y] = t ;
			}
			
			else if( x != 3 && direzione == 3)
			{
				matrice[x] [y] = matrice[x+1] [y] ;
				matrice[x+1] [y] = t ;
			}
			
			else if( y != 3 && direzione == 1)
			{
				matrice[x] [y] = matrice[x] [y+1] ;
				matrice[x] [y+1] = t ;
			}
			
			else if( y != 0 && direzione == 2)
			{
				matrice[x] [y] = matrice[x] [y-1] ;
				matrice[x] [y-1] = t ;
			}
			
		}
		else
			System.out.println("Mossa sbagliata puoi muovere solo lo 0(vuoto)") ;
		
		return matrice ;
		
	}
	
	/**
	 * il metodo ritorna true se scorrendo la matrice trova i valori in
	 * ordine crescente da 1 a 15 e in ultima posizione 0
	 * altrimenti false
	 * @return true o false
	 */
	public boolean vinto()
	{
		int numero = 0 ;
		
		for(int i = 0 ; i < matrice.length ; i++)
			
			for(int j = 0 ; j < matrice[i].length ; j++)
			{
				if(j == matrice[i].length -1 && i == matrice.length - 1 )   //per lasciare ultima posizione libera
					numero = 0 ;
				
				if(matrice[i] [j] != numero)
					return false ;
		
				numero++ ;
			}
		
		return true ;
	}
	
	/**
	 * il metodo stampa la matrice del gioco
	 */
	public void stampaGioco()
	{
		for(int i = 0 ; i < matrice.length ; i++) 
		{ 
			
			
			for(int j = 0 ; j < matrice[i].length ; j++) 
				System.out.print("\t"  + matrice[i][j]) ;    
	
			System.out.println() ; 
		} 
	}
	
	public static void main(String[] args) 
	{
		GiocoDelQuindici g1 = new GiocoDelQuindici() ;
		
		g1.stampaGioco();
		
		g1.mischia() ;
		
		System.out.println();
		g1.stampaGioco();
		
		g1.scorri(3,3,0) ;
		System.out.println();
		g1.stampaGioco();
		
		
		

	}

}

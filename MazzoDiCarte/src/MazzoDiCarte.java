import java.util.Arrays;

public class MazzoDiCarte 
{
	private String[] mazzo = new String[52] ;
	
	/**
	 * Costruttore che inizializza il mazzo di carte 
	 * facendo uso della classe carta in particolare il
	 * metodo cartaToString
	 */
	public MazzoDiCarte()
	{
		
		for(int i = 0 ; i < 52 ; i++)
			mazzo[i] = Carta.cartaToString() ;
		
		
	}
	
	
	/**
	 * il metodo crea un nuovo array di stringhe che rappresenta
	 * il mazzo mescolato, la mescolazione avviene attraverso un 
	 * for con al suo interno lo scambio di valori ad indici random
	 * per 52 permutazioni e alla fine sovrascrive il mazzo originale
	 * @return mazzoMescolato
	 */
	public String[] mescolaMazzo()
	{
		String t = "" ;
		
		String[] mazzoMescolato = Arrays.copyOf(mazzo,mazzo.length) ;
		
		int casuale = 0 ;
		
		for(int j = 0 ; j < 52 ; j++)
		{
		    casuale = (int)(Math.random()*(mazzo.length - 1)) ;
			
			t = mazzoMescolato[j] ;
			
			mazzoMescolato[j] = mazzoMescolato[casuale] ;
			
			mazzoMescolato[casuale] = t ;
		}
		
		mazzo = mazzoMescolato ;
		return  mazzo;
	}
	
	/**
	 * il metodo distribuisce tutte le carte del mazzo 
	 */
	public void distribuisciCarta()
	{
		for(int k = 0 ; k < mazzo.length ; k++)
			System.out.println(mazzo[k]) ;
		
		System.out.println("Fine Mazzo") ;
	}

	public static void main(String[] args) 
	{
		
		MazzoDiCarte m1 = new MazzoDiCarte() ;
		
		
		System.out.println(Arrays.toString(m1.mazzo)) ;
		
		System.out.println(Arrays.toString(m1.mescolaMazzo())) ;
		
		m1.distribuisciCarta();
		
		

	}

}

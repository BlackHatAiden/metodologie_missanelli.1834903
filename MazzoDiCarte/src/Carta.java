public class Carta 
{
	static final private String[] valore = {" Asso ","Due ","Tre ","Quattro ","Cinque ","Sei ","Sette ","Otto ","Nove ","Jack ","Donna ","Re "} ;
	static final private String[] seme = {" Picche ","Cuori ","Fiori ","Quadri "} ;
	
	/**
	 * il metodo visualizza la scelta casuale della carta
	 * compresa tra gli indici dei rispettivi array
	 * @return
	 */
	 public static String cartaToString()
	{
		return valore[(int)(Math.random()*valore.length)] +"di "+ seme[(int)(Math.random()*seme.length)] +"\n" ;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(Carta.cartaToString()) ;
	}

}

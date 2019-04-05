
public class Corvo extends Uccello
{
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il verso
	 */
	@Override
	public String emettiVerso()
	{
		String verso = "Cruah" ;
		
		return verso ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il numero di zampe
	 */
	@Override
	public int getNumeroDiZampe()
	{
		int zampe = 2 ;
		
		return zampe ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con la taglia giusta
	 */
	public Taglia getTaglia()
	{
		return Taglia.MEDIA ;
	}

	public static void main(String[] args) 
	{
		

	}

}

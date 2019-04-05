
public class Tigre extends Animali
{
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il verso
	 */
	@Override
	public String emettiVerso()
	{
		String verso = "Uauah" ;
		
		return verso ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il numero di zampe
	 */
	@Override
	public int getNumeroDiZampe()
	{
		int zampe = 4 ;
		
		return zampe ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con la taglia giusta
	 */
	public Taglia getTaglia()
	{
		return Taglia.GRANDE ;
	}

	public static void main(String[] args) 
	{
		

	}

}

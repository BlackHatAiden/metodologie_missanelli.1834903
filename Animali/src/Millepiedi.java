
public class Millepiedi extends Mammifero
{
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il verso
	 */
	@Override
	public String emettiVerso()
	{
		String verso = "Brrr" ;
		
		return verso ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con il numero di zampe
	 */
	@Override
	public int getNumeroDiZampe()
	{
		int zampe = 1000 ;
		
		return zampe ;
	}
	
	/**
	 * il metodo sovrascrive il vecchio aggiornandolo con la taglia giusta
	 */
	public Taglia getTaglia()
	{
		return Taglia.PICCOLA ;
	}
	
	public static void main(String[] args) 
	{
		

	}

}

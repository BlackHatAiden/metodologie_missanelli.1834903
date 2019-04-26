
public class Ciccio extends SquadraDisney implements DoppiaVita
{
	/**
	 * il metodo ritorna un ogetto di tipo Ciccionik ovvero identita segreta
	 */
	public Object assumiIdentitaSegreta() 
	{
		return new Ciccionik() ;
	}
	
	/**
	 * il metodo ritorna un ogetto di tipo Ciccio ovvero identita publica
	 */
	public Object assumiIdentitaPublica()
	{
		return new Ciccio() ;
	}
	
	/**
	 * classe annidata privata
	 * @author matte
	 *
	 */
	private class Ciccionik extends Ciccio implements Supereroe
	{
		
		
		
		public void attacca()
		{
			System.out.println("Panzata") ;
		}
	}
	
	public static void main(String[] args) 
	{
		

	}

}





public class PeterParker extends SquadraMarvel implements DoppiaVita
{
	/**
	 * il metodo ritorna un ogetto di tipo Spiderman ovvero identita segreta
	 */
	public Object assumiIdentitaSegreta() 
	{
		return new Spiderman() ;
	}
	
	/**
	 * il metodo ritorna un ogetto di tipo PeterParker ovvero identita publica
	 */
	public Object assumiIdentitaPublica()
	{
		return new PeterParker() ;
	}
	
	/**
	 * classe annidata privata
	 * @author matte
	 *
	 */
	private class Spiderman extends PeterParker implements Supereroe
	{
		
		
		
		public void attacca()
		{
			System.out.println("Ragnatela") ;
		}
	}
	
	public static void main(String[] args) 
	{
		

	}

}



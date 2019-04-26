
public class Pippo extends SquadraDisney implements DoppiaVita
{
	/**
	 * il metodo ritorna un ogetto di tipo SuperPippo ovvero identita segreta
	 */
	public Object assumiIdentitaSegreta() 
	{
		return new SuperPippo() ;
	}
	
	/**
	 * il metodo ritorna un ogetto di tipo Pippo ovvero identita publica
	 */
	public Object assumiIdentitaPublica()
	{
		return new Pippo() ;
	}
	
	/**
	 * classe annidata privata
	 * @author matte
	 *
	 */
	private class SuperPippo extends Pippo implements Supereroe
	{
		
		
		
		public void attacca()
		{
			System.out.println("Calciata") ;
		}
	}
	
	public static void main(String[] args) 
	{
		

	}

}




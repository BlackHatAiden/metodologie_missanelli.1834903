
public class Paperino extends SquadraDisney implements DoppiaVita
{
	/**
	 * il metodo ritorna un ogetto di tipo Paperinik ovvero identita segreta
	 */
	public Object assumiIdentitaSegreta() 
	{
		return new Paperinik() ;
	}
	
	/**
	 * il metodo ritorna un ogetto di tipo Paperino ovvero identita publica
	 */
	public Object assumiIdentitaPublica()
	{
		return new Paperino() ;
	}
	
	/**
	 * classe annidata privata
	 * @author matte
	 *
	 */
	private class Paperinik extends Paperino implements Supereroe
	{
		
		
		
		public void attacca()
		{
			System.out.println("Beccata") ;
		}
	}
	
	public static void main(String[] args) 
	{
		

	}

}

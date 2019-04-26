import java.util.ArrayList;
import java.util.List;

public class Campo 
{
	private List<Object> disney = new ArrayList<Object>() ;
	
	private List<Object> marvel = new ArrayList<Object>() ;
	
	
	/**
	 * il campo viene costruito attraverso i personaggi(Ogetti) e vengono distinti in
	 * squadra marvel e disney
	 * @param personaggi
	 */
	public Campo(Object...personaggi)
	{
		for(int k = 0 ; k < personaggi.length ; k++)
			
			if(personaggi[k] instanceof  SquadraDisney ) 
				
				disney.add(personaggi[k]) ;
			else
				marvel.add(personaggi[k]) ;
	}
	
	/**
	 * il metodo restituisce la lista marvel
	 */
	public List<Object> getMarvel()
	{
		
		return marvel ;
	}
	
	/**
	 * il metodo restituisce la lista disney
	 */
	public List<Object> getDisney()
	{
		
		return disney ;
	}

	public static void main(String[] args) 
	{
		Campo c1 = new Campo(new Paperino(),new Ciccio(),new Magneto()) ;
		
		
		System.out.println(c1.getDisney()) ;
		
		System.out.println(c1.getMarvel()) ;
	}

}

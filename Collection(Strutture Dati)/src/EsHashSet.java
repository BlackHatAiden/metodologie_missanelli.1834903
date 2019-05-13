import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EsHashSet<T> 
{
	private Set<T> insiemeHash = new HashSet<T> () ;
	
	public EsHashSet (T...valori)
	{
		for(int i = 0 ; i < valori.length ; i++)
			insiemeHash.add(valori[i]) ;
		
		
	}
	
	
	/**
	 * il metodo ritorna l'insieme
	 * @return
	 */
	public Set<T> getInsieme()
	{
		return insiemeHash ;
	}
	
	/**
	 * il metodo aggiunge un elemento all'insieme
	 * @param valore
	 */
	public void  add(T valore)
	{
		insiemeHash.add(valore) ; 
	}
	
	
	
	//L'ordine negli HashSet è dato dalla tabella di Hash e non ci sono ripetizioni
	//spesso si ridefiniscono equals e hashCode per determinare quando due Ogetti sono effettivamente uguali
	//tralasciando la creazione della classe Persona ma focalizzandomi sui metodi equals e hascode
	
	public static class Persona
	{
		private String nome ;
		private String cognome ;
		
		public Persona(String nome,String cognome)
		{
			this.cognome = nome ;
			this.cognome = cognome ;
		}
		
		
		
		@Override
		public boolean equals(Object o)
		{
			if(o == null || getClass() != o.getClass() )
				return false ;
			
			Persona other = (Persona) o ;
			
			return nome.equals(other.nome) && cognome.equals(other.cognome) ;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(nome,cognome) ;
		}
	}

	public static void main(String[] args) 
	{
		EsHashSet h = new EsHashSet("aaa","ccc","bbb","ccc") ;
		
		h.add("cv") ;
		
		h.add("cvi") ;
		
		System.out.println(h.getInsieme()) ;
		
		
		
		

	}

}

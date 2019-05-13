import java.util.HashSet;
import java.util.Set;

public class EsTreeSet<T> implements Comparable
{
	private Set<T> insiemeHash = new HashSet<T> () ;
	
	
	public EsTreeSet (T...valori)
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
	
	//L'Ordine del TreeSet avviene attraverso l'implementazione di Comparable e ridefinendo compareTo
	//il metodo per essere implementato bene non deve sfruttare i generici ma per esempio le stringhe  e si scrivera 
	
	// CAMPO.compareTo(((OGETTO) o).CAMPO)
	@Override
	public int compareTo(Object o)
	{
		return 0 ;
	}

	public static void main(String[] args) 
	{
		EsTreeSet t = new EsTreeSet("aa","cc","bb","bb") ;
		
		System.out.println(t.getInsieme()) ;

	}

}

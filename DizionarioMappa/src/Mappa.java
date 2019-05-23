import java.util.HashMap;
import java.util.Map;

public class Mappa implements Dizionario
{
	private Map<Chiave,Elemento> mappa ;
	
	public Mappa()
	{
		mappa = new HashMap<Chiave,Elemento>() ;
	}

	
	/**
	 * il metodo cerca nella mappa la chiave desiderata se esiste restituisce l'elemento altrimenti lancia eccezione
	 * @throws ElementAlreadyContainedException 
	 */
	@Override
	public Elemento search(Chiave k) throws ElementAlreadyContainedException 
	{
		for(Chiave c : mappa.keySet())
			if(c.equals(k))
				return mappa.get(k);
		
		throw new ElementAlreadyContainedException() ;
		
		
	}
	
	/**
	 * il metodo aggiunge una coppia chiave,valore se essa non esiste quindi scorre la mappa e confronta le chiavi se trova un match lancia l'eccezione
	 * @throws ElementAlreadyContainedException 
	 */
	@Override
	public void add(Chiave k, Elemento e) throws ElementAlreadyContainedException 
	{
		for(Chiave c : mappa.keySet())
			if(c.equals(k))
				throw new ElementAlreadyContainedException() ;
		
		mappa.put(k,e) ;
		
		
	}
	
	/**
	 * il metodo scorre tutta la mappa e confronta le chiavi con quella da eliminare se alla fine non trova un match lancia l'eccezione
	 * @throws ElementNotFoundException 
	 */
	@Override
	public Elemento delate(Chiave k) throws ElementNotFoundException 
	{
		for(Chiave c: mappa.keySet())
			if(c.equals(k))
				return mappa.remove(k) ;
				 
		throw new ElementNotFoundException() ;
		
	}

	/**
	 * il mteodo restituisce la lunghezza della mappa
	 */
	@Override
	public int size() 
	{
		return mappa.size() ;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null || o.getClass() != getClass())
			return false ;
		
		Chiave obj = (Chiave) o ;
		
		
		return ((Chiave) o).getChiave().equals(obj.getChiave()) ;
	}
	
	
	public static void main(String[] args) throws ElementAlreadyContainedException, ElementNotFoundException 
	{
		Mappa m = new Mappa() ;
		
		Chiave c1 = new Chiave(1) ;
		Chiave c2 = new Chiave(2) ;
		Chiave c3 = new Chiave(3) ;
		
		m.add(new Chiave(1), new Elemento("ciao")) ;
		
		m.add(c2, new Elemento("hey")) ;
		
		m.add(c3, new Elemento("bella")) ;
		
		System.out.println(m.size()) ;
		
		//m.add(c3, new Elemento("ooo")) ; 
		
		System.out.println(m.search(c2) ) ;
		
		System.out.println(m.delate(c2) ) ;
		
		

	}

}

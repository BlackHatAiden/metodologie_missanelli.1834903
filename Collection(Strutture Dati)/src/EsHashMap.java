import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



public class EsHashMap <T,R>
{
	private Map<T,R> mappa = new HashMap<T,R>() ;
	
	private T chiave ;
	private R valore ;
	
	public EsHashMap(T chiave, R valore)
	{
		this.chiave = chiave ;
		this.valore = valore ;
		
		mappa.put(chiave, valore) ;
	}
	
	//getter
	public Map<T,R> getMap()
	{
		return mappa ;
	}
	
	/**
	 * il metodo aggiunge una coppia chiave valore siccome si parla di hashMap le chiavi-valori identiche non verranno inserite
	 * @param chiave
	 * @param valore
	 */
	public void addMap(T chiave,R valore)
	{
		mappa.put(chiave, valore) ;
	}
	
	//in generale si ridefinisce sempre equals e hashCode quando si parla di hash per capire quando sono identici due Ogetti

	@Override
	public boolean equals(Object o)
	{
		if(o == null || getClass() != o.getClass() )
			return false ;
		
		EsHashMap other = (EsHashMap) o ;
		
		return chiave.equals(other.chiave) && valore.equals(other.valore) ;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(chiave,valore) ;
	}
	
	
	public static void main(String[] args) 
	{
		EsHashMap m = new EsHashMap(1,"ciao") ;
		
		m.addMap(2, "Hey") ;
		
		m.addMap(1,"ciao") ;
		
		System.out.println(m.getMap()) ;

	}

}

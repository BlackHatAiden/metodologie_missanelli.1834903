import java.util.HashMap;
import java.util.Map;




public class EsTreeMap <T,R> implements Comparable<T>
{
	private Map<T,R> mappa = new HashMap<T,R>() ;
	
	private T chiave ;
	private R valore ;
	
	public EsTreeMap(T chiave, R valore)
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
	
	//in generale si ridefinisce sempre compareTo implementando Comparable per definire l'ordine degli elementi in generale fatto sulle chiavi 
	// CHIAVE.compareTo((OGETTO) o).CHIAVE) ? 0 : VALORE.compareTo((OGETTO) o).VALORE)

	@Override
	public int compareTo(Object o)
	{
		return 0 ;
	}
	
	
	public static void main(String[] args) 
	{
		EsTreeMap m = new EsTreeMap(1,"ciao") ;
		
		m.addMap(2, "Hey") ;
		
		m.addMap(1,"ciao") ;
		
		m.addMap(0,"bella") ;
		
		m.addMap(3,"oh") ;
		
		System.out.println(m.getMap()) ;

	}

}

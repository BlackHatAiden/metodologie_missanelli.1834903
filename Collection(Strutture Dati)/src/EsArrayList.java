import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EsArrayList implements Iterable<Integer>
{
	private List<Integer> lista = new ArrayList<Integer>()  ;
	
	public EsArrayList(int ...valori)      // sintassi che equivale a creare un array di valori percio per inserirli uso un for
	{
		for(int i = 0 ; i < valori.length ; i++)
			lista.add(valori[i]) ;
	}
	
	/**
	 * il metodo restituisce la lista
	 * @return
	 */
	public List<Integer> getLista()
	{
		return lista ;  
	}
	
	/**
	 * il metodo aggiunge in coda l'elemento valore
	 * @param valore
	 */
	public void addVal(int valore)
	{
		lista.add(valore) ;
	}
	
	
	/**
	 * il metodo restituisce un ogetto iterabile
	 */
	@Override
	public Iterator<Integer> iterator()
	{
		return new EsArrayListIterabile() ;
	}
	
	/**
	 * classe annidata
	 * @author matte
	 *
	 */
	private class EsArrayListIterabile implements Iterator<Integer>
	{
		int val = 0 ;
		
		/**
		 * il metodo restituisce true se esiste un successivo elemento altrimenti false
		 */
		@Override
		public boolean hasNext() 
		{ 
			return val < lista.size() ; 
			
		}
		
		/**
		 * il metodo restituisce il valore successivo se esiste null altrimenti  (in questo caso si usa il get perche ci stiamo riferendo all ArrayList)
		 */
		@Override
		public Integer next() 
		{ 
			return hasNext() ? lista.get(val++) : null ;       
			
		}
	}

	public static void main(String[] args) 
	{
		
		EsArrayList l = new EsArrayList(1,2,3,4) ;
		
		System.out.println(l.getLista()) ;
		
		l.addVal(5);
		System.out.println(l.getLista()) ;
		
		
		//se si vuole iterare in questo modo si deve implementare Itrable 
		//e quindi sovrescrivere next e hasNext
		//tutte le collection sono iterabili
		for(Integer k : l)
			System.out.println(k) ;
			
	}

}

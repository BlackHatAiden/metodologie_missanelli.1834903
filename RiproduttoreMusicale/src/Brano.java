import java.util.ArrayList;
import java.util.List;

public class Brano 
{
	private String titolo ;
	private String cantante ;
	
	private String[] semiLista = new String[2] ;
	
	private  List<String[]> lista = new ArrayList<String[]>() ;
	
	public static int lunghezzaLista = 0 ;
	
	
	public Brano(String titolo,String cantante)
	{
		this.titolo = titolo ;
		this.cantante = cantante ;
		
		// carico nella lista di stringhe titolo e cantante
		semiLista[0] = titolo ;
		semiLista[1] = cantante ;
		
		lista.add(semiLista) ;      // aggiungo all' arrayList la lista fatta da titolo e cantante
		
		lunghezzaLista++ ;
	
	}
	
	/**
	 * il metodo ritorna la lista
	 * @return lista
	 */
	public List<String[]> getLista()
	{
		return lista ;
	}
	
	/**
	 *il metodo aggiunge all'ArrayList il nuovo brano formato da un titolo e cantante  (avrei potuto passare anche un nuovo ogetto di tipo brano (Brano b)  new Brano("",""))
	 * @param t
	 * @param c
	 */
	public void addLista(String t,String c)
	{
		semiLista[0] = t ;
		semiLista[1] = c ;
		
		lista.add(semiLista) ;
		
		lunghezzaLista++ ;
	}
	
	
	/**
	 * il metodo restituisce il titolo del brano alla posizione seleziona
	 * @param seleziona
	 * @return titolo
	 */
	public  String getTitolo(int seleziona)
	{
		return lista.get(seleziona)[0] ;      //lista.get() mi restituira una lista fatta di un titolo e un cantante percio [0] mi dara il titolo
	}
	
	/**
	 * il metodo restituisce il cantante del brano alla posizione seleziona
	 * @param seleziona
	 * @return cantante
	 */
	public  String getCantante(int seleziona)
	{
		return lista.get(seleziona)[1] ;
	}

	public static void main(String[] args) 
	{
		

	}

}

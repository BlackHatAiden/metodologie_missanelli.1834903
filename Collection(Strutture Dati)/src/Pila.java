import java.util.ArrayList;
import java.util.List;

public class Pila<T> 
{
	private int dimensione ;
	private List<T> lista  ;
	
	public Pila(int dimensione)
	{
		this.dimensione = dimensione ;
		lista = new ArrayList<T>(dimensione) ;
	}
	
	/**
	 * il metodo mette un elemento in cima alla pila
	 * @param elemento
	 */
	public void push(T elemento)
	{
		lista.add(elemento) ;
	}
	
	/**
	 * il metodo elimina l'elemento in cima alla pila e restituisce il nuovo elemento in cima
	 * @return lista.get(lista.size()-1)
	 */
	public T pop()
	{
		if(lista.size() > 1)
		{
			lista.remove(lista.size()-1) ;
			return peek() ;
		}
		else
			return null ;
	}
	
	/**
	 * il metodo restituisce l'elemento in cima alla pila
	 * @return lista.get(lista.size()-1)
	 */
	public T peek()
	{
		return lista.get(lista.size()-1) ;
	}

	/**
	 * il metodo restituisce true se la lista continene almeno un elemento altrimenti false
	 * @return
	 */
	public boolean isEmpty()
	{
		if(lista.size() >= 1)
			return false ;
		
		return true ;
	}
	
	/**
	 * il metodo ritorna la lista
	 * @return lista
	 */
	public List<T> getLista()
	{
		return lista ;
	}
	
	public static void main(String[] args) 
	{
		Pila p = new Pila(3) ;
		
		System.out.println(p.isEmpty()) ;
		System.out.println(p.getLista()) ;
		
		p.push(5);
		System.out.println(p.getLista()) ;
		System.out.println(p.isEmpty()) ;
		
		p.push(6);
		System.out.println(p.getLista()) ;
		
		System.out.println(p.pop()) ;

	}

}

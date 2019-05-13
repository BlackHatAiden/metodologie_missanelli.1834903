import java.util.Iterator;

/**
 * La nostra lista linkata
 *
 */
public class EsLinkedListGeneric<T> implements Iterable<T>
{
	protected Elemento<T> primo;
	
	public EsLinkedListGeneric(T... valori)
	{
		for (T val : valori) 
			add(val) ;
	}
	
	/**
	 * Aggiunge in testa alla lista
	 * @param val valore da aggiungere
	 */
	public void add(T val)
	{
		/*
		// aggiunge in testa
		primo = new Elemento<T>(val, primo);
		*/
		if (primo == null)
			primo = new Elemento<T>(val);
		else
		{
			Elemento<T> e = primo;
			while(e.succ != null) e = e.succ;
			e.succ = new Elemento<T>(val);
		}
	}
	
	/**
	 * il metodo ritorna un ogetto iterator
	 */
	@Override
	public Iterator<T> iterator()
	{
		return new EsLinkedListGenericIterator();
	}
	
	/**
	 * classe annidata
	 */
	private class EsLinkedListGenericIterator implements Iterator<T>
	{
		private Elemento<T> elemento = primo;
		
		@Override
		public boolean hasNext()
		{
			return elemento != null;
		}
		
		@Override
		public T next()
		{
			Elemento<T> next = elemento;
			
			if (hasNext()) 
				elemento = elemento.succ;
			
			return next.val;
		}
	}
	

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("[");
		Elemento<T> e = primo;
		while(e != null)
		{
			// e.val contiene un valore
			sb.append(e.val);
			
			// e.succ contiene il riferimento al prossimo elemento
			e = e.succ;
			
			if (e != null) 
				sb.append(",");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	
	public void clear()
	{
		primo = null;
	}
	
	/**
	 * Classe che rappresenta un elemento della lista
	 *
	 */
	protected static class Elemento<E>
	{
		/**
		 * Valore di un elemento
		 */
		protected E val;
		
		/**
		 * Elemento successivo della lista
		 */
		protected Elemento<E> succ;
		
		public Elemento(E val, Elemento<E> succ) 
		{ 
			this.val = val ; 
			
			this.succ = succ; 
			
		}
		
		public Elemento(E val) 
		{ 
			this(val, null) ; 
			
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(new EsLinkedListGeneric<Integer>().toString());
		System.out.println(new EsLinkedListGeneric<Integer>(2).toString());
		System.out.println(new EsLinkedListGeneric<Integer>(2, 3, 10).toString());

		EsLinkedListGeneric<String> l 
					= new EsLinkedListGeneric<>("abc", "def", "ghi");
		System.out.println(l);
		
		for (String s : l)
			System.out.println(s);
	}
}

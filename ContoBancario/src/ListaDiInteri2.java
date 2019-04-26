import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Rendere iterabile la ListaDiInteri mediante iteratore classe interna
 * @author navigli
 *
 */
public class ListaDiInteri2 implements Iterable<Integer>
{
	int[] interi;
	
	public ListaDiInteri2(int... interi)
	{
		this.interi = Arrays.copyOf(interi, interi.length);
	}
	
	@Override
	public Iterator<Integer> iterator()
	{
		return new ListaDiInteriIterator();
	}

	class ListaDiInteriIterator implements Iterator<Integer>
	{
		private int k;
		
		@Override
		public boolean hasNext() { return k < interi.length; }
		@Override
		public Integer next() { return interi[k++]; }
	}


	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(7);
		
		for (Integer k : l)
			System.out.println(k);
		
		ListaDiInteri2 l2 = new ListaDiInteri2(1, 2, 3, 4, 5);
		for (int k : l2)
			System.out.println(k);
		
		Iterator<Integer> i = l2.iterator();
		while(i.hasNext())
		{
			int k = i.next();
			System.out.println(k);
		}
		
	}
}

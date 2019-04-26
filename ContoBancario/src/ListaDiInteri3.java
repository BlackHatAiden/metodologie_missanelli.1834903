import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Rendere iterabile la ListaDiInteri mediante iteratore classe anonima
 * @author navigli
 *
 */
public class ListaDiInteri3 implements Iterable<Integer>
{
	private int[] interi;
	
	public ListaDiInteri3(int... interi)
	{
		this.interi = Arrays.copyOf(interi, interi.length);
	}
	
	@Override
	public Iterator<Integer> iterator()
	{
		return new Iterator<Integer>()
				{
					private int k;
					
					@Override
					public boolean hasNext() { return k < interi.length; }
					@Override
					public Integer next() { return interi[k++]; }
				};
	}

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(7);
		
		for (Integer k : l)
			System.out.println(k);
		
		ListaDiInteri3 l2 = new ListaDiInteri3(1, 2, 3, 4, 5);
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

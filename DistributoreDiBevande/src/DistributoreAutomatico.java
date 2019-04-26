import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistributoreAutomatico 
{

	private List<Prodotto> prodotti = 
			new ArrayList<>();
	
	private final int NUMERO_PRODOTTI;
	
	public DistributoreAutomatico(final int N)
	{
		NUMERO_PRODOTTI = N;
	}
	
	public void carica()
	{
		Random rand = new Random();
		for (int k = 0; k < NUMERO_PRODOTTI; k++)
		{
			Prodotto p = null;
			switch(rand.nextInt(3))
			{
				case 0: p = new BarraDiCioccolato(); break;
				case 1: p = new BottigliaDAcqua(); break;
				case 2: p = new GommeDaMasticare(); break;
			}
			prodotti.add(p);
		}
	}
	
	public Prodotto getProdotto(int k)
	{
		return prodotti.set(k, null);
	}
	
	public static void main(String[] args)
	{
		double p = BottigliaDAcqua.PREZZO;
		double p2 = BarraDiCioccolato.PREZZO;
		
		new BarraDiCioccolato();
		new BarraDiCioccolato();
		new BarraDiCioccolato();
		
	}

}

/**
 * Espressione generica
 * @author navigli
 *
 */
abstract public class Espressione
{
	/**
	 * Restituisce il valore dell'espressione
	 * @return il valore attuale dell'espressione
	 */
	abstract public double getValore();
	
	public static void main(String[] args)
	{
		// –(5+(3/2)-2)*x
		Variabile x = new Variabile("x", 3);
		
		Espressione e = 
				new Prodotto(
					new EspressioneNegata(
						new Sottrazione(
							new Somma(
								new Costante(5), 
								new Divisione(
									new Costante(3),
									new Costante(2)
								)
							),
							new Costante(2)
						)
					),
					x);
		
		System.out.println(e.getValore());
		x.setValore(42);
		System.out.println(e.getValore());
		System.out.println(e);
	}
}


public class BarraDiEnergiaPercentuale extends BarraDiEnergia
{
	
	//si costruisce o prendendo quello di default senza parametri e quindi non metto nulla
	//oppure iniziallizzo il costruttore con super
	public BarraDiEnergiaPercentuale(double energiaIniziale)
	{
		super(energiaIniziale) ;
	}
	
	/**
	 * il metodo sovrascive il vecchio e aggiunge alla fine della stringa riutilizzando il metodo
	 * stampaSalute la percentuale dell'energia
	 */
	@Override
	public String toString()
	{
		String stringa = stampaSalute() ;
		
		stringa += " " + energia*100 + "% " ;
		
		return stringa ;
	}

	public static void main(String[] args) 
	{
		BarraDiEnergiaPercentuale b1 = new BarraDiEnergiaPercentuale(1.0) ;
		
		System.out.println(b1.toString()) ;

	}

}

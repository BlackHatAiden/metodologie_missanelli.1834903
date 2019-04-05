import java.util.Arrays;

public class BarraDiEnergia 
{
	public static final double MAX = 1.0;
	
	/**
      * energia attuale della barra
	  */
	protected double energia;

	/**
	  * storico dei valori
	  */
	private double[] storico = new double[0]; // analogo a: = new double[] { };

	public BarraDiEnergia(double energiaIniziale)
	{
		setEnergia(energiaIniziale);

		// inizializza la grafica della barra
	}

	public BarraDiEnergia() { this(MAX); }    //riutilizza il costruttore con la sintassi this

	/**
	  * getter per l'energia
	  */
	public double getEnergia() { return energia; }

	/**
	 * il metodo azzera l'energia
	 */
	public void azzera() { setEnergia(0.0); }

	/**
	 * il metodo controlla l'energia e ritorna true se e' uguale a max
	 * @return true o false
	 */
	public boolean isPiena() { return energia == MAX; }

	/**
	 * il metodo allunga l'array
	 * @param a
	 * @return array nuovo
	 */
	private static double[] allarga(double[] a)
	{
		// in alternativa a copyOf:
					/*
					double[] nuovoStorico = new double[storico.length+1];
					for (int k = 0; k < storico.length; k++) nuovoStorico[k] = storico[k];
					nuovoStorico[storico.length-1] = energia;
					storico = nuovoStorico;
					 */
		
		return Arrays.copyOf(a, a.length+1);
	}
	
	/*
	 * il metodo setta l'energia e tiene traccia dello storico delle energie
	 */
	private void setEnergia(double nuovaEnergia)
	{
		if (nuovaEnergia > MAX) energia = MAX;
		else if (nuovaEnergia < 0.0) energia = 0.0;
		else energia = nuovaEnergia;

		storico = allarga(storico);

		storico[storico.length-1] = energia;
		
	}

	/*
	 * il metodo incrementa l'energia controllando se e' sempre nei limiti 0-1
	 */
	public void incrementaEnergia(BarraDiEnergia barra)
	{
		setEnergia(energia+barra.energia);
	}

	/**
	 * il metodo ritorna la nuova copia dell'array storico
	 * @return
	 */
	public double[] toArray() 
	{ 
		return Arrays.copyOf(storico, storico.length) ; 
	}

	/**
	 * il metodo ritorna la rappresentazione grafica della salute con gli asterischi
	 */
	public String stampaSalute()
	{

		String s = "";
		int numeroAsterischi = (int)(energia*10.0);
		for (int k = 0; k < numeroAsterischi; k++) s += "*";
		return s;

		
	}

	public static void main(String[] args) 
	{
		BarraDiEnergia b1 = new BarraDiEnergia() ;
		BarraDiEnergia b2 = new BarraDiEnergia(0.5) ;
		
		System.out.println(Arrays.toString(b1.toArray())) ;
		System.out.println(Arrays.toString(b2.toArray())) ;
		
		System.out.println(b1.stampaSalute()) ;
		System.out.println(b2.stampaSalute()) ;
		
		b2.incrementaEnergia(new BarraDiEnergia(0.5));
		System.out.println(Arrays.toString(b2.toArray())) ;
		System.out.println(b2.stampaSalute()) ;
		

	}

}

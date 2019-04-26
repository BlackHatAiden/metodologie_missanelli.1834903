
public class Costante extends EspressioniMatematiche 
{
	private double valore ;
	
	public Costante(double valore)
	{
		this.valore = valore ;
	}
	
	/**
	 * il metodo sovrescrive il vecchio e ritorna il valore 
	 */
	@Override
	public double getValore()
	{
		return valore ;
	}

	public static void main(String[] args) 
	{
		

	}

}

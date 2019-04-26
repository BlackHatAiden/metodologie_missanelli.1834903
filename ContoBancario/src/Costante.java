
public class Costante extends Espressione
{
	private double valore;
	
	public Costante(double valore)
	{
		this.valore = valore;
	}
	
	@Override
	public double getValore() { return valore; }

	@Override
	public String toString() { return ""+valore; }
}


public class Somma extends EspressioneBinaria
{
	public Somma(Espressione e1, Espressione e2)
	{
		super(e1, e2);
	}
	
	@Override
	public double getValore()
	{
		return e1.getValore()+e2.getValore();
	}

	@Override
	public String toString()
	{
		return "("+e1+"+"+e2+")";
	}
}

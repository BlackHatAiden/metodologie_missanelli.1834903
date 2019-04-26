
public class EspressioneNegata extends Espressione
{
	private Espressione e;
	
	public EspressioneNegata(Espressione e)
	{
		this.e = e;
	}
	
	@Override
	public double getValore() { return -e.getValore(); }

	@Override
	public String toString() { return "-("+e.toString()+")"; }
}

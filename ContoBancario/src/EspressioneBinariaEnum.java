
public class EspressioneBinariaEnum extends Espressione
{
	public enum Operatore
	{
		SOMMA,
		PRODOTTO,
		SOTTRAZIONE,
		DIVISIONE,
	}
	
	private Espressione e1;
	private Espressione e2;
	private Operatore op;
	
	public EspressioneBinariaEnum(Espressione e1, Operatore op, Espressione e2)
	{
		this.e1 = e1;
		this.e2 = e2;
		this.op = op;
	}
	
	@Override
	public double getValore()
	{
		double v1 = e1.getValore();
		double v2 = e2.getValore();
		
		switch(op)
		{
			case SOMMA: return v1+v2;
			case SOTTRAZIONE: return v1-v2;
			case PRODOTTO: return v1*v2;
			case DIVISIONE: return v1/v2;
			default: return 0.0;
		}
	}
}

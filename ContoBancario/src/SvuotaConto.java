
public class SvuotaConto extends Operazione
{
	public SvuotaConto(ContoBancario conto)
	{
		super(conto);
	}

	@Override
	public void esegui()
	{
		conto.setSaldo(0.0);
	}

	@Override
	public String toString()
	{
		return "svuotamento conto "+conto.getIban();
	}
}

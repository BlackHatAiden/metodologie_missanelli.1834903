
public class VersaDenaro extends Operazione
{
	private double denaroDaVersare;
	
	public VersaDenaro(ContoBancario conto, double denaroDaVersare)
	{
		super(conto);
		this.denaroDaVersare = denaroDaVersare;
	}
	
	@Override
	public void esegui()
	{
		conto.setSaldo(conto.getSaldo()+denaroDaVersare);
	}

	@Override
	public String toString()
	{
		return "versamento di "+denaroDaVersare+" euro sul conto "+conto.getIban();
	}
}


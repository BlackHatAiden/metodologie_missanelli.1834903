abstract public class Operazione
{
	protected ContoBancario conto;
	
	public Operazione(ContoBancario conto)
	{
		this.conto = conto;
	}
	
	abstract public void esegui();
}

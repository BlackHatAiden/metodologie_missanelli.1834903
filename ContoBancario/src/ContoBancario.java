import java.util.ArrayList;
import java.util.List;

public class ContoBancario
{
	private double saldo;
	private String iban;
	private List<Operazione> cronologia = new ArrayList<>();
	
	public ContoBancario(String iban)
	{
		this(iban, 0.0);
	}
	
	public ContoBancario(String iban, double versamentoIniziale)
	{
		this.iban = iban;
		this.saldo = versamentoIniziale;
	}
	
	public String getIban() { return iban; }
	
	public void esegui(Operazione o) throws Exception
	{
		if (!o.conto.equals(this))
			throw new Exception("Operazione svolta sul conto errato");
		o.esegui();
		cronologia.add(o);
	}

	void setSaldo(double nuovoSaldo) { saldo = nuovoSaldo; }
	double getSaldo() { return saldo; }
	
	public List<Operazione> getCronologia()
	{
		return new ArrayList<>(cronologia);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o == null || !(o instanceof ContoBancario))
			return false;
		
		return iban.equals(((ContoBancario)o).iban);
	}
	
	public static void main(String[] args) throws Exception
	{
		ContoBancario c = new ContoBancario("iban");
		
		new VersaDenaro(c, 100).esegui();
		
		c.esegui(new VersaDenaro(c, 100));
		c.esegui(new SvuotaConto(c));
		
		System.out.println(c.getCronologia());
	}
}

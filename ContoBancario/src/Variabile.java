
public class Variabile extends Espressione
{
	private String nome;
	private double valore;
	
	public Variabile(String nome, double valore)
	{
		this.nome = nome;
		this.valore = valore;
	}
	
	@Override
	public double getValore() { return valore; }
	
	public void setValore(double valore)
	{
		this.valore = valore;
	}
	
	@Override
	public String toString() { return nome+"["+valore+"]"; }
}


public class Variabile extends EspressioniMatematiche 
{
	protected String nome ;
	
	private double valore ;
	
	public Variabile(String nome,double valore)
	{
		this.nome = nome ;
		this.valore = valore ;
	}
	
	
	@Override
	public double getValore()
	{
		return valore ;
	}

	public static void main(String[] args) 
	{
		

	}

}

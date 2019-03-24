
public class StrtingaVerticale 
{
	private String stringa ;
	
	
	public StrtingaVerticale(String stringa)
	{
		this.stringa = stringa ;
	}
	
	/**
	 * il metodo stampa a video in verticale la stringa
	 */
	public void toVerticale()
	{
		for(int i = 0 ; i < stringa.length() ; i++)
		
			System.out.println(stringa.charAt(i)+"\n") ;
		
		
	}
	
	public static void main(String args[])
	{
		
		//  Scanner i = new Scanner(System.in) ;      creazione ogetto Scanner i  importando anche la libreira propria
		//  String stringa = i.nextLine();            mettere la stringa presa da input in stringa
		
		StrtingaVerticale s1 = new StrtingaVerticale("ciao") ;    //(stringa)
		
		
		s1.toVerticale();
		
	}

}
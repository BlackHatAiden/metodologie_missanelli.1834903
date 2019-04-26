
public class RiproduttoreMusicale extends Brano
{
	private boolean EsecuzioneBrano ;
	
	private int selezionaBrano ;
	
	public RiproduttoreMusicale(String titolo,String cantante)
	{
		super(titolo,cantante) ;
		
		EsecuzioneBrano = false ;
		selezionaBrano = 0 ;
	}
	
	/**
	 * il metodo permette di scegliere uno dei 5 diversi possibili supporti e creandolo per forza dovrà rispettare i limiti del supporto stesso
	 */
	public void inserisciSupporto(Object o) 
	{
		System.out.println("Inserito il supporto "+o) ;
	} 
	
	/**
	 * il metodo permette di espellere/eliminare il supporto inserito
	 */
	public void espelliSupporto(Object o) 
	{
		System.out.println("Espulso il supporto "+o) ;
	} 
	
	/**
	 * il metodo restituisce il brano(titolo+cantante preso attraverso toString) in esecuzione se esiste
	 *  altrimenti null
	 * @return
	 */
	public String getBrano() 
	{
		if (EsecuzioneBrano)
			return toString() ;
		
		return null ;
	} 
	
	/**
	 * il metodo manda in esecuzione il brano selezionato dall'utente e imposta EsecuzioneBrano a true
	 * @param seleziona
	 * @return EsecuzioneBrano
	 */
	public boolean play(int seleziona) 
	{
		if (seleziona >= Brano.lunghezzaLista)
			return false ;
		
		EsecuzioneBrano = true ;
		
		selezionaBrano = seleziona ;
		
		return EsecuzioneBrano ;
	} 
	
	/**
	 * il metodo ferma l'esecuzione del brano e imposta EsecuzioneBrano a false
	 * @return EsecuzioneBrano
	 */
	public boolean stop() 
	{
		EsecuzioneBrano = false ;
		
		return EsecuzioneBrano ;
	} 
	
	/**
	 * il metodo cambia il brano in quello successivo se esiste e ritorna true altrimenti false
	 * @return 
	 */
	public boolean next() 
	{
		if (selezionaBrano + 1 >= Brano.lunghezzaLista)
			return false ;
		
		EsecuzioneBrano = true ;
		
		selezionaBrano++ ;
		
		return true ;
		
		
	} 
	
	/**
	 * il metodo cambia il brano in quello precedente se esiste e ritorna true altrimenti false
	 * @return 
	 */
	public boolean prec() 
	{
		if (selezionaBrano - 1 < 0)
			return false ;
		
		EsecuzioneBrano = true ;
		
		selezionaBrano-- ;
		
		return true ;
		
		
	} 
	
	/**
	 * il metodo restituisce le informazioni del brano selezionato
	 */
	@Override
	public String toString() 
	{
		return "Titolo : "+super.getTitolo(selezionaBrano) +"\nCantante : "+ super.getCantante(selezionaBrano) ;
		
	} 

	
	public static void main(String[] args)
	{
		
		
		
		RiproduttoreMusicale r1 = new RiproduttoreMusicale("c","a") ;
		
		r1.play(0) ;
		
		System.out.println(r1.getBrano()) ;
		
	}

}

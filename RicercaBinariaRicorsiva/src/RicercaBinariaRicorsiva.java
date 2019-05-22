
public class RicercaBinariaRicorsiva 
{
	
	public boolean ricerca(int[] array,int elemento)
	{
		return ricerca(array,elemento,0,array.length-1) ;
	}
	
	/**
	 * il metodo ha come  tappo inizio > fine poi divide l'array a meta e se l'elemento da cercare
	 * e piu grande dell'elemento che si trova a meta allora io valuto nella chiamata ricorsiva
	 * solo il sotto array che va da meta+1 fino alla fine e se lo trovo restituisco true 
	 * altrimenti false
	 * @param array
	 * @param elemento
	 * @param inizio
	 * @param fine
	 * @return
	 */
	private boolean ricerca(int[] array,int elemento,int inizio,int fine)
	{
		if(inizio > fine)
			return false ;
		
		int meta = (inizio+fine) / 2 ;
		
		if(elemento == array[meta])
			return true ;
		
		if(elemento < array[meta])
			return ricerca(array,elemento,inizio,meta-1) ;
		return ricerca(array,elemento,meta+1,fine) ;
		
		
	}

	public static void main(String[] args) 
	{
		
		RicercaBinariaRicorsiva r = new RicercaBinariaRicorsiva() ;
		
		System.out.println(r.ricerca(new int[] {1,2,3,4,5,6,7,8},3) ) ;
	}

}

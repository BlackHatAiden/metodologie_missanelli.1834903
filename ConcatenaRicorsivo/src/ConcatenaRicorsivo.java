
public class ConcatenaRicorsivo 
{

	public String concatena(String[] array)
	{
		String stringa = "" ;
		return concatena(array,0,array.length-1,stringa) ;
	}
	
	/**
	 * il metodo ha come tappo ricorsivo inizio > fine cosi da valutare tutti gli elementi dell'array
	 * @param array
	 * @param inizio
	 * @param fine
	 * @param stringa
	 * @return
	 */
	private String concatena(String[] array,int inizio,int fine,String stringa)
	{
		if(inizio > fine)
			return stringa ;
		
		return  array[inizio++] + concatena(array,inizio++,fine,stringa) ;
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		ConcatenaRicorsivo c = new ConcatenaRicorsivo() ;
		
		System.out.println(c.concatena(new String[] {"abc","de","f"}) ) ;

	}

}

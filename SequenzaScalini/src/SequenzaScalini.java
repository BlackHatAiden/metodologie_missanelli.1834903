
import java.util.ArrayList;
import java.util.List;

public class SequenzaScalini 
{
	private List<Integer> sequenza ;
	
	public static int indice = 0 ;
	
	SequenzaScalini()
	{
		sequenza = new ArrayList<Integer>(100) ;
	}
	
	/**
	 * il metodo preso in input un intero lo aggiunge alla lista se rispetta le regole di essa
	 * @param x
	 * @throws SequenzaSballataexception
	 */
	public void aggiungi(int x) throws SequenzaSballataexception
	{
		/*
		 * aggiungo primo elemnto se la lista e vuota
		 */
		if(sequenza.size() == 0)
			sequenza.add(x) ;
		
			
		/*
		 * se la differenza tra numero precedente e numero immesso o viceversa e uguale a +-1 allora posso aggiungerlo alla lista
		 * altrimenti lancio eccezione
		 */
		else if(x - sequenza.get(indice) == 1 || x - sequenza.get(indice) == -1 )
		{
			sequenza.add(x) ;
			indice ++ ;
			
		}
		
		else
			throw new SequenzaSballataexception(stampa()) ;
	}
	
	/**
	 * il metodo stampa la lista 
	 * @return
	 */
	public String stampa()
	{
		return ""+ sequenza.toString() ;
	}

	public static void main(String[] args) throws SequenzaSballataexception 
	{
		
		SequenzaScalini s = new SequenzaScalini() ;
		
		s.aggiungi(7) ;
		s.aggiungi(8) ;
		s.aggiungi(9) ;
		s.aggiungi(10) ;
		
		s.aggiungi(13) ;
		
		
	}

}

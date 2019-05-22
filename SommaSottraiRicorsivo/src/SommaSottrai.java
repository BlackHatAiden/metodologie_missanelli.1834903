import java.util.ArrayList;
import java.util.List;

public class SommaSottrai 
{
	private List<Integer> lista = new ArrayList<Integer>() ;
	
	 public SommaSottrai(List<Integer> lista)
	 {
		 this.lista = lista ;
	 }
	 
	 /*
	  * metodo publico che restituisce un intero prendendo in input una lista
	  */
	 public int sommaSottrai(List<Integer> listaValori)
	 {
		 return sommaSottrai(listaValori,0,0) ;
	 }
	 
	 /**
	  * il metodo presi in input una lista di interi,un indice k e un risultato attraverso chiamate ricorsive
	  * e un controllo sull'indice se pari o dispari si somma o sottrae il valore al risultato
	  * @param listaValori
	  * @param k
	  * @param risultato
	  * @return
	  */
	 private int sommaSottrai(List<Integer> listaValori,int k,int risultato)
	 {
		 if(k == lista.size())
			 return risultato ;
		 
		 if( k % 2 == 0)
		
			 return sommaSottrai(listaValori,k+1,risultato += listaValori.get(k) ) ;
			
		 
		return sommaSottrai(listaValori,k+1,risultato -= listaValori.get(k) ) ;
		 
		 
	 }
	 
	 /*
	  * getter
	  */
	 public List<Integer> getLista()
	 {
		 return lista ;
	 }

	public static void main(String[] args) 
	{
		
		SommaSottrai s = new SommaSottrai(List.of(2,5,3,7,11,1)) ;
		
		System.out.println(s.sommaSottrai(s.getLista())) ;
	}

}

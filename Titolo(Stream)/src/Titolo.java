import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Titolo 
{
	public enum Allineamento{ CX, SX ,DX} //ENUM
	
	private Allineamento allineamento ;
	
	private List<Riga> righe ;
	
	/**
	 * Costruttore non generico
	 * @param a
	 */
	public Titolo(Allineamento a)
	{
		this(a, new ArrayList<>() ) ;
	}
	
	/**
	 * Costruttore  generico
	 * @param a
	 * @param righe
	 */
	public Titolo(Allineamento a,List<Riga> righe)
	{
		allineamento = a ; 
		this.righe = righe ;
	}
	
	/**
	 * il metodo aggiunge un ogetto Riga  alla lista di ogetti righe
	 * @param r
	 */
	public void addRiga(Riga r)
	{
		righe.add(r) ;
	}
	
	/**
	 * il metodo retiruisce true se l'allineamento e centrato quindi uguale a enum CX
	 * @return
	 */
	public boolean isCentered()
	{
		return allineamento == Allineamento.CX ;
	}
	
	/**
	 * il metodo fornisce una rappresentazione toString della lista righe
	 */
	@Override
	public String toString()
	{
		return ""+righe ;
	}
	
	/**
	 * il metodo restituisce  POS
	 * @return allineamento
	 */
	public Allineamento getAllineamento()
	{
		return allineamento ;
	}
	
	/**
	 * il metodo restituisce una nuova ArrayList con lunghezza righe
	 * @return
	 */
	public List<Riga> getRighe()
	{
		return new ArrayList<>(righe) ;
	}
	
	/**
	 * classe statica Riga
	 * @author matte
	 *
	 */
	static public class Riga
	{
		private String riga ;
		private int numero ;
		
		/**
		 * Costruttore  generico
		 * @param riga
		 * @param numero
		 */
		public Riga(String riga,int numero)
		{
			this.riga = riga ;
			this.numero = numero ;
		}
		
		/**
		 * Costruttore  non generico
		 * @param riga
		 */
		public Riga(String riga)
		{
			this(riga,-1) ;
		}
		
		/**
		 * il metodo fornisce una rappresentazione toString della lista righe
		 */
		@Override
		public String toString()
		{
			return (numero == -1 ? "" : numero +": ")+ riga ;
		}
		
		
	}
	
	public static void main(String[] args)
	{
		ArrayList<Titolo> lista = new ArrayList<Titolo>() ;
				
		
		
		lista.add(new Titolo(Allineamento.DX,List.of(new Riga("lll",12) )) ) ;
		
		
		lista.add(new Titolo(Allineamento.SX,List.of(new Riga("ppp",5),new Riga("ddd",2) )) ) ;
		
		lista.add(new Titolo(Allineamento.DX,List.of(new Riga("jjj",9) )) ) ;
		
		lista.add(new Titolo(Allineamento.CX,List.of(new Riga("fff",0) )) ) ;
		
		lista.add(new Titolo(Allineamento.CX,List.of(new Riga("aaa",1) ))) ;
		
		lista.add(new Titolo(Allineamento.SX,List.of(new Riga("fded",2) )) ) ;
		
		lista.add(new Titolo(Allineamento.SX,List.of(new Riga("uuu",10) )) ) ;
		
		System.out.println(lista+"\n") ;
		
		/**
		 * insieme dei primi 5 titoli aventi al piu una riga
		 */
		Set<Titolo> s  = lista.stream().filter(x -> x.getRighe().size() == 1)
									.limit(5)
									.collect(Collectors.toSet());
		
		System.out.println(s+"\n\n\n")	;	
		
		/**
		 * lista di titoli centrati e in ordine alfabetico
		 */
		List<Titolo> l = lista.stream().filter(x -> x.getAllineamento().equals(Allineamento.CX) )
									
									.collect(Collectors.toList());
						
		System.out.println(l+"\n\n\n")	;	
		
		/**
		 * mappa da allineamento a lista di titoli
		 */
		Map<Allineamento, List<Titolo>> m = lista.stream().collect(Collectors.toMap(Titolo::getAllineamento, s2 -> { 
																										ArrayList<Titolo> lista2 = new ArrayList<>(); 
																										lista2.add(s2); 
																										return lista2;
																									},(v1, v2) -> { v1.addAll(v2); return v1; },
																									TreeMap::new));
																															
										 
																													
		
		System.out.println(m+"\n\n\n")	;	
		
		/**
		 * mappa da allineamento a insieme di titoli
		 */
		Map<Allineamento, Set<Titolo>> m2 = lista.stream().collect(Collectors.toMap(Titolo::getAllineamento, s2 -> { 
																											Set<Titolo> lista2 = new HashSet<>(); 
																											lista2.add(s2); 
																											return lista2;
																										},(v1, v2) -> { v1.addAll(v2); return v1; },
																										TreeMap::new));
		
		System.out.println(m2+"\n\n\n")	;	
		
		/**
		 * mappa da allineamento a concatenazione di stringhe di titoli
		 */
		Map<Allineamento, String> m3 = lista.stream().collect(Collectors.toMap(Titolo::getAllineamento, Titolo::toString,(v1,v2) -> v1.concat(v2) ));
			
		
		System.out.println(m3+"\n\n\n")	;
		
		/**
		 * mappa da allineamento a concatenazione di stringhe di titoli
		 */
		Map<Allineamento, List<String>> m4 = lista.stream().collect(Collectors.toMap(Titolo::getAllineamento, s2 -> { 
																												List<String> lista2 = new ArrayList<>(); 
																												lista2.add(s2.toString()); 
																												return lista2;
																											},(v1, v2) -> { v1.addAll(v2); return v1; },
																											TreeMap::new));
			
		
		System.out.println(m4+"\n\n\n")	;
		
		

		/**
		 * insieme delle righe dei titoli sotto forma di stringa
		 */
		Set<String> s3 = lista.stream().map(Titolo::getRighe).map(List::toString).collect(Collectors.toSet()) ;
			
		
		System.out.println(s3+"\n\n\n")	;
		
		

		
		
		
		
	}

}

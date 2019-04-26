
public  class EspressioniMatematiche 
{
	public static double espressione ;
	
	public double getValore() 
	{
		return espressione ;
	}
	
	public static void main(String[] args) 
	{
		//Esempio 1
		//UpCasting
		EspressioniMatematiche esp1 = new Costante(5.0) ;
		
		EspressioniMatematiche esp2 = new Variabile("X",3.0) ;
		
		EspressioniMatematiche esp3 = new Costante(3.0) ;
		
		EspressioniMatematiche esp5 = new Costante(2.0) ;
		
		
		
		
		System.out.println(Operazioni.getResult(Operazioni.DIVISIONE,esp3.getValore(),esp5.getValore()) ) ;
		
		System.out.println(Operazioni.getResult(Operazioni.ADDIZIONE,EspressioniMatematiche.espressione,esp1.getValore())) ;
		
		System.out.println(Operazioni.getResult(Operazioni.SOTTRAZIONE,EspressioniMatematiche.espressione,esp5.getValore())) ;
		
		System.out.println(Operazioni.getResult(Operazioni.MOLTIPLICAZIONE,EspressioniMatematiche.espressione,esp2.getValore())) ;
		
		EspressioniMatematiche esp6 = new E1(EspressioniMatematiche.espressione) ;
		System.out.println(esp6.getValore()) ;
		
		
		//Esempio 2
		EspressioniMatematiche esp10 = new Costante(5.0) ;
		
		EspressioniMatematiche esp11 = new Variabile("X",6.0) ;
		
		EspressioniMatematiche esp12 = new Costante(3.0) ;
		
		EspressioniMatematiche esp13 = new Costante(2.0) ;
		
		System.out.println(Operazioni.getResult(Operazioni.DIVISIONE,esp12.getValore(),esp13.getValore()) ) ;
		
		System.out.println(Operazioni.getResult(Operazioni.ADDIZIONE,EspressioniMatematiche.espressione,esp10.getValore())) ;
		
		System.out.println(Operazioni.getResult(Operazioni.SOTTRAZIONE,EspressioniMatematiche.espressione,esp13.getValore())) ;
		
		System.out.println(Operazioni.getResult(Operazioni.MOLTIPLICAZIONE,EspressioniMatematiche.espressione,esp11.getValore())) ;
		
		EspressioniMatematiche esp14 = new E1(EspressioniMatematiche.espressione) ;
		System.out.println(esp14.getValore()) ;
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
	}

}

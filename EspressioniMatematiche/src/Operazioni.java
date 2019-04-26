
public enum Operazioni 
{
	ADDIZIONE,
	MOLTIPLICAZIONE,
	SOTTRAZIONE,
	DIVISIONE ;
	
    public static double getResult(Operazioni valore,double valore0,double valore1)
	{
		switch(valore)
		{
		case ADDIZIONE :  EspressioniMatematiche.espressione = valore0 + valore1 ; return  EspressioniMatematiche.espressione ;
			
		case MOLTIPLICAZIONE : EspressioniMatematiche.espressione = valore0 * valore1 ; return  EspressioniMatematiche.espressione ;
		
		case SOTTRAZIONE : EspressioniMatematiche.espressione = valore0 - valore1 ; return  EspressioniMatematiche.espressione ;
		
		case DIVISIONE : EspressioniMatematiche.espressione = valore0 / valore1 ; return  EspressioniMatematiche.espressione ;
		
		default : return 0.0 ;
		}
	}

}

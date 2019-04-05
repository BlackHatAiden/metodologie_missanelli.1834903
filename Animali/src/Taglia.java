
public enum Taglia 
{
	
	PICCOLA(0),
	MEDIA(1),
	GRANDE(2) ;
	
	private int taglia ;

	Taglia(int taglia)
	{
		this.taglia = taglia ;
	}
	
	public Taglia getTaglia()
	{
		int valore =(int)  Math.random() * 3 ;
		
		switch(valore)
		{
		case 0 : return Taglia.PICCOLA ; 
		
		case 1 : return Taglia.MEDIA ;
		
		case 2 : return Taglia.GRANDE ; 
		
		default : return Taglia.MEDIA ;
			
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		
		

	}
}

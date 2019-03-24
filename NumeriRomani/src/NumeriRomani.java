
public class NumeriRomani 
{
	private String stringa ;
	
	public NumeriRomani (String stringa)
	{
		this.stringa = stringa ;
	}
	
	public int toInteger()
	{
		int anno = 0 ;
		
		for(int i = 0 ; i < stringa.length() ; i++)
		{
			
				switch(stringa.charAt(i))
				{
				case 'M' : anno += 1000 ; break ;
				
				case 'D' : 
					
						
								anno += 500 ; 
						break ;
				
				case 'C' : 
					
							anno += 100 ; 
					break ;
				
				case 'L' : 
					
						anno += 50 ; 
					break ;
				
				case 'X' : 
						if( stringa.charAt(i-1) == 'I')
							anno += 9 ;
						
						else
							anno += 10 ; 
					break ;
				
				case 'V' : 
						if(stringa.charAt(i-1) == 'I')
							anno += 4 ;
						else
							anno += 5 ; 
					break ;
				
				case 'I' : 
					if(i == stringa.length()-1)
						anno += 1 ;
					
					break ;
				}
				
				
				
			
				
			
			
		}
		
		return anno ;
	}
	
	public static void main(String[] args)
	{
		 NumeriRomani  str1 = new  NumeriRomani ("MMXIX") ;
		 
		 System.out.println(str1.toInteger()) ;
	}

}



public class Fibonacci 
{
	/**
	 * il metodo esegue la successione di fibonacci per x volte
	 * @param x
	 * @return
	 */
	public int fib(int x) 
	{
		if( x < 0)
			return -1 ;
		
		if(x == 0 || x == 1)
			return x ;
		
		return fib(x-1) + fib(x-2) ;
	}

	public static void main(String[] args) 
	{
		
		Fibonacci f = new Fibonacci() ;
		
		System.out.println(f.fib(10)) ;
	}

}

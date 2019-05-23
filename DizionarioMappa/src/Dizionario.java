
public interface Dizionario 
{
	Elemento search(Chiave k) throws ElementAlreadyContainedException ;
	
	void add(Chiave k,Elemento e) throws ElementAlreadyContainedException ;
	
	Elemento delate(Chiave k) throws ElementNotFoundException ;
	
	int size() ;

}

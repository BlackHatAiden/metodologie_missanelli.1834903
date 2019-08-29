package it.uniroma1.fabbricasemantica.data;

public interface Task 
{
	/**
	 * il metodo ritorna la rappresentazione toString di chi la invoca
	 * @return stringa
	 */
	default String getTaskID() 
	{
		return toString();
	}
	
}

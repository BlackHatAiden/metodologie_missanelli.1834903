package it.uniroma1.fabbricasemantica.data;



/**
 * Questa classe restituisce i dati necessari per il task ricevuto in input.
 * Il metodo {@link #getData(Task)} restituira' una stringa in formato JSON
 * che le pagine in JSweet andranno a formattare.
 * N.B. Il proprio {@link DataProvider} dovrebbe evitare di avere stringhe codificate, questo e' solo un esempio.
 * */
public class StandardDataProvider implements DataProvider<String> 
{
	/* preparazione per fornire word,glosse,example ecc fornite da wordnet
	private WordNet w1 = WordNet.getInstance("3.1") ;
	
	private List<Synset> lista = w1.getListaSynset() ;
	
	private String word = lista.get(0).getSynonyms().get(0);  
	*/
	@Override 
	public String getData(Task task) 
	{
		if (task == StandardTask.TRANSLATION_ANNOTATION) 
		{
			return "{" +
					"\"word\": \"Apple\"," +
					"\"description\": \"It's one of the most common fruits you mention in examples but that you rarely eat\"" +
					"}";
		}
		else if (task == StandardTask.WORD_ANNOTATION) 
		{
			return "{\"description\": \"A motor vehicle with four wheels; usually propelled by an internal combustion engine\"}";
		}
		else if (task == StandardTask.DEFINITION_ANNOTATION) 
		{
			return "{" + 
					"\"word\": \"car\"," +
					"\"hypernym\": \"motor_veichle\"" +
					"}";
		}
		else if (task == StandardTask.SENSE_ANNOTATION) 
		{
			return "{" + 
					"\"word\":\"mouse\"," +
					"\"description\":\"A swollen bruise caused by a blow to the eye\"," + 
					"\"senses1\": \"02330245n\","+
					"\"senses2\": \"03793489n\","+
					"\"senses3\": \"10335563n\","+
					"\"senses4\": \"14289387n\"" + 
					"}";
		}
		else if (task == StandardTask.TRANSLATION_VALIDATION) 
		{
			return "{" +
					"\"word\": \"rock\"," +
					"\"description\": \"A lump or mass of hard consolidated mineral matter\"," + 
					"\"translations1\": \"Un grumo o una massa di materia minerale consolidata dura\"," +
					"\"translations2\":	\"Materiale costituito dall'aggregato di minerali come quelli che formano la crosta terrestre\"," +
					"\"translations3\": \"Un'associazione non ufficiale di persone o gruppi\"" +
					"}";
		}
		else if (task == StandardTask.SENSE_VALIDATION) 
		{
			return "{" + 
					"\"word\": \"bank\"," +
					"\"example\": \"He cashed a check at the bank\"," +
					"\"sense\": \"09213565n\"" +
					"}";
		}
		else if (task == StandardTask.MY_ANNOTATION) 
		{
			return "{" + 
					"\"word1\":\"mouse\"," +
					"\"word2\":\"bank\"," + 
					"\"word3\": \"land\","+
					"\"word4\": \"room\","+
					"\"word5\": \"egg\","+
					"\"word6\": \"book\","+
					"\"word7\": \"pencil\"" + 
					"}";
		}
		return null; 
	}
	

}

package exercise2.factory.method;

public class WordFactory extends DocumentFactory
{
	public WordDocument createDocument()
	{
		return new WordDocument();
	}
}
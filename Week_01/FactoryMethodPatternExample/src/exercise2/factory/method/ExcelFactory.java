package exercise2.factory.method;

public class ExcelFactory extends DocumentFactory
{
	public ExcelDocument createDocument()
	{
		return new ExcelDocument();
	}
}
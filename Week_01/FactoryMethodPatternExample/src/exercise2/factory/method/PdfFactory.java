package exercise2.factory.method;

public class PdfFactory extends DocumentFactory
{
	public PdfDocument createDocument()
	{
		return new PdfDocument();
	}
}
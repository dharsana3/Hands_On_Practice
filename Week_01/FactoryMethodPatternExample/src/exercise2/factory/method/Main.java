package exercise2.factory.method;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the document type you want to create [excel, pdf, word] : ");
		String type = sc.nextLine();
		Document doc = null;
		switch(type)
		{
			case "word": 
				doc = new WordFactory().createDocument();
				break;
			case "pdf":
				doc = new PdfFactory().createDocument();
				break;
			case "excel":
				doc = new ExcelFactory().createDocument();
				break;
			default:
				 throw new IllegalArgumentException("Unknown type: " + type);
		}
		doc.document();
		sc.close();
	}
}

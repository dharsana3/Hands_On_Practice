package exercise2.ecommerce.search;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product[] products = {
			    new Product(104, "Monitor", "Electronics"),
			    new Product(101, "Laptop", "Electronics"),
			    new Product(105, "Speaker", "Audio"),
			    new Product(102, "Mouse", "Accessories"),
			    new Product(103, "Keyboard", "Accessories")
			};

		Product[] sorted = new Product[products.length];
	    for (int i = 0; i < products.length; i++) {
	        sorted[i] = products[i];
	    }

	    for (int i = 0; i < products.length - 1; i++) {
	        for (int j = 0; j < products.length - 1 - i; j++) {
	            if (sorted[j].getProductId() > sorted[j + 1].getProductId()) {
	                Product temp = sorted[j];
	                sorted[j] = sorted[j + 1];
	                sorted[j + 1] = temp;
	            }
	        }
	    }
	    
		int Id = sc.nextInt();
		ProductService productService = new ProductService();
		Product linearSearchResult = productService.linearSearch(products, Id);
		Product binarySearchResult = productService.binarySearch(sorted, Id);
		if(linearSearchResult == null)
			System.out.println("Value Not found using linear search");
		else
			System.out.println("ProductId : " + linearSearchResult.getProductId() + " | " + "Product Name : " + linearSearchResult.getProductName() + " | " + "Product category : " + linearSearchResult.getCategory());
		if(binarySearchResult == null)
			System.out.println("Value Not found using binary search");
		else
			System.out.println("ProductId : " + binarySearchResult.getProductId() + " | " + "Product Name : " + binarySearchResult.getProductName() + " | " + "Product category : " + binarySearchResult.getCategory());
		sc.close();
	}
}

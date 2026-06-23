package exercise2.ecommerce.search;

public class Product {
	private final int productId;
	private String productName;
	private String category;
	
	public Product(int productId, String productName, String category) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}
	
	public int getProductId(){
		return productId;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getCategory(){
		return category;
	}
}
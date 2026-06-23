package exercise2.ecommerce.search;

public class ProductService {
	public Product linearSearch(Product[] products, int productId)
	{
		for(int i = 0; i < products.length;i++)
		{
			if(products[i].getProductId() == productId)
					return products[i];
		}
		return null;
	}
	
	public Product binarySearch(Product[] products, int productId)
	{
		int left = 0;
		int right = products.length - 1;
		while(left <= right)
		{
			int mid = left + (right - left) / 2;
			if(products[mid].getProductId() == productId)
				return products[mid];
			else if(products[mid].getProductId() < productId)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return null;
	}
}
import java.util.ArrayList;
import java.util.List;

public class ProductBO {
	public List<Product> findProduct(List<Product> productList,String brand){
		//Your code goes here...
		List<Product> li=new ArrayList<Product>();
		for (Product product : productList) {
			if(product.getBrand().equals(brand)){
				li.add(product);
			}
		}
		return li;
	}
	
	public List<Product> findProduct(List<Product> productList,Double price){
		//Your code goes here...
		List<Product> li=new ArrayList<Product>();
		for (Product product : productList) {
			if(product.getPrice()<=price){
				li.add(product);
			}
		}
		return li;
	 }
}

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Product{
	//Your code here
	private String name;
	private String brand;
	private Double price;
	private Date releasedDate;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public Product(String name, String brand, Double price, Date releasedDate) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.releasedDate = releasedDate;
	}

	public Product() {
		super();
	}
	
	public static Map<String,Integer> getBrandWiseCount(List<Product> productList){
		//Your code here
		Map<String,Integer> tr=new TreeMap<String,Integer>();
		for (Product product : productList) {
			if(tr.containsKey(product.getBrand())){
				tr.put(product.getBrand(), tr.get(product.getBrand())+1);
			}else{
				tr.put(product.getBrand(), 1);
			}
		}
		return tr;
	}
}

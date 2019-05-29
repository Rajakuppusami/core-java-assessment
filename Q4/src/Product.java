import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Comparable<Product>{
	//Your code goes here...
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
	public static Product createProduct(String detail) throws NumberFormatException, ParseException{
		//Your code goes here...
		String[] details = detail.split(",");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Product product =new Product(details[0], details[1], Double.parseDouble(details[2]), sdf.parse(details[3]));
		return product;
	}

	@Override
	public int compareTo(Product o) {
		return (int) (this.price-o.getPrice());
	}
}

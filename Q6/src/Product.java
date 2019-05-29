import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
	
	//write your code here
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

	public static List<Product> prefill() throws NumberFormatException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Galaxy S9","Samsung",Double.parseDouble("64900"),sdf.parse("16-03-2018")));
		productList.add(new Product("Galaxy On8","Samsung",Double.parseDouble("16990"),sdf.parse("12-03-2018")));
		productList.add(new Product("LED TV","Samsung",Double.parseDouble("24599"),sdf.parse("15-05-2018")));
		productList.add(new Product("7 Plus","Nokia",Double.parseDouble("24999"),sdf.parse("30-04-2018")));
		productList.add(new Product("6.1 Plus","Nokia",Double.parseDouble("17000"),sdf.parse("27-08-2018")));
		productList.add(new Product("A2","Redmi",Double.parseDouble("16999"),sdf.parse("12-08-2018")));
		productList.add(new Product("F1","Redmi",Double.parseDouble("23999"),sdf.parse("29-08-2018")));
		productList.add(new Product("Alienware","Dell",Double.parseDouble("150000"),sdf.parse("21-09-2017")));
		productList.add(new Product("Inspiron","Dell",Double.parseDouble("37990"),sdf.parse("16-02-2018")));
		productList.add(new Product("X","Apple",Double.parseDouble("82489"),sdf.parse("27-05-2017")));
		productList.add(new Product("Smartwatch","Apple",Double.parseDouble("30790"),sdf.parse("19-07-2018")));
		productList.add(new Product("D5600 DSLR","Nikon",Double.parseDouble("46899"),sdf.parse("30-06-2017")));
		productList.add(new Product("D5300 DSLR","Nikon",Double.parseDouble("37465"),sdf.parse("31-08-2018")));
		productList.add(new Product("Pixel 2","Google",Double.parseDouble("47999"),sdf.parse("19-08-2017")));
		productList.add(new Product("Pixel 2 XL","Google",Double.parseDouble("60999"),sdf.parse("04-08-2017")));
		productList.add(new Product("Home","Google",Double.parseDouble("8999"),sdf.parse("13-11-2016")));
		return productList;
	}
}

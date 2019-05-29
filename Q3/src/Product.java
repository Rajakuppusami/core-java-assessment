import java.util.Date;

public class Product {
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
}

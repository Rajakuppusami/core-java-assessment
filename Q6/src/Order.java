public class Order {
	//write your code here
	private Product product;
	private Integer quantity;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Order(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public Order() {
		super();
	}
	
	
	
}

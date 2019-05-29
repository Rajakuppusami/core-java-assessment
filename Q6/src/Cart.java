import java.util.List;

public class Cart {
	
	//write your code here
	private Double billAmount;
	private List<Order> orderList;
	
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public Cart() {
		super();
	}
	public Cart(Double billAmount, List<Order> orderList) {
		super();
		this.billAmount = billAmount;
		this.orderList = orderList;
	}
	public void calculateBillAmount(String coupon) {
		
		//write your code here
		double amount = 0d;
		for (Order order : orderList) {
			amount+=order.getQuantity()*order.getProduct().getPrice();
		}
		this.billAmount=amount;
		if(coupon.equals("FirstBuy")){
			this.billAmount=(double)(this.billAmount-(double)(this.billAmount*0.5));
		}else if(coupon.equals("Monsoon")){
			this.billAmount=(double)(this.billAmount-(double)(this.billAmount*0.25));
		}else if(coupon.equals("CB15")){
			this.billAmount=(double)(this.billAmount-(double)(this.billAmount*0.15));
		}else if(coupon.equals("DS10")){
			this.billAmount=(double)(this.billAmount-(double)(this.billAmount*0.1));
		}
	}
}

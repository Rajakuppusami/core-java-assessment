import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, ParseException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("Enter the number of order:");
		DecimalFormat df=new DecimalFormat("#.0");
		List<Product> productList = Product.prefill();
		List<Order> orderList = new ArrayList<Order>();
		Integer n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String orderDetails = br.readLine();
			String[] orderDet = orderDetails.split(",");
			Order order = new Order();
			Product product=null;
			for (Product productValue  : productList) {
				if(productValue.getName().equals(orderDet[0])){
					product=productValue;
				}
			}
			order.setProduct(product);
			order.setQuantity(Integer.parseInt(orderDet[1]));
			orderList.add(order);
		}
		//write your code here
		Cart c =new Cart();
		c.setOrderList(orderList);
		System.out.println("Enter the coupon code:");
		String coupon = br.readLine();
		c.calculateBillAmount(coupon);
		//String value = df.format(c.getBillAmount());
		double value = Math.round(c.getBillAmount()*10.0)/10.0;
		//System.out.println("The bill amount is Rs."+ df.format(c.getBillAmount()));
		System.out.println("The bill amount is Rs."+ value);
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of products:");
		//Your code here
		Integer n =Integer.parseInt(br.readLine());
		List<Product> productList = new ArrayList<Product>();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		for (int i = 0; i < n; i++) {
			String productDetails = br.readLine();
			String[] productDet= productDetails.split(",");
			Product product = new Product();
			product.setName(productDet[0]);
			product.setBrand(productDet[1]);
			product.setPrice(Double.parseDouble(productDet[2]));
			product.setReleasedDate(sdf.parse(productDet[3]));
			productList.add(product);
		}
		System.out.format("%-15s %s\n", "Brand","Count");
		Map<String,Integer> tr = Product.getBrandWiseCount(productList);
		for (Map.Entry<String,Integer> entry : tr.entrySet()) {
			System.out.format("%-15s %s\n", entry.getKey(),entry.getValue());
		}
		
	}
}
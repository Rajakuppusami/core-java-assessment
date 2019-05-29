import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Your code goes here...
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Product> productList = new ArrayList<Product>();
		System.out.println("Enter the number of products:");
		//Your code goes here...
		Integer n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String detail=br.readLine();
			String[] details = detail.split(",");
			Product product =new Product(details[0], details[1], Double.parseDouble(details[2]), sdf.parse(details[3]));
			productList.add(product);
		}
		System.out.println("Enter a search type:\n1.By Brand\n2.By Price");
		//Your code goes here...
		Integer choice = Integer.parseInt(br.readLine());
		ProductBO pbo =new ProductBO();
		DecimalFormat df=new DecimalFormat("#.0");
		if(choice==1){
			System.out.println("Enter the Brand:");
			String brand = br.readLine();
			List<Product> li=pbo.findProduct(productList, brand);
			if(li.isEmpty()){
				System.out.println("No such product is present");
			}else{
				System.out.format("%-12s %-8s %-8s %s\n","Name","Brand","Price","Released Date");
				for (Product product : li) {
					System.out.format("%-12s %-8s %-8s %s\n",product.getName(),product.getBrand(),df.format(product.getPrice()),sdf.format(product.getReleasedDate()));
				}
			}
		}else if(choice==2){
			System.out.println("Enter the Price:");
			Double price = Double.parseDouble(br.readLine());
			List<Product> li=pbo.findProduct(productList, price);
			if(li.isEmpty()){
				System.out.println("No such product is present");
			}else{
				System.out.format("%-12s %-8s %-8s %s\n","Name","Brand","Price","Released Date");
				for (Product product : li) {
					System.out.format("%-12s %-8s %-8s %s\n",product.getName(),product.getBrand(),df.format(product.getPrice()),sdf.format(product.getReleasedDate()));
				}
			}
		}else{
			System.out.println("Invalid choice");
		}
    }
}

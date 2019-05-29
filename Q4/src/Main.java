import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, ParseException {
		//Your code goes here...	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the products:");
		//Your code goes here...
		Integer n = Integer.parseInt(br.readLine());
		List<Product> productList = new ArrayList<Product>();
		for (int i = 0; i < n; i++) {
			String detail = br.readLine();
			productList.add(Product.createProduct(detail));
		}
		System.out.println("Enter a type to sort:\n1.Sort by Price\n2.Sort by Released Date");
		//Your code goes here...
		Integer choice = Integer.parseInt(br.readLine());
		DecimalFormat df=new DecimalFormat("#.0");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		if(choice==1){
			System.out.format("%-12s %-8s %-8s %s\n","Name","Brand","Price","Released Date");
			Collections.sort(productList);
			for (Product product : productList) {
				System.out.format("%-12s %-8s %-8s %s\n",product.getName(),product.getBrand(),df.format(product.getPrice()),sdf.format(product.getReleasedDate()));
			}
		}else if(choice==2){
			System.out.format("%-12s %-8s %-8s %s\n","Name","Brand","Price","Released Date");
			Collections.sort(productList,new ReleasedDateComparator());
			for (Product product : productList) {
				System.out.format("%-12s %-8s %-8s %s\n",product.getName(),product.getBrand(),df.format(product.getPrice()),sdf.format(product.getReleasedDate()));
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Your code goes here
		User user1=new User();
		User user2=new User();
		System.out.println("Enter user 1 details:");
		//Your code goes here
		String user1Details = reader.readLine();
		String[] user1Det = user1Details.split(",");
		user1.setName(user1Det[0]);
		user1.setEmail(user1Det[1]);
		user1.setMobileNumber(user1Det[2]);
		System.out.println("Enter user 2 details:");
		//Your code goes here
		String user2Details = reader.readLine();
		String[] user2Det = user2Details.split(",");
		user2.setName(user2Det[0]);
		user2.setEmail(user2Det[1]);
		user2.setMobileNumber(user2Det[2]);
		System.out.println();
		System.out.println("User 1");
		System.out.println(user1);
		System.out.println();
		System.out.println("User 2");
		System.out.println(user2);
		System.out.println();
		if(user1.equals(user2)){
			System.out.println("User 1 is same as User 2");
		}else{
			System.out.println("User 1 and User 2 are different");
		}
	} 
}

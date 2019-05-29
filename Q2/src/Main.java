import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("Enter the email to be validated:");
    	//Your code goes here
    	String email = reader.readLine();
    	if(validateEmail(email)){
    		System.out.println("Email is valid");
    	}else{
    		System.out.println("Email is invalid");
    	}
    }
    static Boolean validateEmail(String email){
   	//Your code goes here
    	if(email.contains("@")){
    		String[] part = email.split("@");
    		if(part.length>2)
    			return false;
    		else{
    			String local = part[0];
    			if(!local.matches("[a-zA-Z]{1}[a-zA-Z0-9._]*")){
    				return false;
    			}
    			String domain = part[1];
    			if(!domain.matches("[a-zA-Z]*[.]{1}[a-zA-z]{2,6}")){
    				return false;
    			}
    		}
    	}else{
    		return false;
    	}
    	return true;
    }  

}

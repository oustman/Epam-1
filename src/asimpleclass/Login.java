package asimpleclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import asimpleclass.AccountDetails;
import checklist.Dataaccessobj;



public class Login{
	private final HashMap<String, AccountDetails> credentials = new HashMap<>();
	public static final AccountDetails getInstance = new AccountDetails();
	
	
	 public AccountDetails signIn() {
	        Scanner sc = new Scanner(System.in);
	        String username;
	        String password;
	        System.out.println("Sign In Page");
	        while (true) {
	            System.out.print("Enter a username: ");
	            username = sc.nextLine();
	            System.out.print("Enter a password: ");
	            password = sc.nextLine();

	            if (credentials.containsKey(username) && credentials.get(username).getPassword().equals(password))
	                break;
	            System.out.println("Incorrect username or password. Please enter correct username and password.");
	        }
	        System.out.println("You have successfully Sign In!!!\n");
	        return credentials.get(username);
	    }
	
}
	


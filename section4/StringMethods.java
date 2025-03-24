package hello;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Java Program";
		//1.length
		System.out.println(s1.length());
		
		//2.equals()
		//3.equalIgnorecase()
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		//if(username.equals("admin") && password.equals("admin@123")){
		//	System.out.println("Success");
			
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")){
			System.out.println("Success");
		}else{
			System.out.println("Error 404 found");
		}
	
	
	}
}

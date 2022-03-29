import java.util.Scanner;
//first step
public class FirstScanner {
	public static void main (String[] args) {
		 //1. declare variable
		 double radius;
		 double PI = 3.14159;
		
		
		//2. get the value radius from user
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter a double value: ");
		  radius = scanner.nextDouble();


		 
		
		//3. calculation
		double area = radius*radius*PI;
		
		//4. output	
		System.out.println ( area); 
		 
		 
	 }
		 
}

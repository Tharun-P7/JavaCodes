package javatcs;
import java.util.Scanner;
public class Product_with_input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int x = scan.nextInt();
		System.out.println("Enter second Number:");
		int y = scan.nextInt();
		
		System.out.print(x*y);
	}
}

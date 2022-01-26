package javatcs;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("Addition : " + (x+y));
		System.out.println("Subraction : " + (x-y));
		System.out.println("Multiplication : " + (x*y));
		System.out.println("Division : " + (x/y));
		System.out.println("Remainder : " + (x % y));

	}

}

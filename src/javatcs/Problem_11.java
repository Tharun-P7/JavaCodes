package javatcs;

import java.util.Scanner;

public class Problem_11 {
	
	
	public static void main(String[] args) {
		
	double pi = 3.14;
	Scanner scan = new Scanner(System.in);
	
	double radius = scan.nextDouble();
	
	double Area = (pi*radius*radius);
	
	double Perimeter = (2*pi*radius);
	
	
	System.out.println("Area :" + Area);
	System.out.println("Perimeter :" + Perimeter);	
	}
}

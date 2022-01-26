package javatcs;

public class Swap {

	public static void main(String[] args) {
		int x=5;
		int y=6;
		
		int temp;
		
	//  With variable
		
		System.out.println("Before swap:"+x+","+y);

		temp=x;   //temp=5
		x=y;     //x=6
		y=temp;  //y=5
		
		System.out.println("After swap:"+x+","+y);
		
	//  Without a variable
		
		x=5;
		y=6;
		
		System.out.println("Before swap:"+x+","+y);		
		
		x=x+y;  //x=11
		y=x-y; //y=5
		x=x-y;//x=6
		
		System.out.println("After swap:"+x+","+y);
	}

}

package javatcs;

public class American_Flag {
	public static void main(String[] args) {
		
		for(int i=0;i<9;i++) {
			if(i%2==0) {
				 for(int j=0;j<20;j++) {
					 if(j<6) {
					 System.out.print("*");
				 }
					 else {
						 System.out.print("=");
					 }
			}
				 System.out.println();
			}
			else {
				for(int j=0;j<20;j++) {
					if(j<5) {
					System.out.print("*");
				}
					else {
						System.out.print("=");
						}
			}
				System.out.println();
		}
	}
}
}

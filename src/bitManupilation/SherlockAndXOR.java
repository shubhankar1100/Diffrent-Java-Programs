package bitManupilation;

import java.util.Scanner;

public class SherlockAndXOR {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        for (int i = 0; i < N; i++) {
	        	long countOdd=0;
	        	long countEven = 0;
	        	int array = s.nextInt();
	        	 for (int j = 0; j < array; j++) {
	 	        	int number = s.nextInt();
	 	        	if(number%2==0){
	 	        		countEven++;
	 	        	}else{
	 	        		countOdd++;
	 	        	}
	 	        }
	        	 System.out.println(countEven*countOdd);
	        }
		
		
		
	}
}

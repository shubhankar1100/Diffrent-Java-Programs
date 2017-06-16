package bitManupilation;

import java.util.Scanner;

public class SubsetAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        for (int i = 0; i < N; i++) {
	        	 int number= s.nextInt();
	        	 int sizeOfSet = s.nextInt();
	        	 boolean flag = false;
	        	 for(int j=0;j<sizeOfSet;j++){
	        		 
	        		 number = number & s.nextInt();
	        		 
	        		 
	        	 }
	        	 if(number == 0)
	        		 System.out.println("Yes");
	        	 else
	        		 System.out.println("No");
	        }
	}

}

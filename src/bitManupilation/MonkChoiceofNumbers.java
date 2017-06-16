package bitManupilation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MonkChoiceofNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    //Scanner
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();

        for (int i = 0; i < tc; i++) {
            int sum = 0;
        	 int n = s.nextInt();
        	 int k = s.nextInt();
        	 Integer[] arr = new Integer[n];
        	 for(int j=0;j<n;j++){
        		 arr[j] = Integer.bitCount(s.nextInt());
        	 }
        	 Arrays.sort(arr,Collections.reverseOrder());
        	
        	 for(int l=0;l<k;l++){
        		 sum += arr[l]; 
        	 }
        	 System.err.println(sum);
        	 
        	
        }
	}

}

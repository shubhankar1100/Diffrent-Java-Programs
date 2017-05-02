package test;

import java.util.Arrays;
import java.util.Scanner;

public class Swip {
	public static int search(int [ ] numbers, int key){
	
	       for (int index = 0; index < numbers.length; index++)
	      {
	           if ( numbers[index] == key ) 
	                 return index;  //We found it!!!
	      }
	     // If we get to the end of the loop, a value has not yet
	     // been returned.  We did not find the key in this array.
	     return -1;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = s.nextInt();
	        }
	       // Arrays.sort(arr);
	        
	        int noOfQueries = s.nextInt();
	        int firstNo;
	        int secondno;
	        for (int i = 0; i < noOfQueries; i++) {
	            firstNo= s.nextInt();
	            int index = search(arr,firstNo);
	            int temp;
	            temp = arr[index];
	            arr[index] = arr[N-index-1];
	            arr[N-index-1] = temp;
	           
	            secondno= s.nextInt();
	             index = search(arr,secondno);
	            // System.out.println(index);
	            temp = arr[index];
	            arr[index] = arr[N-index-1];
	            arr[N-index-1] = temp;
	        }
	        for(int i=0;i<N;i++){
	        	System.out.print(arr[i] + " ");
	        }
	}

}

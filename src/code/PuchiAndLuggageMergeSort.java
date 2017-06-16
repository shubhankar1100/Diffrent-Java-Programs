package code;

import java.util.Scanner;

public class PuchiAndLuggageMergeSort {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int noOfTC = s.nextInt();
	        int sum = 0;
	        for (int i = 0; i < noOfTC; i++) {
	        	int noOfElements = s.nextInt();
	        	int[] arr = new int[noOfElements];
	        	for(int j=0;j<noOfElements;j++){
	        		arr[j] = s.nextInt();
	        	}
	        	
	        	for(int j=0;j<noOfElements;j++){
	        		sum=0;
	        		for(int k=j;k<noOfElements;k++){
	        			if(arr[j]>arr[k]){
	        				sum++;
	        			}
	        			
	        		}
	        	System.out.println(sum);	
	        	}
	        }

	}

}

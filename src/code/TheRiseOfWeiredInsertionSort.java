package code;

import java.util.Scanner;

public class TheRiseOfWeiredInsertionSort {
	   public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        long sumV = 0;
	        long sumZ = 0;
	        int[] vamp = new  int[N];
	        int[] zombi = new int[N];
	        int countZ=0;
	        int countV=0;
	        for (int i = 0; i < N; i++) {
	        	int val = s.nextInt();
	        	if(val%2==0){
	        		sumZ +=val;
	        		zombi[countZ] = val;
	        		countZ++;
	        	}else{
	        		sumV +=val;
	        		vamp[countV] = val;
	        		countV++;
	        	}
	        }
	        insertionSort(zombi);
	        for(int i=0;i<zombi.length;i++){
	        	if(zombi[i] !=0	)
	        	System.out.print(zombi[i] + " ");}
	        System.out.print(sumZ + " ");
	        insertionSort(vamp);
	        for(int i=0;i<vamp.length;i++){
	        	if(vamp[i] !=0	)
	        	System.out.print(vamp[i] + " ");}
	        System.out.print(sumV);

	}

}

package hackerearth;

import java.util.Scanner;

public class ModuloBasedMergeSort {
	
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int noOfElements = s.nextInt();
	        int k = s.nextInt();
	        int[] arr = new int[noOfElements];
	        int[] arrModulo = new int[noOfElements]; 
	        for (int i = 0; i < noOfElements; i++) {
	            arr[i] = s.nextInt();
	            arrModulo[i] = arr[i]%k;
	        }
	        for(int i=0;i<noOfElements;i++)
	        {
	        System.err.print(arrModulo[i]+" ");
	        }
	        for(int i = 0;i<noOfElements;i++){
	        	for(int j=0;j<noOfElements-i-1;j++){
	        		int temp,temp1;
	        		if(arrModulo[j]>arrModulo[j+1]){
	        			temp=arrModulo[j];
	        			arrModulo[j] = arrModulo[j+1];
	        			arrModulo[j+1] =temp;
	        			temp1=arr[j];
	        			arr[j] = arr[j+1];
	        			arr[j+1] =temp1;
	        		}
	        		
	        	}
	        	
	        }
	        for(int i=0;i<noOfElements;i++)
	        {
	        System.out.print(arr[i]+" ");
	        }
	       // System.out.println(" ");
	}

}

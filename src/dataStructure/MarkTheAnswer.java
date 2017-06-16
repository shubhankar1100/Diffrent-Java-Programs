package dataStructure;

import java.util.Scanner;

public class MarkTheAnswer {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int max =  s.nextInt();
	        int k=0;
	        int result = 0;
int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	        int val =   s.nextInt();
	        // int val =    arr[i] ;
		     if(val<=max){
		    	 result ++;
		     }else if(k<1){
		    	 k++;
		     }else{
		    	 break;
		     }
	        }

	    /*    for (int i = 0; i < N; i++) {
		     int val =    arr[i] ;
		     if(val<=max){
		    	 result ++;
		     }else if(k<1){
		    	 k++;
		     }else{
		    	 break;
		     }
		        }*/
	        
	        
	        System.out.println(result);
	        
	}

}

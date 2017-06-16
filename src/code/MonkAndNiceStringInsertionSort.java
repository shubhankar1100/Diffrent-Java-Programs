package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndNiceStringInsertionSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //  String line = br.readLine();
		 int count = 0;
	        int N = Integer.parseInt(br.readLine());
	        String[] arr = new String[N];
	        for(int i = 0;i<N;i++){
	        	arr[i] = br.readLine();
	        }
		
	        for(int i=0;i<arr.length;i++){
	        	count=0;
	        	for(int j=i-1;j>=0;j--){
	        		if(arr[i].compareTo(arr[j])>0){
	        			count ++;
	        		}
	        	}
	        System.out.println(count);	
	        }
	        
	}

}

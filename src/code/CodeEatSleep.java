package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CodeEatSleep {
	private  int calculation(char[] arr){
		int result =0;
		for(int j=0;j<arr.length;j++){
    		int count =0;
    		int k=j;
    		while(k<arr.length && arr[k]=='C'){
    			count++;
    			k++;
    			j=k;
    		}
    		if(result<count){
    			result = count;
    		}
    		
    	}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 CodeEatSleep ces=new CodeEatSleep();
		 StringBuilder concat = new StringBuilder();
	        int N = Integer.parseInt(br.readLine());
	         ArrayList<Integer> values = new ArrayList<>(N);
	        for(int i = 0;i<N;i++){
	        	String line = br.readLine();
	        	char[] arr = line.toCharArray();
	        	values.add(ces.calculation(arr));
	        	concat.append(line);
	        }
	        char[] concatArr = concat.toString().toCharArray();
	        
	        System.out.print(Collections.max(values) +" " + ces.calculation(concatArr));
	}

}

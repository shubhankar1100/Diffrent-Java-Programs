package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

	public static void main(String[] args) throws IOException {
		int lr=0;
		int ud=0;
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        //int N = Integer.parseInt(line);
	        char[] arr = line.toCharArray();
	        
	        for(int i=0;i<arr.length;i++){
	        	char a = arr[i];
	        	if(a=='U'){
	        		ud++;
	        	}else if(a=='D'){
	        		ud--;
	        	}else if(a=='L'){
	        		lr--;
	        	}else if(a=='R'){
	        		lr++;
	        	}
	        	
	        	
	        	
	        }
	        System.out.println(lr + " " + ud);
	        	

	}

}

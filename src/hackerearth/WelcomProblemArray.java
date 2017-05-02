package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WelcomProblemArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] arr1= line.split(" ");
        String line2 = br.readLine();
        String[] arr2= line2.split(" ");
        
        for(int i=0;i<N;i++){
        	System.out.print(Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]) + " ");
        	
        	
        }
	}

}

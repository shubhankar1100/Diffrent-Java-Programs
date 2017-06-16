package code;

import java.io.IOException;
import java.util.Scanner;

public class GreatKian {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int digit = s.nextInt();
            array[i] =digit;
        }
        
        
        for(int i = 0 ; i<3;i++){
        	long k=0;
        	for(int j=i;j<N;j=(j+3)){
        		
        		 k += array[j];
        	}
        	System.out.print(k + " ");
        }
        
        s.close();
        
        
	}

}

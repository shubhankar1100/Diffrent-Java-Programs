package bitManupilation;

import java.math.BigInteger;
import java.util.Scanner;

public class MonkXor {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        for (int i = 0; i < N; i++) {
	        	BigInteger monk = s.nextBigInteger();
	        	BigInteger puchi = s.nextBigInteger();
	        	
	        	BigInteger xor = monk.xor(puchi);
	        	//System.out.println(k);
	        	int output = xor.bitCount();
	        	System.out.println(output);
	        			
	        }	
	}

}

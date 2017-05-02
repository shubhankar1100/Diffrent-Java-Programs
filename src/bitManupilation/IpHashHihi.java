package bitManupilation;

import java.math.BigInteger;
import java.util.Scanner;

public class IpHashHihi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        
	        for (int i = 0; i < N; i++) {
	        	int bit=0;
	        	
	        	BigInteger ip = s.nextBigInteger();
	        	BigInteger nxtip=ip;
	        	while(bit !=1){
	        		nxtip = nxtip.add(BigInteger.ONE);	
	        		BigInteger xor = ip.xor(nxtip);
	        		System.err.println(xor);
	        	 bit = xor.bitCount();
	        	 
	        	}
	        	System.out.println(nxtip);
	        }
	}

}

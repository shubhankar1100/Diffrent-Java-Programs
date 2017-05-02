package bitManupilation;

import java.math.BigInteger;
import java.util.Scanner;

public class XorIsMad {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        
	       /* for (int i = 0; i < N; i++) {
	        	int bit=0;
	        	
	        	BigInteger ip = s.nextBigInteger();
	        	BigInteger nxtip=ip.subtract(BigInteger.ONE);
	        	while(nxtip.compareTo(BigInteger.ZERO) >0){
	        			
	        		
	        		BigInteger xor = ip.xor(nxtip);
	        	if(xor.equals(ip.add(nxtip))){
	        		bit ++;
	        	}	
	        	
	        	nxtip = nxtip.subtract(BigInteger.ONE); 
	        	}
	        	System.out.println(bit);
	        }*/
	        
/*	        while(N-->0)
	        { int n=0;
	        long ip = s.nextLong();

	        while(ip> 0)
	        {
	        if(ip%2==0)
	        n++;
	        ip=ip/2; 
	        }
	        n=(int) (Math.pow(2,n)-1);
	        System.out.println(n);
	}*/
	        
	        while(N--!=0)
	        {
	            int n=s.nextInt();
	            String k=Integer.toBinaryString(n);
	            System.err.println(k);
	            int l1=k.length();
	            int l2=Integer.bitCount(n);
	            System.out.println((int)Math.pow(2,(l1-l2))-1);
	            
	            
	        }
	}
}

package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hire {

	 public static long balanced(String paranthisis) {
	        Stack<Character> stack  = new Stack<Character>();
	        long count =0;
	        for(int i = 0; i < paranthisis.length(); i++) {
	            char c = paranthisis.charAt(i);
	            if( c == '(' ) {
	                stack.push(c);
	            }else if(c == ')') {
	                if(stack.isEmpty()){break;}
	                stack.pop();
	                count++;
	            }

	        }
	        System.out.println();
	        long asd = findWays(count);
	        return asd;
	    }
	 
	 public static long findWays(long n)
	 {
	    
	  
	    // Otherwise return n/2'th Catalan Numer
	    return catalan(n);
	 }
	 
	// A Binomial coefficient based function to find nth catalan
	// number in O(n) time
	 public static long  catalan( long n)
	{
	    // Calculate value of 2nCn
	  long c = binomialCoeff(2*n, n);
	 
	    // return 2nCn/(n+1)
	    return c/(n+1);
	}
	 
	 public static  long binomialCoeff( long n,  long k)
	 {
	     int res = 1;
	  
	     // Since C(n, k) = C(n, n-k)
	     if (k > n - k)
	         k = n - k;
	  
	     // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
	     for (int i = 0; i < k; ++i)
	     {
	         res *= (n - i);
	         res /= (i + 1);
	     }
	  
	     return res;
	 }
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder string = new StringBuilder(br.readLine());
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
			string.append("(");
		} else {
			string.append(")");
		}

System.out.println(balanced(string.toString()));		
	}
}

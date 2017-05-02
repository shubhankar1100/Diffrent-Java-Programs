package hackerearth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class largerstDigit {

	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String k = br.readLine();
	        String[] ass = k.split(" ");
	       String temp = ass[0];
	       
	        int digit =   Integer.parseInt(ass[1]);
	        int[] newGuess = new int[temp.length()];
	        for (int i = 0; i < temp.length(); i++)
	        {
	            newGuess[i] = temp.charAt(i) - '0';
	        }
	      for(int j =0;j<digit;j++){
	    	  if(newGuess[j]==9){
	    	  
	    	  digit = digit+1;
	    	  }else{
	    		  newGuess[j] = 9;
	    	  }
	      }  
	        
	      for (int i = 0; i < temp.length(); i++)
	        {
	    	 // System.out.print(newGuess[i]);
	            
	        }
	}

}

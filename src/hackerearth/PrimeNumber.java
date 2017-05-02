package hackerearth;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 2; i < N; i++) {
        	int k,m=0,flag=0;    
        	  int n=i;//it is the number to be checked  
        	  m=i/2;    
        	  for(k=2;k<=m;k++){    
        	   if(n%k==0){    
        	  // System.out.print(n + " ");    
        	   flag=1;    
        	   break;    
        	   }    
        	  }    
        	  if(flag==0)    
        	  System.out.print(n + " ");   
        	}  
        }
	}



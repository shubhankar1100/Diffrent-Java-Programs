package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int c, first, last, middle, n, search, array[];
		 boolean flag = true;
		 int count = 1;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
         //n = Integer.parseInt(br.readLine());
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	    for (c = 0; c < n; c++)
	      array[c] =  in.nextInt();
	    Arrays.sort(array);
	    int min = array[0];
	    int max = array[array.length-1];
	    for(int i = min;i<max;i++){
	    
	 
	    first  = 0;
	    last   = n - 1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( array[middle] < i )
	        first = middle + 1;    
	      else if ( array[middle] == i  && flag) 
	      {
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last ){
		   flag = false;
	   }
	      
	  
	}
	    if(flag)
			   System.out.println("YES");
		   else
			   System.out.println("NO");  
	}
}

package stringManupulation;

import java.util.Scanner;

public class PalindromeCheck {
	  static boolean palindrome(String original){
			 String reverse = "";
			boolean flag = true;
			 int length = original.length();
			 
		     for ( int i = length - 1; i >= 0; i-- )
		        reverse = reverse + original.charAt(i);

		     if (original.equals(reverse)){
		    	 
		       // System.out.println("Entered string is a palindrome.");
		     }else{
		      //  System.out.println("Entered string is not a palindrome.");
		        flag =false ;}
			
			
			return flag;
		}
	public static void main(String[] args) {
		
		String original = "";
		 
	      Scanner in = new Scanner(System.in);
	 int length = 0;
	      original = in.nextLine();
	      
	      StringBuilder str1=new StringBuilder(original);
	      StringBuilder str=new StringBuilder(original);
	      StringBuilder str2=new StringBuilder(str.reverse());
	      if(str1.toString().contains("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq")){
	      length = str1.length();
	      
	      
	      while(str1.toString().equals(str2.toString())){
	    		if(str1.length() ==1){
					length=0;
					break;
				}
	      str1 = str1.deleteCharAt(0);
	      System.err.println(str1.toString());
	      str2 = str2.deleteCharAt(str1.length()); 
	      length = str1.length();
	      }
	      }
	      System.out.println(length);
	     
	}	
	}



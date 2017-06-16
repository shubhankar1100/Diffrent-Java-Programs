package code;

import java.util.Scanner;

public class PalindromeString {
static boolean palindrome(String original){
	 String reverse = "";
	boolean flag = true;
	 int length = original.length();
	 
     for ( int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);

     if (original.equals(reverse)){
    	 
        System.out.println("Entered string is a palindrome.");
     }else{
        System.out.println("Entered string is not a palindrome.");
        flag =false ;}
	
	
	return flag;
}
	public static void main(String[] args) {
		 String original = "";
	      Scanner in = new Scanner(System.in);
	 
	      //System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 boolean flag = palindrome(original);
	 while(flag==true){
		 System.out.println(original);
		 original =original.substring(0, original.length()-1);
		 palindrome(original);
	 }
	 
	  System.out.println(original.length());   

	}

}

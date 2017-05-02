package hackerearth;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AmazingPalindrome {
 static int count(ArrayList<String> array){
	 int count =0;
	 for(int i=0;i<array.size();i++){
		 
	 StringBuffer reverse = new StringBuffer(array.get(i));
	 reverse.reverse();
	 String a = reverse.toString();
	
	if(a.equals(array.get(i))){
		 System.out.println(reverse);
		count++;
	}
	 } 
	 return count;
 
	
 }
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        ArrayList<String> list = new ArrayList<>();
	        //StringBuilder string = new StringBuilder();
	        for(int i = 0;i<=line.length();i++){
	        	  for(int j = i+1;j<=line.length();j++){
	  	        	list.add(line.substring(i,j));
	  	        }	
	        }
	        System.err.println(list);
	        System.out.println(count(list));
	}

}

package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Recurssion {
 static LinkedList<Character> abc(LinkedList<Character> aa){
		boolean flag=false;
        for(int i=0;i< aa.size()-1;i++){
        	
        	if(aa.get(i)== aa.get(i+1)){
        		//System.out.println(aa.get(i) + " aSADas " + aa.get(i+1));
        		 Object obj = aa.remove(i);
        		 Object obj1 = aa.remove(i);
        	     // System.out.println(obj + " has been removed from LinkedList");
        	   //   System.out.println(obj1 + " has been removed from LinkedList");
        	     
        		flag =true;
        		
        	}
        	
        	
        }
        //System.out.println("LinkedList now contains : " + aa);
        
        if(aa.size()>0 &&  flag){
        	abc(aa);
        }
        
		return aa;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        char[] arr= line.toCharArray();
	       
	        LinkedList<Character> aa = new LinkedList<>();
	        for(int i=0;i<arr.length;i++){
	        	aa.add(arr[i]);
	        }
	        System.err.println(abc(aa));
	}

}

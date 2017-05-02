package stringManupulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CompilerVersionStringConversion {
	public static void main(String []args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line1= "";
		String line2=null;
		try{
		do{
		if(line2==null)
		continue;
		if(line2.trim().equals(""))
		break;
		line1+=line2.trim()+"\n";
		}while(!(line2=br.readLine()).trim().equals(""));
		}catch(Exception e){
			
		}
		String []str=line1.split("\n");
	     
	      for(int i=0;i<str.length;i++){
	        	
	        	int k=0;
	        	String s,l;
	        	if(str[i].contains("->")){
	        	k=str[i].indexOf("//");	
	        	System.out.println(k);
	        	if(k>0){
	        		s = str[i].substring(0,k);
	        		l =str[i].substring(k,str[i].length());
	        		s = s.replace("->", ".");
	        		System.out.println(s + l );
	        	}else if(k==0){
	        		System.out.println(str[i]);
	        	}	else{
	        		line1 = str[i].replace("->", ".");
	        		System.out.println(line1);
	        	}
	        	}else{
	        		System.out.println(str[i]);
	        	}
	        	
	        	
	        }

	}
}

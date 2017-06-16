package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PrintHackerearth {

	public static void main(String args[]) throws IOException {
		 Map<Character,Integer> match=new HashMap<>();
		 int acount = 0;
		 int hcount = 0;
		 int ccount = 0;
		 int kcount = 0;
		 int ecount = 0;
		 int rcount = 0;
		 int tcount = 0;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int noOfChar = Integer.parseInt(br.readLine());
	        
	        String string = br.readLine();
	        char[] arr = string.toCharArray();
	        for(int i = 0;i<arr.length;i++){
	        	 char c = arr[i];
	        	    switch (c) 
	        	    {
	        	        case 'a': 
	        	            acount++;
	        	            break;
	        	        case 'c': 
	        	            ccount++;
	        	            break;
	        	        case 'e':
	        	            ecount++;
	        	            break;
	        	        case 'h':
	        	            hcount++;
	        	            break;
	        	        case 'k':
	        	            kcount++;
	        	            break;
	        	        case 'r':
	        	            rcount++;
	        	            break;
	        	        case 't':
	        	            tcount++;
	        	            break;
	        	        default:
	        	            break;
	        	        }
	        }
	        acount = acount/2;
	        hcount = hcount/2;
	        ccount = ccount/1;
	        kcount = kcount/1;
	        ecount = ecount/2;
	        rcount = rcount/2;
	        tcount = tcount/1;
	        match.put('h', hcount);
			match.put('a', acount);
			match.put('c', ccount);
			match.put('k', kcount);
			match.put('e', ecount);
			match.put('r', rcount);
			match.put('t', tcount);
			int maxValueInMap=(Collections.min(match.values()));
	        System.out.println(maxValueInMap);
	}
}

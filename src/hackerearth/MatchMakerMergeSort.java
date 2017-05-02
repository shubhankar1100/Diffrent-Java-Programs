package hackerearth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MatchMakerMergeSort {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int noOfTC = s.nextInt();
	        int count=0;
	        for (int i = 0; i < noOfTC; i++) {
	        	count=0;
	            int noOfElements = s.nextInt();
	            ArrayList<Integer> arr1 = new ArrayList<Integer>();
	            ArrayList<Integer> arr2 = new ArrayList<Integer>();
	            for(int j=0;j<noOfElements;j++){
	            arr1.add(s.nextInt());	
	            }
	            Collections.sort(arr1);
	            for(int j=0;j<noOfElements;j++){
	            	arr2.add(s.nextInt());
		            }
	            Collections.sort(arr2, Collections.reverseOrder());
	            
	            for(Integer j =0;j<noOfElements;j++){
	            	if(arr1.get(j)%arr2.get(j)==0 || arr2.get(j)%arr1.get(j)==0){
	            		count ++;
	            	}
	            	
	            }
	            System.out.println(count);
	        }
	}

}

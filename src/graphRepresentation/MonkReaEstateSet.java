package graphRepresentation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonkReaEstateSet {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        Set<Integer> arr = new HashSet<>();
	        for (int i = 0; i < N; i++) {
	        	int noOfRoads = s.nextInt();
	        	
	        	for(int j=0;j< noOfRoads*2;j++){
	        		arr.add(s.nextInt());
	        	}
	        int count = arr.size();
	        System.out.println(count);
	        arr.clear();
	        }

	}

}

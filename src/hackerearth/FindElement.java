package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {
	public int BinaryCalculation(int[] arr, int search, int noOfSoilders) {
		int index = 0;

		int first = 0;
		int last = noOfSoilders - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < search)
				first = middle + 1;
			else if (arr[middle] == search) {
				index = middle + 1;
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}

		return index;

	}
	public static void main(String[] args) {
		FindElement index = new FindElement();
		 Scanner s = new Scanner(System.in);
	        int noOfElementInArray = s.nextInt();
	        int noOfQueries = s.nextInt();
	        int[] arr = new int[noOfElementInArray];
	        for (int i = 0; i < noOfElementInArray; i++) {
	            arr[i] = s.nextInt();
	           
	        }
	        Arrays.sort(arr);
	        for(int j =0;j<noOfQueries;j++){
	        	int val = index.BinaryCalculation(arr,s.nextInt() , noOfElementInArray);
	        	if(val==0){
	        		System.out.println("NO");
	        	}else{
	        		System.out.println("YES");
	        	}
	        }

	}

}

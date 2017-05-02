package stringManupulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaxicalRoration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String N = s.next();
		

		int n = N.length();

		// Create an array of strings to store all rotations
		//String[] arr = new String[n];
		 List<String> list = new ArrayList<String>();
		// Create a concatenation of string with itself
		// System.out.println(concat);
		// One by one store all rotations of str in array.
		// A rotation is obtained by getting a substring of concat
		/*for (int i = 0; i < n; i++) {

			// System.out.println(concat);
			list.add(N.substring(i, n) + N.substring(0, i));

			// concat = arr[i]+N;
			// System.err.println(arr[i]);
		}*/
		 for (int i = 0; i < N.length(); i = i + 1) {  
             if (N.length() - i >= n) {  
                  list.add(N.substring(i, n + i));  
             }  
        }  
		// Sort all rotations
		Collections.sort(list);

		// Return the first rotation from the sorted array
		System.out.println(list.get(list.size()-1));

	}

}

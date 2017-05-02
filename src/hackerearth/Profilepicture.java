package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Profilepicture {

	public static void main(String[] args) {
		int l = 180;
		int n = 1;

		int[] width = new int[n];
		int[] hight = new int[n];
		// int[] width = {640,120,180};
		// int[] hight = {480,300,180};
		/*
		 * for(int i = 0;i<n;i++){ if(i%2==0){ width[i] = ; }
		 * 
		 * }
		 */
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		String line = "124 125 ";
		String[] array = line.split(" ");
		for (int k = 0; k < n; k++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					width[k] = Integer.parseInt(array[j]);
				} else {
					hight[k] = Integer.parseInt(array[j]);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if ((width[i] == hight[i]) && (width[i] >= l && hight[i] >= l)) {
				System.out.println("ACCEPTED");
			} else if ((width[i] >= l && hight[i] >= l)) {
				System.out.println("CROP IT");
			} else {
				System.out.println("UPLOAD ANOTHER");
			}
		}

	}

}

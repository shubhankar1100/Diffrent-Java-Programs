package bitManupilation;

import java.util.Scanner;

public class PowerofTwo {
	// Print all subsets of given set[]
	static int printSubsets(int set[]) {
		int n = set.length;
		int k = 0;
		int m =0;
		// Run a loop for printing all 2^n
		// subsets one by obe

		for (int i = 0; i < (1 << n); i++) {
			// System.out.print("{ ");

			// Print current subset
			for (int j = 0; j < n; j++) {

				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				//k = set[];//<===problem
				System.out.println("about to entr"+ k);
				if ((i & (1 << j)) > 0) {
					// System.err.println(k);
				//	System.err.println("enter");
					k = k & set[j];

					
					// System.out.print(set[j] + " ");
				}

			}
			 m = Integer.bitCount(k);
			 if(m==1)
				 break;
			//System.err.println("sasa " + m);
			
			
			

			// System.out.print("},");
		}
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for (int i = 0; i < N; i++) {
			int arrSize = s.nextInt();
			int set[] = new int[arrSize];
			for (int j = 0; j < arrSize; j++) {
				set[j] = s.nextInt();
			}
			
			int m = printSubsets(set);
			
			if (m == 1) {
				System.out.println("Yes");
				//break;
			} else {
				System.out.println("No");
				//break;
			}
		}

	}

}

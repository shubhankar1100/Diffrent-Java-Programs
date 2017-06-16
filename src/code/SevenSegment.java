package code;

import java.util.Scanner;

public class SevenSegment {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr1 = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (t-- > 0) {
			int n = sc.nextInt();
			int low = Integer.MAX_VALUE, sum = 0;
			String s1 = "";
			while (n-- > 0) {
				String s = sc.next();
				sum = 0;
				for (int i = 0; i < s.length(); i++) {
					System.err.println(Character.getNumericValue(s.charAt(i)));
					sum += arr1[Character.getNumericValue(s.charAt(i))];
				}
				if (low > sum) {
					low = sum;
					s1 = s;
				}

			}
			System.out.println(s1);

		}
		sc.close();
	}
}

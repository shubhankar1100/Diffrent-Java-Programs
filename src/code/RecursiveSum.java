package code;

import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTC = s.nextInt();
		for (int i = 0; i < numberOfTC; i++) {
			long numberOfInput = (long) s.nextInt();
			long sum = 0;
			long result = 0;
			for (int j = 0; j <numberOfInput; j++) {

				long len = (long) s.nextInt();
				long digit = (long) s.nextInt();
				sum += digit * len;

				//System.out.println("sum " + sum);
			
				
			}
			long input = sum;
			result= sum;

			while (input > 9) {
				result = 0;
				while (input > 0) {
					long rem;
					rem = input % 10;
					result = result + rem;
					input = input / 10;
				}
				input = result;
			}
			System.out.println(result);
		}
		s.close();
	}
}
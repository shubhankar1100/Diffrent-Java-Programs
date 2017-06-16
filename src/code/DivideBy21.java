package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideBy21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int j = 0; j < N; j++) {
			boolean flag = false;
			String temp = br.readLine();
			int digit = Integer.parseInt(temp);
			int[] newGuess = new int[temp.length()];
			for (int i = 0; i < temp.length(); i++) {
				newGuess[i] = temp.charAt(i) - '0';
				// System.err.println((temp.charAt(i+1) - '0'));
				int k = i + 1;
				if (newGuess[i] == 2 && k < (temp.length()) && ((int) (temp.charAt(i + 1) - '0') == 1)) {
							flag = true;
							break;
						}
			}
			if (flag || (digit % 21 == 0)) {
				System.out.println("The streak is broken!");
			} else {
				System.out.println("The streak lives still in our heart!");

			}

		}
	}
}

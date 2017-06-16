package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditonChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int noOfTC = Integer.parseInt(br.readLine());
		for (int i = 0; i < noOfTC; i++) {
			String line = br.readLine();
			char[] carr = line.toCharArray();
			String reverse = new StringBuffer(line).reverse().toString();
			char[] carreverse = reverse.toCharArray();
			for (int j = 0; j < line.length(); j++) {
				char a = (char) (carr[j] - 96);
				char b = (char) (carreverse[j] - 96);
				char c = (char) ((a + b) + 96);
				if (c > 122) {
					char k = (char) (c - 122);
					char l = (char) (k + 96);
					System.err.print(l);
				} else
					System.err.print(c);
			}
			System.out.println();
		}
	}
}

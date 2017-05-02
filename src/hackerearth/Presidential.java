package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presidential {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfTC = Integer.parseInt(br.readLine());
		for (int k = 0; k < numberOfTC; k++) {
			String line = br.readLine();
			String[] array = line.split(" ");

			int numberOfQueries = Integer.parseInt(array[0]);
			int wordLength = Integer.parseInt(array[1]);

			String word = br.readLine();
			char[] charArr = word.toCharArray();

			for (int i = 0; i < numberOfQueries; i++) {
				String change = br.readLine();
				String[] changeArray = change.split(" ");

				int start = Integer.parseInt(changeArray[0]);
				int end = Integer.parseInt(changeArray[1]);
				for (int j = (start - 1); j <= end - 1; j++) {
					charArr[j] = (char) (charArr[j] - 1);
					if (charArr[j] == 96)
						charArr[j] = 122;
					// System.err.println(String.valueOf(charArr));
				}
			}
			System.out.println(String.valueOf(charArr));

		}
	}

}

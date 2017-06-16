package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindVowel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfTC = Integer.parseInt(br.readLine());
		

		for (int i = 0; i < numberOfTC; i++) {
			int count = 0;
			String line = br.readLine();
			char[] carr = line.toLowerCase().toCharArray();
			for (int j=0; j< carr.length;j++) {
				char find = carr[j];
				switch (find) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				default:
					break;

				}
			}
			System.out.println(count);
			
		}

	}

}

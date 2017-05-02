package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestPrimeNumber {

	static boolean isPrime(int n)// Function to check if a number is Prime.
	{
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)// Prime no.has 2 factors-1 and number itself.
			return true;
		else
			return false;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTC = Integer.parseInt(br.readLine());
		for (int k = 0; k < numberOfTC; k++) {
			
			int numberOfChar = Integer.parseInt(br.readLine());
			String word = br.readLine();
			//String word ="AvfmaLgLRpQadLyThsxVzkUqbFOdxfbLGdpBWOwmAnflENlYFbdhNHerHVtZkaPLgMtNQovVHpwGfHJdXXWAhYrhwXKPxtnpxCIsaXVAkcxTpVprFNeOVcnSEsgIvfqXPRSUASSDCvAGrFJCDbzGLFhrMYWALElChmurLrEeQttIWctyhQXzZUVAYuCIZecBJbXMxlMHFbZxJRTSZJmZAwCggGabVsovqBrdmmbCTaIHDfUunLFntfGzodKqoAKwCassKMDybethRaQgegsOawfNCNrIAkECEKpbwElhvWtlZBEZqJQpEkzpiSjrqZZIHbszUxwuWreXkxFKxSAiKoemIqETGVxcCjweKhbyXxhVKCbNTQBKgHD";
			if (word.length() == numberOfChar) {
				char[] magical = new char[word.length()];
				char[] c_arr = word.toCharArray();
				for (int j = 0; j < c_arr.length; j++) {
					int num = (int) c_arr[j];

					int diff1 = 0, diff2 = 0;
					char num1 = 0, num2 = 0;
					for (int i = num;; i++) {
						if (isPrime(i)) {
							diff1 = i - num;
							num1 = (char) i;
							break;
						}
					}
					for (int i = num;; i--) {
						if (isPrime(i)) {
							diff2 = num - i;
							num2 = (char) i;

							break;
						}
					}
					if ((diff1 < diff2) && (num1<=122&&num1>=65))//Nearest Prime number will have least difference from given number.
						magical[j] = num1;
					else if ((diff2 < diff1) && (num2<=122&&num2>=65))
						magical[j] = num2;
					else//There can be more than 1 nearest prime like for 6 we have 5 and 7 as nearest prime.
						magical[j] = num2;
				}
				System.out.println(String.valueOf(magical));
			}

		}
	}
}

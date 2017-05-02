package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsicutiveBinary {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String k = br.readLine();
		int[] newGuess = new int[k.length()];
		int counto = 1;
		int countl = 1;
		for (int i = 0; i < k.length(); i++) {
			
			
			newGuess[i] = k.charAt(i) - '0';
		}
		for(int i=0; i < k.length(); i++){
			if (newGuess[i] == 0) {
				int count0 = 0;
				for (int j = i; j < (i + 6); j++) {
					//System.out.println("newGuess[j] = " + newGuess[j] +" j = " + j + " i = " + i);
					if ((i + 6) <= k.length() && newGuess[j] == 0) {
						++count0;
						counto=count0;
						//System.err.println(counto);
					}else
						break;
				}
			} else if(newGuess[i] == 1){
				int count1 = 0;
				for (int j = i; j < i + 6; j++) {
					if ((i + 6) <= k.length() && newGuess[j] == 1) {
						++count1;
						countl=count1;
						//System.out.println(count1);
					}else{
						break;
					}
				}
			}
			//System.out.println(counto+ "======== " + countl);
			if (counto == 6 || countl == 6) {
				System.out.println("Sorry, sorry!");
				System.exit(0);
				// break;
			} 
			
		}
		System.out.println("Good luck!");
		

	}

}

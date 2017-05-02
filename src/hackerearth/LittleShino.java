package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleShino {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //  String line = br.readLine();
	        int N = Integer.parseInt( br.readLine());
	        String[] arr =  new String[N];
	        for(int i = 0; i<N;i++){
	        	arr[i] = br.readLine();
	        }
	        int noOfWords = Integer.parseInt( br.readLine());
	        String sentence = br.readLine();
	        for(int i = 0; i<N;i++){
	        	String regex = "\\s*\\b" +arr[i] +"\\b";
	        	sentence = sentence.replaceAll(regex, "").trim();
	        }
	        String firstLetters = "";
	        for(String s : sentence.split(" "))
	        {
	          firstLetters += s.charAt(0)+".";
	          
	        }
	        System.out.println(firstLetters.toUpperCase().substring(0, firstLetters.length()-1));

	}

}

package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpDFirstLetter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = line.split(" ");
        String word = null;
        for(int i=0;i<arr.length;i++){
       // String word = arr[i];
        	if(!arr[i].isEmpty()){	
      word =   arr[i].trim().substring(0, 1).toUpperCase();
      System.out.print(word + arr[i].substring(1)+ " ");
        	}else{
        		System.out.print(" ");
        	}
        	
        }

	}

}

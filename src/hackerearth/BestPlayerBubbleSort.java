package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BestPlayerBubbleSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //int N = Integer.parseInt(br.readLine());
        String[] arr = line.split(" ");
        int noOfFan = Integer.parseInt(arr[0]);
        int noOfFanMeet = Integer.parseInt(arr[1]);
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<noOfFan;i++){
        	String namePriority = br.readLine();
        	String[] arrName = line.split(" ");
        	map.put(arrName[0], Integer.parseInt(arrName[1]));
        }
        
        
	}

}

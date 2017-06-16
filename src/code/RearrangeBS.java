package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RearrangeBS {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		// int N = Integer.parseInt(br.readLine());

		String[] arr = line.split(" ");
		int numberOfStud = Integer.parseInt(arr[0]);
		int numberOfRows = Integer.parseInt(arr[1]);
		int numberOfSeatsInRow = Integer.parseInt(arr[2]);
		int count =0;
		String pref = br.readLine();
		String[] seatPref = pref.split(" ");
		Map<String, Integer> map = new HashMap<>();
		List<String> asList = Arrays.asList(seatPref);
		Set<String> mySet = new HashSet<String>(asList);
		for (String s : mySet) {
			map.put(s, Collections.frequency(asList, s));
			//System.out.println(s + " " + Collections.frequency(asList, s));

		}
		TreeMap<Integer,Integer> mazp = new TreeMap<Integer,Integer>();
		for ( Map.Entry<String, Integer> entry : map.entrySet()) {
		    Integer val = entry.getValue();
		    if(val>numberOfSeatsInRow){
		    	count += (val-numberOfSeatsInRow);
		    }
		}
System.out.println(count);
	}
}

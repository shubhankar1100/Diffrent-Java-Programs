package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BreakUpApp {
	static Map<Integer, Integer> map = new HashMap<>();

	public void calculation(String line, int weightage) {
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(line);
		/*if (line.contains("nineteen")) {
			map.put(19, weightage);
		} else if (line.contains("twenty one")) {
			map.put(21, weightage);
		}*/
		while (m.find()) {
			Integer key = Integer.parseInt(m.group(1));
			if (!(map.containsKey(key))) {
				map.put(key, weightage);
			} else {
				map.put(key, map.get(key) + weightage);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BreakUpApp app=new BreakUpApp();
		int v = 0;
		int count=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfLines = Integer.parseInt(br.readLine());
		for (int i = 0; i < numberOfLines; i++) {
			String line = br.readLine();

			if (line.startsWith("G")) {
				app.calculation(line, 2);
			} else {
				app.calculation(line, 1);
			}
			/*for(Map.Entry entry:map.entrySet()){
				 System.err.println(entry.getKey() + " : " + entry.getValue());
			}*/
			try{
			 v = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
			 }catch(NoSuchElementException e){
				 System.out.println("NO Date");
				 System.exit(0);
			 }
			
			 count = Collections.frequency(new ArrayList<Integer>(map.values()), map.get(v));
			/*System.out.println("count=== " + count);
			System.out.println(v);
*/			
		}
		if((v==19 || v==20) && count ==1){
			System.out.println("DATE");
		}else{
			System.out.println("NO DATE");
		}
	}
}

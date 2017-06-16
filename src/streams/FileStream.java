package streams;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FileStream {
	public static void main(String args[]){    
		Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
		//Collections.sort(map);
		//Map<String, Integer> map = new SortedMap<>();
		map.put("a", 1);
		map.put("b", 1);	
		map.put("e", 2);
		map.put("g", 1);
		map.put("d", 1);
		System.out.println(map);
		
   }    
}

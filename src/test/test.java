package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
	 public static String removeMacAddressSeperator(String macAddress) {
	        final int separatorIndex = 2;
	        return macAddress.replace(Character.toString(macAddress.charAt(separatorIndex)), "");
	    }
	
	
	public static void main(String[] args) throws Exception {


	Map<String , Map<String, Integer>> a = new HashMap<>();
		
	 Map<String, Integer> b= new HashMap<>();
	 b.put("a", 1);
	 b.put("b", 2);
	 b.put("c", 3);
	 a.put("shu", b);
	  //Stream<Integer> list =  a.values().stream().map(m -> m.get("c")).filter(Objects::nonNull);
	  b.put("s", 6);
	  a.put("shu", b);
	
	 System.out.println(a);
	 
	}
} 

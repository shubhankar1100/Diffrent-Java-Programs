package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IpLambda {
	public static String abc(String ipAddress) {
		StringBuilder hexIpAddress = new StringBuilder();
		int maxHexValue = 16;
		int maxOctetIteration = 4;
		String[] ipOctets = ipAddress.split("[\\.,]");
		 List<String> list=new ArrayList<String>();  
	       list.add("10");  
	       list.add("5");  
	       list.add("25");  
	       list.add("2");
		String result = list
			   .stream()
			   //.fi
			   .map(s -> {
			   	hexIpAddress.setLength(0);
			   	//System.out.println();
			   	if (list.size() < maxOctetIteration) {
						hexIpAddress.append("00000000");
						//System.exit(0);
					} else {
						hexIpAddress.setLength(0);
							int decimal = Integer.parseInt(s);
							if (decimal < maxHexValue) {
								hexIpAddress.append("0" + String.format("%01X", decimal));
								
							} else {
								hexIpAddress.append(String.format("%01X", decimal));
					}
			   	}
			   	return hexIpAddress.toString();
			   })
			   .collect(Collectors.joining());
	
	if(result.length() >0 &&result.charAt(0)=='0'  ){
		result = result.substring(1);
	}
	System.err.println(result);
		return result;
	}

	public static String zxc(String ipAddress) {
		StringBuilder hexIpAddress = new StringBuilder();
		int maxHexValue = 16;
		int maxOctetIteration = 4;
		String[] ipOctets = ipAddress.split("[\\.,]");
		 if (ipOctets.length < maxOctetIteration) {
	            hexIpAddress.append("00000000");
	        } else {
	       Arrays.stream(ipOctets).filter(num -> ipOctets.length==maxOctetIteration).forEach(num -> {
							int decimal = Integer.parseInt(num);
							if (decimal < maxHexValue && ipOctets[0] != num) {
								hexIpAddress.append("0" + String.format("%01X", decimal));
								
							} else {
								hexIpAddress.append(String.format("%01X", decimal));
							}
			  
	       });
	        }
	     return hexIpAddress.toString();  
	       
	}

public static void main(String[] args) {
		System.out.println(zxc("10.5.52.2"));
	}
}

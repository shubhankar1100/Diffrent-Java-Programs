package lambdaExp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.xml.bind.DatatypeConverter;

public class IptoHexLambda {
	private static String hexIpAddress;

	public static String ipAddress(String ipAddress) {
		StringBuilder hexIpAddress = new StringBuilder();
		final int maxHexValue = 16;
		final int maxOctetIteration = 4;
		String[] ipOctets = ipAddress.split("[\\.,]");
		if (ipOctets.length < maxOctetIteration) {
			hexIpAddress.append("00000000");
		} else {
			for (int octetIterator = 0; octetIterator < ipOctets.length; octetIterator++) {
				int decimal = Integer.parseInt(ipOctets[octetIterator]);
				if (decimal < maxHexValue && octetIterator > 0) {
					hexIpAddress.append("0" + String.format("%01X", decimal));
				} else {
					hexIpAddress.append(String.format("%01X", decimal));
				}
			}
		}
		return hexIpAddress.toString();
	}
	
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
						//hexIpAddress.append("00000000");
						//System.exit(0);
					} else {
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

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress a = InetAddress.getByAddress(DatatypeConverter.parseHexBinary("0A064156"));
		//String a = NULL; 
		System.out.println(abc("10.5.25.2"));

	}
}

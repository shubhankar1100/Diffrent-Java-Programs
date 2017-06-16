package test;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
		String a = "32.5,25.2,45.65,85.14,3214";
		String[] f = a.split(",");
		
		for(int i =0;i<f.length;i++)
			System.out.println(f[i]);
		
		for(String s : f)
			System.err.println(s);
		
		Arrays.stream(f).filter(as -> as.endsWith("5")).forEach(as-> {
			System.out.println(as+10);
		});
		
	}
}

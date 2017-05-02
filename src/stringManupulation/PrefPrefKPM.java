package stringManupulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrefPrefKPM {
	public static int count(String s, String t){
		int i = 0;
		int c = 0;
		for(char ch : s.toCharArray()){
		if(t.indexOf(ch,i+1)==-1 || ch=='\0'){
		return (c);
		}
		else{
			System.err.println("err: " +t.indexOf(ch,i+1) + "i    " + i);
		if(t.indexOf(ch,i+1)>=i){
		i = t.indexOf(ch,i+1);
		c++;
		}
		}
		}
		return (c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(count(s,t));
	}

}

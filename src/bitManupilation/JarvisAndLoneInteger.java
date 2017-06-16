package bitManupilation;

import java.util.HashSet;
import java.util.Scanner;

public class JarvisAndLoneInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        for (int i = 0; i < N; i++) {
	        	int arrSize = s.nextInt(); 
	        	HashSet<Integer> set=new HashSet<>(); 
	        	for(int j=0;j<arrSize;j++){
	        		
	        		set.add(s.nextInt());
	        		
	        	}
	        	
	        	int len = set.size();
	        	int result = (len- (arrSize-len));
	        	
	        	if(result ==0)
	        		System.out.println("-1");
	        	else
	        		System.out.println(result);
	        }
	}

}

package bitManupilation;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetXOR {
	static int  findXOR( ArrayList<Integer> set, int n)
	{
	    // XOR is 1 only when n is 1, else 0
	    if (n == 1)
	       return set.get(0);
	    else
	       return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
        	ArrayList<Integer> arr = new ArrayList<>();
        	int arrLength = s.nextInt();
        	for(int j = 0;j< arrLength;j++){
        		arr.add(s.nextInt());
        	}
        	 int n = arr.size()/1;
        	System.out.println(findXOR(arr, n));
        }
	}

}

package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenSum {
	
	private static int GetSubArraysCount(int[] nums, int k)
    {
		  int[] cache = new int[k];
		    cache[0]++;
		    int s = 0, counter = 0;
		    for (int i = 0; i < nums.length; i++) {
		        s = ((s + nums[i]) % k + k) % k;
		        counter += cache[s];
		        cache[s]++;
		    }

		    return counter;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String line = br.readLine();
        int N = Integer.parseInt( br.readLine());
        
        String line = br.readLine();
        String[] arr = line.split(" ");
        
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           result[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(GetSubArraysCount(result, 2)-1);

	}

}

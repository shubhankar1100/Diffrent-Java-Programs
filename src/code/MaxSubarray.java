package code;

import java.util.Scanner;

public class MaxSubarray {
    public int maxSequenceSum(int[] arr)

    {        
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            /* calculate maxEndingHere */

            if (maxEndingHere < 0)
                maxEndingHere = arr[i];
            else
                maxEndingHere += arr[i];
            /* calculate maxSoFar */

            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }

        return maxSoFar;

    }    
	
	public static void main(String[] args) {
		int sum = 0;
        Scanner scan = new Scanner(System.in);
        /* Make an object of Kadane class */
        MaxSubarray k = new MaxSubarray();
        int N = scan.nextInt();
        /* Accept two 2d matrices */
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        if(N>0)
         sum = k.maxSequenceSum(arr);

        System.out.println("\nMaximum Sequence sum = "+ sum);
scan.close();
	}

}

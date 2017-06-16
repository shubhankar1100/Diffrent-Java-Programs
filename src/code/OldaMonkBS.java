package code;

import java.util.Scanner;

public class OldaMonkBS {
	public int binarySearch(int[] inputArr, int search) {

		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (search >= inputArr[mid] && inputArr[mid - 1] >= search && inputArr[mid + 1] <= search) {
				end = mid;
			}
			if (search <= inputArr[mid] && inputArr[mid - 1] >= search) {
				start = mid;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int TC = scan.nextInt();

		for (int i = 0; i < TC; i++) {
			long max = 0, diff;
			int N = scan.nextInt();
			long[] A = new long[N];
			long[] B = new long[N];
			for (int s = 0; s < N; s++) {
				A[s] = scan.nextLong();
			}
			for (int l = 0; l < N; l++) {
				B[l] = scan.nextLong();
			}
			// Arrays.sort(A);
			// Arrays.sort(B);
			for (int j = 0; j < N; j++) {
				for (int k = j; k < N; k++) {
					if (k >= j && B[k] >= A[j]) {
						diff = k - j;
						if (max < diff)
							max = diff;
					} else if (k < j && B[k] < A[j]) {
						break;
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
	}

}

package hackerearth;

import java.util.Scanner;

public class BinaryWar {
	public int BinaryCalculation(int[] arr, int search, int noOfSoilders) {
		int index = 0;

		int first = 0;
		int last = noOfSoilders - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < search)
				first = middle + 1;
			else if (arr[middle] == search) {
				index = middle + 1;
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}

		return index;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryWar war = new BinaryWar();
		int noOfsoilder = s.nextInt();
		int[] arr = new int[noOfsoilder];
		for (int i = 0; i < noOfsoilder; i++) {
			arr[i] = s.nextInt();
		}
		int noOfTC = s.nextInt();

		for (int i = 0; i < noOfTC; i++) {
			int sum = 0;
			int power = s.nextInt();
			int index = war.BinaryCalculation(arr, power, noOfsoilder);
			if (index == 0) {
				index = noOfsoilder;
			}
			for (int j = 0; j < index; j++) {
				sum += arr[j];
			}
			System.out.println(index + " " + sum);
		}

	}

}

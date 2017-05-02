package test;

public class InsertionSort {
	public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}
	public static void main(String[] args) {
		int length = 1;
		int a[] = { 84, 90, 120 };
		int hcfOfNumbers = a[0];
		if (length == 1) {
			hcfOfNumbers = a[0];
		} else {

			for (int i = 0; i < length - 1; i++) {

				hcfOfNumbers = InsertionSort.hcf(hcfOfNumbers, a[i + 1]);
			}
		}
		System.out.println(hcfOfNumbers);

	}
}

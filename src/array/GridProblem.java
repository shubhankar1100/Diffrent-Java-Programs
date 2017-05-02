package array;

import java.util.Scanner;

public class GridProblem {
	static int sum = 0;

	static int squareMatrixWith1(int[][] arr) {
		int newArr[][] = new int[arr.length][arr.length];
		sum = 0;
		newArr = newArr(arr, newArr, true);
		return finalSum(arr, sum, newArr, true);
	}

	static int squareMatrixWith0(int[][] arr) {
		int newArr[][] = new int[arr.length][arr.length];
		sum = 0;
		newArr = newArr(arr, newArr, false);
		return finalSum(arr, sum, newArr, false);
	}

	static int min(int up, int left, int daigonal) {
		int m = up;
		if (m > left)
			m = left;
		if (m > daigonal)
			m = daigonal;
		return m;
	}

	static int finalSum(int[][] arr, int sum, int[][] newArr, boolean flag) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i][j] == 1 && flag) {
					newArr[i][j] = min(newArr[i][j - 1], newArr[i - 1][j],
							newArr[i - 1][j - 1]) + 1;
					sum += newArr[i][j];
				} else if (arr[i][j] == 0 && !flag) {
					newArr[i][j] = min(newArr[i][j - 1], newArr[i - 1][j],
							newArr[i - 1][j - 1]) + 1;
					sum += newArr[i][j];
				}
			}
		}

		return sum;
	}

	static int[][] newArr(int[][] arr, int[][] newArr, boolean flag) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == 1 && flag) {
				newArr[i][0] = 1;
				sum += newArr[i][0];
			} else if (arr[i][0] == 0 && !flag) {
				newArr[i][0] = 1;
				sum += newArr[i][0];
			}
		}
		for (int j = 1; j < arr.length; j++) {
			if (arr[0][j] == 1 && flag) {
				newArr[0][j] = 1;
				sum += newArr[0][j];
			} else if (arr[0][j] == 0 && !flag) {
				newArr[0][j] = 1;
				sum += newArr[0][j];
			}
		}

		return newArr;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTest = s.nextInt();

		for (int i = 0; i < noOfTest; i++) {
			int matrixSize = s.nextInt();
			int arr[][] = new int[matrixSize][matrixSize];
			for (int j = 0; j < matrixSize; j++) {
				for (int k = 0; k < matrixSize; k++) {
					arr[j][k] = s.nextInt();

				}

			}

			System.out.println(squareMatrixWith0(arr) + squareMatrixWith1(arr));

		}
		s.close();
	}

}

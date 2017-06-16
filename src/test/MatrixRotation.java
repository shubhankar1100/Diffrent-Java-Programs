package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixRotation {

	private static int[][] rotate(int[][] arraymatrix, int matrixSize){
		int newMatrix[][] = new int[matrixSize][matrixSize];
		
		for(int i=0;i<matrixSize;i++){
			int n = matrixSize-1;
			for(int j=0;j<matrixSize;j++){
				newMatrix[i][j] = arraymatrix[n][i];
				n--;
			}
		}
		
		
		return newMatrix;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the size of square matrix : ");
		final int matrixSize = Integer.parseInt(br.readLine());
		int matrix[][] =  new int[matrixSize][matrixSize];
		
		for(int i=0;i<matrixSize;i++){
			for(int j=0;j<matrixSize;j++){
				matrix[i][j] = Integer.parseInt(br.readLine());
			}
		}
		int finalMatrix[][] =  rotate(matrix,matrixSize);
		for(int i=0;i<matrixSize;i++){
			for(int j=0;j<matrixSize;j++){
				System.out.print(finalMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

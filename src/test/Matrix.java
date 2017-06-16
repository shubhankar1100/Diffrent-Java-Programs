package test;

public class Matrix {
	 public static void main(String[] args) {  
	        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };  
	        int order = matrix.length;  
	  
	        System.out.println("Before Rotation : ");  
	        printMatrix(matrix, order);  
	  
	        rotateClockwise(matrix, order);  
	  
	        System.out.println("\nAfter Rotation : ");  
	        printMatrix(matrix, order);  
	    }  
	  
	    /** 
	     * Method to rotate a matrix by 90degree clockwise 
	     *  
	     * @param matrix 
	     *            Matix to rotate 
	     * @param order 
	     *            Order of the marix. 
	     */  
	    public static void rotateClockwise(final int[][] matrix, final int order) {  
	        transposeMatrix(matrix, order);  
	        mirrorHorizontally(matrix, order);  
	    }  
	  
	    /** 
	     * Method to take transpose of a given matrix. 
	     *  
	     * @param matrix 
	     *            Matrix to be transposed. 
	     * @param order 
	     *            Order of the matrix. 
	     */  
	    public static void transposeMatrix(final int[][] matrix, final int order) {  
	        for (int i = 0; i < order; i++) {  
	            for (int j = i + 1; j < order; j++) {  
	                int temp = matrix[i][j];  
	                matrix[i][j] = matrix[j][i];  
	                matrix[j][i] = temp;  
	            }  
	        }  
	    }  
	  
	    /** 
	     * Method to take mirror the matrix horizontally. 
	     *  
	     * @param matrix 
	     *            Matrix to mirror. 
	     * @param order 
	     *            Order of the matrix. 
	     */  
	    public static void mirrorHorizontally(final int[][] matrix, final int order) {  
	        for (int i = 0; i < order / 2; i++) {  
	            for (int j = 0; j < order; j++) {  
	                int temp = matrix[j][i];  
	                matrix[j][i] = matrix[j][order - (i + 1)];  
	                matrix[j][order - (i + 1)] = temp;  
	            }  
	        }  
	    }  
	  
	    /** 
	     * Method to print the given matrix. 
	     *  
	     * @param matrix 
	     *            Matrix for which elements are to be printed. 
	     * @param order 
	     *            Order of the matrix. 
	     */  
	    public static void printMatrix(final int[][] matrix, final int order) {  
	        for (int i = 0; i < order; i++) {  
	            for (int j = 0; j < order; j++) {  
	                System.out.print("" + matrix[i][j] + " ");  
	            }  
	            System.out.println();  
	        }  
	    }  
}

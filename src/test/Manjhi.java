package test;

import java.util.Arrays;
import java.util.Scanner;

public class Manjhi {
	int row = 4;
	int col = 6;
	double result = 0;
	double a[][] =  new double[row][col];
	double matrixFinal[][] = new double[row][col];
	private double[] sumOfRow = new double[row];
	private double[] sumOfCol = new double[col];
	private double[][] costMatrix;
    private int        rows;
	private int cols;
	private int dim;
    private double[]   labelByWorker, labelByJob;
    private int[]      minSlackWorkerByJob;
    private double[]   minSlackValueByJob;
    private int[]      matchJobByWorker, matchWorkerByJob;
    private int[]      parentWorkerByCommittedJob;
    private boolean[]  committedWorkers;
	public void printMatrix(int row, int col, double[][] mat) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		matrixFinal = mat;

	}

	public void printSumsOfMatrix(int row, int col, double[][] a) {
		for (int i = 0; i < row; i++)
			System.out.print(sumOfRow[i] + "  ");
		System.out.println();
		for (int i = 0; i < col; i++)
			System.out.print(sumOfCol[i] + " ");
		System.out.println();
	}

	public void sumsOfMatrix(int row, int col, double[][] a) {
		
		for (int i = 0; i < col; i++)
			for (int j = 0; j < row; j++) {
				sumOfCol[i] =sumOfCol[i] + a[j][i];
			}

	}

	public double[][] process(double mat[][]) {
		for (int run = 0; run < (col - row); run++) {
			int maxCol = findMaxColIndex();
			int maxRow = findMaxRowIndex();
			int min = 0;
			System.out.println(maxCol + "----" + maxRow);
			int i = 0;
			min = 9;
			while (i != row) {
				if (mat[i][maxCol] <= min) {
					System.out.println("if" + mat[i][maxCol]);
					min = (int) mat[i][maxCol];
				} else {
					mat[i][maxCol] = 0;
					System.out.println("else" + mat[i][maxCol]);
					// i=i+1;
				}
				i = i + 1;
			}
			System.out.println("777  " + min);
			result = result + min;
			for (i = 0; i < row; i++)
				for (int j = maxCol; j < col - 1; j++) {
					System.out.println("fhldhlkhkhls");
					mat[i][j] = mat[i][j + 1];
				}
			System.out.println("before" + col);
			col = col - 1;
			System.out.println("after" + col);
			System.out.println("res" + result);
			printMatrix(row, col, mat);
			process(mat);
		}
		System.out.println("/n");
		printMatrix(row, col, mat);
		return mat;

	}

	public int findMaxColIndex() {
		int maxCol = 0;
		for (int i = 0; i < col - 1; i++) {
			if (sumOfCol[i + 1] > sumOfCol[i])
				maxCol = i + 1;
		}
		return maxCol;
	}

	public int findMaxRowIndex() {
		int maxRow = 0;
		for (int i = 0; i < row - 1; i++) {
			if (sumOfRow[i + 1] > sumOfRow[i])
				maxRow = i + 1;
		}
		return maxRow;
	}

		public void start() {
		//double a[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 },
				//{ 3, 3, 3, 3, 3 } };
		
		double a[][]={{1,9,9,4,1,1},{2,8,3,5,9,9},{3,1,5,2,5,5},{3,1,2,9,5,5}};
		// double a[][]={{1,9,5,4,1,1},{2,8,7,5,9,9},{3,1,9,9,5,5}};
		sumsOfMatrix(row, col, a);
		printMatrix(row, col, a);
		printSumsOfMatrix(row, col, a);
		process(a);
		System.out.println("col in start" + col);
		double matrixHungry[][] = new double[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrixHungry[i][j] = matrixFinal[i][j];
		manjhiProblem(matrixHungry);
		System.out.println("**********************");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matrixFinal[i][j]);
			}
			System.out.println();
		}

		int[] result1 = execute();

		System.out.println("Bipartite Matching: " + Arrays.toString(result1));
		for (int i = 0; i < col; i++) {
			int val = result1[i];
			System.out.println("1111" + val);
			result = result + matrixFinal[i][val];
		}
		System.out.println("final result" + result);
		// printMatrix(row,col,a);

	}	
	 
	    public void manjhiProblem(double[][] costMatrix)
	    {
	        this.dim = Math.max(costMatrix.length, costMatrix[0].length);
	        this.rows = costMatrix.length;
	        this.cols = costMatrix[0].length;
	        System.err.println(rows + " rows and col"+ cols);
	        this.costMatrix = new double[this.dim][this.dim];
	        for (int w = 0; w < this.dim; w++)
	        {
	            if (w < costMatrix.length)
	            {
	                if (costMatrix[w].length != this.cols)
	                {
	                    throw new IllegalArgumentException("Irregular cost matrix");
	                }
	                this.costMatrix[w] = Arrays.copyOf(costMatrix[w], this.dim);
	            }
	            else
	            {
	                this.costMatrix[w] = new double[this.dim];
	            }
	        }
	        labelByWorker = new double[this.dim];
	        labelByJob = new double[this.dim];
	        minSlackWorkerByJob = new int[this.dim];
	        minSlackValueByJob = new double[this.dim];
	        committedWorkers = new boolean[this.dim];
	        parentWorkerByCommittedJob = new int[this.dim];
	        matchJobByWorker = new int[this.dim];
	        Arrays.fill(matchJobByWorker, -1);
	        matchWorkerByJob = new int[this.dim];
	        Arrays.fill(matchWorkerByJob, -1);
	    }
	 
	   

		protected void computeInitialFeasibleSolution()
	    {
	        for (int j = 0; j < dim; j++)
	        {
	            labelByJob[j] = Double.POSITIVE_INFINITY;
	        }
	        for (int w = 0; w < dim; w++)
	        {
	            for (int j = 0; j < dim; j++)
	            {
	                if (costMatrix[w][j] < labelByJob[j])
	                {
	                    labelByJob[j] = costMatrix[w][j];
	                }
	            }
	        }
	    }
	 
	    public int[] execute()
	    {
	        /*
	         * Heuristics to improve performance: Reduce rows and columns by their
	         * smallest element, compute an initial non-zero dual feasible solution
	         * and
	         * create a greedy matching from workers to jobs of the cost matrix.
	         */
	    	System.out.println("--------------------------------------------------------");  
	    	for (int i = 0; i < 3; i++)
	           {
	               for (int j = 0; j < 3; j++)
	               {
	               	System.out.print(" "+costMatrix[i][j]);
	               }
	               System.out.println();}
	    	System.out.println("--------------------------------------------------------");  
	    	reduce();
	        computeInitialFeasibleSolution();
	        greedyMatch();
	        int w = fetchUnmatchedWorker();
	        while (w < dim)
	        {
	            initializePhase(w);
	            executePhase();
	            w = fetchUnmatchedWorker();
	        }
	        int[] result = Arrays.copyOf(matchJobByWorker, rows);
	        for (w = 0; w < result.length; w++)
	        {
	            if (result[w] >= cols)
	            {
	                result[w] = -1;
	            }
	        }
	        return result;
	    }
	 
	    protected void executePhase()
	    {
	        while (true)
	        {
	            int minSlackWorker = -1, minSlackJob = -1;
	            double minSlackValue = Double.POSITIVE_INFINITY;
	            for (int j = 0; j < dim; j++)
	            {
	                if (parentWorkerByCommittedJob[j] == -1)
	                {
	                    if (minSlackValueByJob[j] < minSlackValue)
	                    {
	                        minSlackValue = minSlackValueByJob[j];
	                        minSlackWorker = minSlackWorkerByJob[j];
	                        minSlackJob = j;
	                    }
	                }
	            }
	            if (minSlackValue > 0)
	            {
	                updateLabeling(minSlackValue);
	            }
	            parentWorkerByCommittedJob[minSlackJob] = minSlackWorker;
	            if (matchWorkerByJob[minSlackJob] == -1)
	            {
	                /*
	                 * An augmenting path has been found.
	                 */
	                int committedJob = minSlackJob;
	                int parentWorker = parentWorkerByCommittedJob[committedJob];
	                while (true)
	                {
	                    int temp = matchJobByWorker[parentWorker];
	                    match(parentWorker, committedJob);
	                    committedJob = temp;
	                    if (committedJob == -1)
	                    {
	                        break;
	                    }
	                    parentWorker = parentWorkerByCommittedJob[committedJob];
	                }
	                return;
	            }
	            else
	            {
	                /*
	                 * Update slack values since we increased the size of the
	                 * committed
	                 * workers set.
	                 */
	                int worker = matchWorkerByJob[minSlackJob];
	                committedWorkers[worker] = true;
	                for (int j = 0; j < dim; j++)
	                {
	                    if (parentWorkerByCommittedJob[j] == -1)
	                    {
	                        double slack = costMatrix[worker][j]
	                                - labelByWorker[worker] - labelByJob[j];
	                        if (minSlackValueByJob[j] > slack)
	                        {
	                            minSlackValueByJob[j] = slack;
	                            minSlackWorkerByJob[j] = worker;
	                        }
	                    }
	                }
	            }
	        }
	    }
	 
	    protected int fetchUnmatchedWorker()
	    {
	        int w;
	        for (w = 0; w < dim; w++)
	        {
	            if (matchJobByWorker[w] == -1)
	            {
	                break;
	            }
	        }
	        return w;
	    }
	 
	    protected void greedyMatch()
	    {
	        for (int w = 0; w < dim; w++)
	        {
	            for (int j = 0; j < dim; j++)
	            {
	                if (matchJobByWorker[w] == -1
	                        && matchWorkerByJob[j] == -1
	                        && costMatrix[w][j] - labelByWorker[w] - labelByJob[j] == 0)
	                {
	                    match(w, j);
	                }
	            }
	        }
	    }
	 
	    protected void initializePhase(int w)
	    {
	        Arrays.fill(committedWorkers, false);
	        Arrays.fill(parentWorkerByCommittedJob, -1);
	        committedWorkers[w] = true;
	        for (int j = 0; j < dim; j++)
	        {
	            minSlackValueByJob[j] = costMatrix[w][j] - labelByWorker[w]
	                    - labelByJob[j];
	            minSlackWorkerByJob[j] = w;
	        }
	    }
	 
	    protected void match(int w, int j)
	    {
	        matchJobByWorker[w] = j;
	        matchWorkerByJob[j] = w;
	    }
	 
	    protected void reduce()
	    {
	        for (int w = 0; w < dim; w++)
	        {
	            double min = Double.POSITIVE_INFINITY;
	            for (int j = 0; j < dim; j++)
	            {
	                if (costMatrix[w][j] < min)
	                {
	                    min = costMatrix[w][j];
	                }
	            }
	            for (int j = 0; j < dim; j++)
	            {
	                costMatrix[w][j] -= min;
	            }
	        }
	        double[] min = new double[dim];
	        for (int j = 0; j < dim; j++)
	        {
	            min[j] = Double.POSITIVE_INFINITY;
	        }
	        for (int w = 0; w < dim; w++)
	        {
	            for (int j = 0; j < dim; j++)
	            {
	                if (costMatrix[w][j] < min[j])
	                {
	                    min[j] = costMatrix[w][j];
	                }
	            }
	        }
	        for (int w = 0; w < dim; w++)
	        {
	            for (int j = 0; j < dim; j++)
	            {
	                costMatrix[w][j] -= min[j];
	            }
	        }
	    }
	 
	    protected void updateLabeling(double slack)
	    {
	        for (int w = 0; w < dim; w++)
	        {
	            if (committedWorkers[w])
	            {
	                labelByWorker[w] += slack;
	            }
	        }
	        for (int j = 0; j < dim; j++)
	        {
	            if (parentWorkerByCommittedJob[j] != -1)
	            {
	                labelByJob[j] -= slack;
	            }
	            else
	            {
	                minSlackValueByJob[j] -= slack;
	            }
	        }
	    }
	/* private void getValues(){
		 Scanner s = new Scanner(System.in);
         col = s.nextInt();
         rows = s.nextInt();
     	
     	for(int i=0;i<row;i++){
     		for(int j = 0; j<col;j++){
     			
     			a[row][col] = s.nextInt();
     		}
     	}
     	start();
         
	 }*/
	    
		public static void main(String[] args) {

		   

	       /* for (int i = 0; i < N; i++) {
	            System.out.println("hello world" +N);*/
	            
	           
			Manjhi man = new Manjhi();
			man.start();
		}
}

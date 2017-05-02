package test;

import java.util.Arrays;
import java.util.Scanner;

public class Final {
	int row ;
	int col ;
	double result = 0;
	double a[][] =  new double[row][col];
	double matrixFinal[][] = new double[row][col];
	private int[] sumOfRow = new int[row];
	private int[] sumOfCol = new int[col];
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

	public void sumsOfMatrix(int row, int col, double[][] a) {
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				sumOfRow[i] = (int) (sumOfRow[i] + a[i][j]);
			}
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				sumOfCol[j] = (int) (sumOfCol[j] + a[i][j]);
			}

	}

	public double[][] process(double mat[][]) {
		for (int run = 0; run < (col - row); run++) {
			int maxCol = findMaxColIndex();
			int maxRow = findMaxRowIndex();
			int min = 0;
			int i = 0;
			min = 9;
			while (i != row) {
				if (mat[i][maxCol] <= min) {
					min = (int) mat[i][maxCol];
				} else {
					mat[i][maxCol] = 0;
				}
				i = i + 1;
			}
			result = result + min;
			for (i = 0; i < row; i++)
				for (int j = maxCol; j < col - 1; j++) {
					mat[i][j] = mat[i][j + 1];
				}
			col = col - 1;
			printMatrix(row, col, mat);
			process(mat);
		}
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

	public void printMatrix(int row, int col, double[][] mat) {
		matrixFinal = mat;

	}

		public void start() {
		//double a[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 },{ 3, 3, 3, 3, 3 } };
		
		//double a[][]={{1,9,9,4,1,1},{2,8,3,5,9,9},{3,1,5,2,5,5},{3,1,2,9,5,5}};
		 //double a[][]={{1,9,5,4,1,1},{2,8,7,5,9,9},{3,1,9,9,5,5}};
		sumsOfMatrix(row, col, a);
		process(a);
		double matrixHungry[][] = new double[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				matrixHungry[i][j] = matrixFinal[i][j];
		manjhiProblem(matrixHungry);
	
		int[] result1 = execute();

		for (int i = 0; i < col; i++) {
			int val = result1[i];
			result = result + matrixFinal[i][val];
		}
		System.err.println(result);
	}	
	 
	    public void manjhiProblem(double[][] costMatrix)
	    {
	        this.dim = Math.max(costMatrix.length, costMatrix[0].length);
	        this.rows = costMatrix.length;
	        this.cols = costMatrix[0].length;
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
	 private void getValues(){
		Scanner s = new Scanner(System.in);
         col = s.nextInt();
         row = s.nextInt();
     	
     /*	for(int i=0;i<row;i++){
     		for(int j = 0; j<col;j++){
     			
     			a[i][j] = s.nextInt();
     		}
     	}*/
     	double a1[][] ={ { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 },{ 3, 3, 3, 3, 3 } };
     	a=a1;
     	
     	start();
         
	 }
	    
		public static void main(String[] args) {
		 			Final man = new Final();
			man.getValues();
		}
}

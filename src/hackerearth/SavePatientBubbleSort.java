package hackerearth;

import java.util.Scanner;

public class SavePatientBubbleSort {
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int[] arrVaccine=new int[N];
	        int[] arrPacient=new int[N];
	        for (int i = 0; i < N; i++) {
	        	arrVaccine[i] = s.nextInt();
	        }
	        
	        for (int i = 0; i < N; i++) {
	        	arrPacient[i] = s.nextInt();
	        }
	        bubbleSort(arrVaccine);
	        bubbleSort(arrPacient);
	       /* for(int i = 0;i<N;i++)
	        	System.out.println(arrVaccine[i]);*/
	        for(int i=0;i<N;i++){
	        	if(arrVaccine[i]<arrPacient[i]){
	        		System.out.println("No");
	        		System.exit(0);
	        	}
	        	
	        }
	        System.out.println("Yes");
	}

}

package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChanduAndGirlfriendMergeSort {
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)  
	       answer[k++] = a[i] > b[j] ? a[i++] :  b[j++];

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int j=0;j<N;j++){
        String line = br.readLine();
        String[] arr = line.split(" ");
        int noArr1 = Integer.parseInt(arr[0]);
        int noArr2 = Integer.parseInt(arr[1]);
        int[] arr1 = new int[noArr1];
        int[] arr2 = new int[noArr2];
        int[] finalArr = new int[noArr1+noArr2];
        String s1 = br.readLine();
        String[] arrS1 = s1.split(" ");
        for(int i=0;i<noArr1;i++){
        	arr1[i]=Integer.parseInt(arrS1[i]);
        }
        String s2 = br.readLine();
        String[] arrS2 = s2.split(" ");
        for(int i=0;i<noArr2;i++){
        	arr2[i]=Integer.parseInt(arrS2[i]);
        }
        finalArr = merge(arr1, arr2);
        
        
        
        for(int i=0;i<finalArr.length;i++)
        	System.out.print(finalArr[i] + " ");
        //System.out.println();
	}
	}
}

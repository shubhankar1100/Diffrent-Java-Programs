package quickSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BirthdayPresentContingSort {
	public static void main(String[] args) throws IOException {
		/* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int N = Integer.parseInt(br.readLine());
	        int count =0;
	        String line = br.readLine();
	        String[] arr = line.split(" ");
	        
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        for(int i = 0;i<N;i++){
	        	arrList.add(Integer.parseInt(arr[i]));
	        }
Collections.sort(arrList);
for(int i=N;i>0;i--){
	count =count+i-1;
}
System.out.println(count);*/
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        String line = br.readLine();
	        String[] arr = line.split(" ");
     Set<Integer> set = new HashSet(N);
     for(int i = 0;i<N;i++){
     	set.add(Integer.parseInt(arr[i]));
     }

     N = set.size();
long c = (long)N*((N-1)/2);
System.out.println(c);

	}

}

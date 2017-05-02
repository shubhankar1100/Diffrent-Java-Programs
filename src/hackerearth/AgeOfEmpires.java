package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AgeOfEmpires {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
        int numberOfTC = Integer.parseInt(br.readLine());
        
        for(int i = 0;i<numberOfTC;i++){
        	int sumBob=0;
        	int sumAlice = 0;
        	int numberOfArmy = Integer.parseInt(br.readLine());
        	int[] arrBob = new int[numberOfArmy];
        	int[] arrAlice = new int[numberOfArmy];
        	for(int j=0;j<2;j++){
        		String line = br.readLine();
        		String[] array = line.split(" ");
        		for(int k=0;k<numberOfArmy;k++){
        			if(j==0){
        				int val = Integer.parseInt(array[k]);
        				arrBob[k] = val;
        			}else{
        				int val = Integer.parseInt(array[k]);
        				arrAlice[k] = val;
        			}
        		}
        		Arrays.sort(arrBob);
				sumBob = arrBob[numberOfArmy-1];
				Arrays.sort(arrAlice);
				sumAlice = arrAlice[numberOfArmy-1];
				
        	}
        	if(sumBob>sumAlice){
        		System.out.println("Bob");
        	}else if(sumAlice>sumBob){
        		System.out.println("Alice");
        	}else{
        		System.out.println("Tie");
        	}
        }

	}

}

package graphRepresentation;

import java.util.Scanner;

public class MonkGraphFactory {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
int[] arr = new int[N];
int sum = 0;
	        for (int i = 0; i < N; i++) {
	           arr[i] = s.nextInt();
	           sum += arr[i];
	        }
		
		
		if(2*(N	-1)==sum)
		{

		System.out.println("Yes");
		}
		else{

			System.out.println("Yes");
		}
	}

}

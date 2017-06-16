package code;

import java.io.IOException;
import java.util.Scanner;

public class bestPlayerBubbleSort {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
	
		String a1[] = new String[n];
		int[] a2= new int[n];
		for (int i = 0; i < n; i++) {
			a1[i]=sc.next();
			a2[i]=sc.nextInt();
		}
		for (int j = 0; j < a2.length; j++) {
			for (int i = 0; i < a2.length-1; i++) {
				
				if (a2[i]==a2[i+1] && a1[i].compareTo(a1[i+1])<0) {
					System.err.println(a1[i].compareTo(a1[i+1]));
					String temp1=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp1;
				}else if(a2[i]>a2[i+1]){
					int temp=a2[i];
					a2[i]=a2[i+1];
					a2[i+1]=temp;
					String temp1=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp1;
				}
			}
		}
		for (int i = a2.length-1; i>=a2.length-q; i--) {
			System.out.println(a1[i]);
		}
	}

}

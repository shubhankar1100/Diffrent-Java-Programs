package hackerearth;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTC = s.nextInt();

		for (int i = 0; i < numberOfTC; i++) {
			double result = 0;
			double d;
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int k = s.nextInt();
			
				c-=k;
				d = b * b - 4 * a * c;
				 if(d > 0)
			        {
			            result = Math.ceil(( - b + Math.sqrt(d))/(2*a));
			           // System.out.println("First root is:"+Math.ceil(result));
			            
			        }
			      System.out.println((int)result);

		}

	}
}

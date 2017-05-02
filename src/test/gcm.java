package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class gcm {


public static int summation(int i) {
    return (i * (i + 1)) / 2;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer T = scanner.nextInt();
    Integer[] array = new Integer[T];
    for (int i = 0; i < T; i++)
        array[i] = scanner.nextInt();
    for (Integer i : array) {
    	System.out.println(i);
    	System.out.println((1 + (8 * i)));
    	System.out.println(Math.sqrt((1 + (8 * i))));
    	System.out.println("root  " + (int)Math.sqrt((1 + (8 * i))));
        int temp = ((int) Math.ceil((Math.sqrt((1 + (8 * i))) - 1) / 2));
        System.out.println("temp = " + temp);
     /*   int summation = summation(temp);
        System.out.println("summation " + summation);
        while (summation % 2 != i % 2) {
            temp++;
            summation = summation + temp;
        }*/
        System.out.println( "number of steps " + temp);
    }
    scanner.close();
}
}
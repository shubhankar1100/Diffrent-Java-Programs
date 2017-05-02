package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumOfDigit {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTC = Integer.parseInt( br.readLine());
		for (int i = 0; i < numberOfTC; i++) {
			int numberOfInput = Integer.parseInt( br.readLine());
			BigInteger sum = new BigInteger("0");
			BigInteger result = new BigInteger("0");
			for (int j = 0; j <numberOfInput; j++) {
				String value = br.readLine();
				String[] arr = value.split(" ");
				BigInteger len = new BigInteger(arr[0]);
				
				BigInteger digit = new BigInteger(arr[1]);
				//BigInteger multiply = digit.multiply(len);
				sum = sum.add(digit.multiply(len));
			}
			BigInteger input = sum;
			result= sum;
			BigInteger nine = new BigInteger("9");
			BigInteger div = new BigInteger("10");
			while (nine.compareTo(input)==-1) {
				result = BigInteger.ZERO;
				while (!BigInteger.ZERO.equals(input)) {
					BigInteger rem;
					rem = input.mod(div);
					result = result.add(rem);
					input = input.divide(div);
				}
				input = result;
			}
			System.out.println(result);
		}	
	}}

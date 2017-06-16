package test;

public class SumOfTwoNumWithoutArithmatic {

	static int add(int x, int y){
		while(y!=0){
			int carry = x & y;
			System.err.println("carry " + carry);
			x = x^y;
			System.err.println("value of x " + x);
			y=carry <<1;
			System.err.println("value o f y " + y);
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(5,7));
	}

}

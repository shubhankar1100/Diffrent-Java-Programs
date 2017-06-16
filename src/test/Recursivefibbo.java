package test;

public class Recursivefibbo {
	
	
	public Recursivefibbo(){
		//super();
		
	}
static int fibbo(int num){
	if(num ==0)
		return 0;
	else if(num ==1)
		return 1;
	else
		return fibbo(num-1)+ fibbo(num-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibbo(5));
	}

}

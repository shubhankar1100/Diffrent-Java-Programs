package test;

public class RecursionFact {
static int fact(int num){
	System.out.println("method " + num);
	int result = 1;
	if(num==1)
		return 1;
	else 
	{
	 result = num * fact(num-1);
	 System.out.println("result " + result );
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(3));
	}

}

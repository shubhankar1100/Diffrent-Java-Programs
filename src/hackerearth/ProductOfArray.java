package hackerearth;

public class ProductOfArray {
	public static void main(String[] args) {
		int size= 5;
		int[] array = {1,2,3,4,10};
		long result =1;
		if(size>=1 && size<=1000){
		for(int i =0; i<size;i++){
			result = (long) ((result*array[i])%(Math.pow(10,9)+7));
		}
		System.out.println(result);
	}
	}

}

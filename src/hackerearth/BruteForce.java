package hackerearth;

public class BruteForce {

	public static void main(String[] args) {
		int size =1000;
		//int[] numb = new int[size];
		int[] numb = {1,2,88,42,22};
		
		for(int i=0;i<=size;i++){
			if(numb[i]==42){
				break;
			}else{
				System.out.println(numb[i]);
			}
		}
		
	}

}

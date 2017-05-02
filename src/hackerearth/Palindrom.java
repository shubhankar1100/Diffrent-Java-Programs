package hackerearth;

public class Palindrom {

	public static void main(String[] args) {
		String word = "raddar";
		int length  = word.length();
	/*	if(length >=1 && length <=100){
		boolean flag = false;
		for(int i=0;i< word.length()/2;i++){
		char left = word.charAt(i);
		
			char right = word.charAt(word.length()-(i+1));
		
			if(left == right){
				flag = true;
			}else{
				flag = false;
				break;
			}
		
		}
		if(flag){
		System.out.println("YES");}else{
			System.out.println("NO");
		}
	}
	=============================================================
	*/
		
		StringBuffer reverse = new StringBuffer(word);
		 reverse.reverse();
		 String a = reverse.toString();
		 System.out.println(reverse);
		if(a.equals(word)){
			
			System.out.println("YES");
		}else{
			System.out.println("NO");}
		
		
		
	}
}

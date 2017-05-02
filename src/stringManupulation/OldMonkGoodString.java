	package stringManupulation;

import java.util.Scanner;

public class OldMonkGoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String N = s.next();
        int count = 0;
        int finalVal = 0;
        boolean a = true;
        for(char ch: N.toCharArray()){
        	//System.err.println(ch);
        a=true;
		 switch(ch)
	     {
	          case 'a':
	        	  count++;
	        	 // System.err.println(count);
	        	  //System.out.println("eneter a");
	        	  break;
	          case 'e':
	        	  count++;
	        	  break;
	          case 'i':
	        	  count++;
	        	  break;
	          case 'o':
	        	  count++;
	        	  break;
	          case 'u':  
	        	  count++;
	        	  break;
	          default :
	        	  a=false;
	        	  //count = 0;
	        	  break;
	     }
		 if(count>finalVal){
			finalVal = count;
//			/System.out.println("final" + finalVal);
			//count =0;
		 }else if(!a){
			 count = 0;
		 }
        }
        System.out.println(finalVal);
	}

}

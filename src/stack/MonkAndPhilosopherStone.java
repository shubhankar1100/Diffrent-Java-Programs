package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MonkAndPhilosopherStone {


	   public static void main(String args[]) throws IOException{
		 //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String arrLen = br.readLine();
	        int N = Integer.parseInt(arrLen);
	        String line = br.readLine();
	        String[] arr= line.split(" ");
	        Stack<String> harry = new Stack<>();
	        Stack<Integer> monk = new Stack<>();
	        int count=0;
	        for(int i=N-1;i>=0;i--){
	        	harry.push(arr[i]);
	        }
	        String sum = br.readLine();
	        String[] sumAndVal= sum.split(" ");
	        
	        int pushPopCount = Integer.parseInt(sumAndVal[0]);
	        int sumValue = Integer.parseInt(sumAndVal[1]);
	        
	        for(int i=0;i<pushPopCount;i++){
	        	String val = br.readLine();
	        	if(val.equals("Harry") && sumValue != count){
	        		int k = Integer.parseInt(harry.pop());
	        		count +=k;
	        		monk.push(k);
	        	}else if(val.equals("Remove") && sumValue != count){
	        		int k = monk.pop();
	        		count -=k;
	        	}else if(sumValue == count){
	        		break;
	        	}
	        	
	        }
	        
	        if(sumValue == count){
	        System.out.println(monk.size());
	        }else{
	        	System.out.println("-1");
	        }
	}


}
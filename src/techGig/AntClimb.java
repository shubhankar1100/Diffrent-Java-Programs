package techGig;

import java.util.Scanner;

public class AntClimb {
	public static int GetJumpCount(int input1,int input2,int[] input3)
    {
	    int result =0;
	    for(int i = 0; i< input3.length;i++){
	    	int sum = 0;
	    	if(input1>=input3[i]){
	    		result++;
	    	}else{
	    		while(sum<input3[i]){
	    			sum +=(input1);
	    			if(sum>=input3[i]){
	    				result++;
	    				break;}
	    			else
	    				sum--;
	    			result++;
	    		}
	    	}
	    	
	    	
	    	
	    }
	    
	    return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        int ip3_size = 0;
	        ip3_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip3 = new int[ip3_size];
	        int ip3_item;
	        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
	            ip3_item = Integer.parseInt(in.nextLine().trim());
	            ip3[ip3_i] = ip3_item;
	        }
	        output = GetJumpCount(ip1,ip2,ip3);
	        System.out.println(String.valueOf(output));
	}

}

package test;

import java.util.Scanner;

public class Testint {

	public static void main(String []args){
	       
		 Scanner s=new Scanner(System.in);
		        
		int a[] = new int[5];
		        
		int target;
		        
		System.out.println("Enter the number of elemnts :");
		        
		for(int i=0;i<5;i++){
		            
		a[i] = s.nextInt();
		        
		}
		        
		System.out.println("Enter the target :");
		        
		target = s.nextInt();
		        
		for(int i=0;i<a.length;i++){
		           
		for(int j=0;j>i;j++){
		               
		if(i!=j  && a[i]+a[j]==target){
		                
		                    
		System.out.println(i);
		                    
		System.out.println(j);
		                
		            
		}
		        
		}
		     
		}
		            
		}


}

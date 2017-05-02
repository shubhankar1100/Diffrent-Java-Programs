package test;

import java.io.IOException;

public class Test2 {
	 void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		//}  
	//	class Testthrows4{  
		   public static void main(String args[])throws IOException{//declare exception  
			   Test2 m=new Test2();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		 }  
		}  
package test;

import java.util.HashSet;

public class Test {
	 Test() /* Line 3 */
	    {
	        System.out.println("adasdasdasdasd"); 
	    } 
	 Test(String a) /* Line 3 */
    {
		 super();
        System.out.println(a); 
    } 
    public static void main(String[] args) 
    { 
    	Test k = new Test();
    	for(int a = 0;a<3;a++){
    		System.out.println(a);
    	}
    } 

}

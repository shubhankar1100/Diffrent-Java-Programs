package test;

public class ToogleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		int l = 3;
		StringBuilder t=new StringBuilder();
		if(s.length()>=1 && s.length()<=100){
	for (int i = 0; i < s.length(); i++){
	    char m = s.charAt(i); 
	    //Process char
	    if(Character.isUpperCase(m))
        {
	    	
	    	t = t.append(Character.toLowerCase(m)); 
        }
        else if(Character.isLowerCase(m))
        {
        	t = t.append(Character.toUpperCase(m)); 
          
        }
	}
		}
	System.out.println(t);
	}
}

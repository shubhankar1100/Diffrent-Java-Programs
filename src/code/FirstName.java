package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTC = Integer.parseInt(br.readLine());
        for(int i = 0;i<numberOfTC;i++){
        	int suvoCount=0;
    		int suvojitCount=0;
        	String line = br.readLine();
        	final Pattern pattern = Pattern.compile("(SUVOJIT)");
            final Matcher match = pattern.matcher(line);
            while (match.find())
                suvojitCount++;
            
            final Pattern pattern1 = Pattern.compile("(SUVO)");
            final Matcher match1 = pattern1.matcher(line);
            while (match1.find())
                suvoCount++;
            
           suvoCount = suvoCount-suvojitCount;
            	if(suvoCount<0)
            		suvoCount = -(suvoCount);
          
            System.out.println("suvo = " + (suvoCount) + "suvojeet = " + suvojitCount);
        }

	}

}

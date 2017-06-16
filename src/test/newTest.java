package test;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Hex;

public class newTest {
	 public static byte[] to_byte(String[] strs) {
	        byte[] bytes=new byte[strs.length];
	        for (int i=0; i<strs.length; i++) {
	            bytes[i]=Byte.parseByte(strs[i]);
	        }
	        return bytes;
	    }


	    public static void main(String[] args) throws EncoderException {
	        String[] input = {"10","10","10","2"};
	        //Hex d = new Hex();
	        //String s = "10.10.10.2";//original data
	        byte[] byteArray = to_byte(input);
	        byte sd = 2;
	       //char[] a =    Hex.encodeHex(sd, true);//data to byte array
	     //  for(char i : a)
//System.out.println(i);
	    } 
}

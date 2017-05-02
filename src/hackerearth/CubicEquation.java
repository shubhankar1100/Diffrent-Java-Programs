package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

public class CubicEquation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTC = s.nextInt();
		String val = "0";
		for (int i = 0; i < noOfTC; i++) {
			val = "0";
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			long k = s.nextLong();
			val = bs(
					BigInteger.valueOf(a),BigInteger.valueOf(b),BigInteger.valueOf(c),BigInteger.valueOf(d),BigInteger.valueOf(k) );
			/*if (d <= k) {
				for (int j = 0; j < k; j++) {

					val = a * j * j * j + b * j * j + c * j + d;

					if (val >= k) {

						val = j - 1;
						break;
					}
				}
			}*/
			if(Integer.parseInt(val)<0){
				val="0";
			}
			System.out.println(val);
		}
	}

    static String bs(BigInteger a, BigInteger b, BigInteger c,BigInteger d, BigInteger k) {
        BigInteger lo = BigInteger.ZERO, hi = k,
                    mid, val=BigInteger.ZERO, ans = lo,
                    two = new BigInteger("2");
        
        while(lo.compareTo(hi) <= 0) {
            mid = hi.add(lo).divide(two);
           // System.err.println(mid);
            val = d.add(mid.multiply(mid).multiply(mid).multiply(a)).add(mid.multiply(mid).multiply(b).add(c.multiply(mid)));
            ans=mid;
           // System.out.println(val);
            if(val.compareTo(k) >= 0) {
                ans = mid;
                hi = mid.subtract(BigInteger.ONE);
            } else {
                lo = mid.add(BigInteger.ONE);
            }
        }
        
        if(val.compareTo(k)>0){
        	ans=ans.subtract(BigInteger.ONE);
        }
        return ans.toString();


    }

}

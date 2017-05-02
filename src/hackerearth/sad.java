package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
 
class sad {
public static void merge(int st, int mid, int end, Integer[]arr, Map<Integer, Integer> freq) {
 
        int p = st;
        int q = mid+1;
        int count=0;
        Integer[] newArr = new Integer[end-st+1];
        while(p<=mid && q <=end) {
            if(arr[p] <= arr[q]) { //actually for this question equal condition will never happen
                Integer val = freq.get(arr[p]);
                freq.put(arr[p], val + (q-mid-1) );
                newArr[count++] = arr[p++];
 
            } else {
                newArr[count++] = arr[q++];
            }
        }
        while(p<=mid) {
            int val = freq.get(arr[p]);
            freq.put(arr[p], val + (q-mid-1) );
            newArr[count++] = arr[p++];
        }
        while(q<=end) {
            newArr[count++] = arr[q++];
        }
        count=0;
//       now copy the values to the original array
        for(int i=st;i<=end;i++) {
            arr[i] = newArr[count++];
        }
    }
 
    public static void mergeSort(int st, int end, Integer[]arr, Map<Integer, Integer> freq) {
 
        if(st<end) {
            int mid = (st+end)/2;
            mergeSort(st, mid, arr, freq);
            mergeSort(mid+1, end, arr, freq);
            merge(st, mid, end, arr, freq);
        }
    }
 
    public static void main(String []args) throws Exception{
        PrintWriter out = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
 
        int t = in.readInt();
        for(int i=0;i<t;i++) {
            int n = in.readInt();
            Integer []arr = new Integer[n];
            Integer []copied = new Integer[n];
 
            Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
            for (int j=0;j<n;j++) {
                arr[j] = in.readInt();
                copied[j] = arr[j];
                freq.put(arr[j], 0);
            }
 
            mergeSort(0, n-1, arr, freq);
 
            for (int j=0;j<n;j++) {
                out.print(freq.get(copied[j]) + " ");
            }
            out.println();
        }
        out.flush();
        out.close();
    }
 
    static final class InputReader {
 
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        private int read() throws IOException {
            if (curChar >= numChars) {
                curChar = 0;
                numChars = stream.read(buf);
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
 
        public final int readInt() {
            return (int) readLong();
        }
 
        public final long readLong() {
            int c = 0;
            try {
                c = read();
            } catch (IOException ex) {
            }
            while (isSpaceChar(c)) {
                try {
                    c = read();
                } catch (IOException ex) {
                }
            }
            boolean negative = false;
            if (c == '-') {
                negative = true;
                try {
                    c = read();
                } catch (IOException ex) {
                }
            }
            long res = 0;
            do {
                if (c < '0' || c > '9');
                res *= 10;
                res += (c - '0');
                try {
                    c = read();
                } catch (IOException ex) {
                }
            } while (!isSpaceChar(c));
            return negative ? (-res) : (res);
        }
 
        public final String readString() {
            int c = 0;
            try {
                c = read();
            } catch (IOException ex) {
            }
            while (isSpaceChar(c)) {
                try {
                    c = read();
                } catch (IOException ex) {
                }
            }
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                try {
                    c = read();
                } catch (IOException ex) {
                }
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}

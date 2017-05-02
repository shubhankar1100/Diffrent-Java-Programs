package bitManupilation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MonkAndTask {

	public static void main(String[] args) throws IOException {
		FastReader fr=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t=fr.nextInt();
        while(t-->0){
            int n,i;
            n=fr.nextInt();
            
            long arr[][]=new long[n][2];
            for(i=0;i<n;i++){
              arr[i][0]=fr.nextLong();
              long temp=arr[i][0],count=0;
              System.err.println(temp);
              while(temp>0){
                  if((temp&1)==1)
                     count++;
                  temp=temp>>1;
                  System.out.println("temp   " + temp);
                   
              }
              System.out.println("jhjf " + count);
              arr[i][1]=count;
            }
            Arrays.sort(arr,new Comparator<long[]>(){
               public int compare(long a[],long b[]){
                   return (int)(a[1]-b[1]);
               }
                
            } 
            );
            for(i=0;i<n;i++)
              out.print(arr[i][0]+" ");
            out.println();
            out.flush();
        }
        out.close();
    }
}
 
 
 
 
 class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
	}

}

package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Pair {
	int x;
	int d;
	public Pair(int x1, int d1) {
		x=x1;
		d=d1;
	}
	
}

class sortPair implements Comparator<Pair>
{

	@Override
	public int compare(Pair p1, Pair p2) {
		if(p1.x<p2.x){
			return -1;
		
		}else 
			return 1;
			
	}
}
public class MissingSoildersMergeSort {

	public static void main(String[] args) throws IOException {
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int barrier=Integer.parseInt(br.readLine());
			ArrayList<Pair> list=new ArrayList<Pair>();
			for(int i=0;i<barrier;i++)
			{
				String[] temp=br.readLine().split(" ");
				list.add(new Pair(Integer.parseInt(temp[0]),Integer.parseInt(temp[2])));
			}
			Collections.sort(list,new sortPair());
			for(int i=0;i<barrier;i++)
				System.err.println(list.get(i).d);
			int max=list.get(0).x+list.get(0).d;
			int count=1+list.get(0).d;
			for(int i=1;i<barrier;i++)
			{
				if(list.get(i).x<=max)
				{
					if(list.get(i).x+list.get(i).d>max)
					{
						count=count+list.get(i).x+list.get(i).d-max;
						max=list.get(i).x+list.get(i).d;
					}
				}
				else
				{
					count=count+1+list.get(i).d;
				}
			}
			System.out.println(count);
	}
	}
}

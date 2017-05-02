package hackerearth;

public class Divisor {
	public static void main(String[] args) {
int i=200;
int r = 300;
int k=2;
int count = 0;

for(int j = i;j<=r;j++){
	if(j%k == 0){
		count++;
	}
}	
System.out.println(count);	
	}
}

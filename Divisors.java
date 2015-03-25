import java.io.*;
public class Divisors {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int t=Integer.parseInt(br.readLine());
		int pow=Integer.parseInt(br.readLine());
			int cnt=0;
			for(int i=0;i<=t;i++)
				cnt+=divisors(n+i,pow);
			System.out.println(cnt);
		}
	public static int divisors(long n,int pow){
	   long i=2;
	   int cnt=0;
	   while(i < (int)Math.sqrt(n))
		{
			if(n%i==0) {
				long t=(long)Math.pow(i,pow);
				if(n%t!=0)
					cnt++;
				t=(long)Math.pow((int)n/i,pow);
				if(n%t!=0)
					cnt++;	
			}
			i++;
		}
	   if(i*i == n){
		   long t=(long)Math.pow(i,pow);
				if(n%t!=0)
					cnt++;
	   }
			return cnt; 
	 }
}

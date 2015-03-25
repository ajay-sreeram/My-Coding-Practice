import java.io.*;
//import java.util.*;
public class SpojFactorial1{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int p=0;p<t;p++){
			int n=Integer.parseInt(br.readLine());
			int cnt=0;
			for(int i=5;i<=n;i*=5)
				cnt+=n/i;
			System.out.println(cnt);
		}
	}
}
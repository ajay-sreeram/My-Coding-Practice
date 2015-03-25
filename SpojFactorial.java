//import java.util.*;
import java.io.*;
public class SpojFactorial{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line);
			int cnt=0;
			for(i=5;i<n;i*=5)
				cnt+=n/i;
			System.out.pritnln(cnt);
		}
	}
}
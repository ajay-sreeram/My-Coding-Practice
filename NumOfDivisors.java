import java.io.*;
public class NumOfDivisors {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line);
			for(int i=1;i<=n;i++){
				int t=div(i);
				if(t%2!=0)
				System.out.println(""+i+" : "+t);
			}
		}
	}
	public static  int div(int n){
		int cnt=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				cnt++;
		}
		return cnt;
	}
}

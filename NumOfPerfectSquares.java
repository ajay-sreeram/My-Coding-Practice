import java.io.*;
public class NumOfPerfectSquares {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String tarr[]=br.readLine().split(" ");
		
			long min=Long.parseLong(tarr[0]);
			long max=Long.parseLong(tarr[1]);
			long s=(long)(Math.ceil(Math.sqrt(min)));
			long e=(long)Math.sqrt(max);
			System.out.println(e-s+1);
		}
	}
	
}

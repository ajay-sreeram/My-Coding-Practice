import java.io.*;
public class Codenigma5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			String tarr[]=br.readLine().trim().split(" ");
			int n=Integer.parseInt(tarr[0]);
			int m=Integer.parseInt(tarr[1]);
			
			if(Math.pow(2,m)-1>n)
				System.out.println("-1");
			else{
				System.out.println(Math.pow(2,m)-1);
			}
		}
	}
	public static int binarysum(int i){
	 i = i - ((i >> 1) & 0x55555555);
     i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
     return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;
	}
}

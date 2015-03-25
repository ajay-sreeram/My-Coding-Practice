import java.io.*;
import java.util.*;
class HackerRankConnectingTowns {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String tarr[]=buffer.readLine().trim().split(" ");
			int sum=1;
			for(int i=0;i<tarr.length;i++)
				sum=(sum*Integer.parseInt(tarr[i]))%1234567;
			System.out.println(sum);
		}
	}
}
import java.io.*;
//import java.util.*;
public class CodeEvalMinimumCoins{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			int n=Integer.parseInt(line);
			int cnt=0;
			cnt=n/5;
			int rem=n%5;
			if(rem>=3){
				cnt++;
				rem-=3;
			}
			while(rem!=0){
				cnt++;
				rem--;
			}
			System.out.println(cnt);
		}
	}
}
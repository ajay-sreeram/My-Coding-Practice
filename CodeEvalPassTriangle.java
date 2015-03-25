import java.io.*;
import java.util.*;
public class CodeEvalPassTriangle{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i=0;
		long sum=(long)Integer.parseInt(br.readLine().trim());
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String arr[]=line.trim().split(" ");
			int p=Integer.parseInt(arr[i]);
			int q=Integer.parseInt(arr[i+1]);
			if(p>q){
				sum=sum+(long)p;
			}
			else{
				sum=sum+(long)q;
				i++;
			}
		}
		System.out.println(sum);
	}
}
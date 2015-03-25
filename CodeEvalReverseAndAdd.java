import java.io.*;
//import java.util.*;
public class CodeEvalReverseAndAdd{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			long n=Long.parseLong(line);
			//System.out.println("BEFORE");
			fun(n,0);
			//System.out.println("AFTER");
		}
	}
	public static void fun(long n,int cnt){
		try{
		String st=new String(""+n);
		if(cnt>=100||st.equals(new StringBuilder(st).reverse().toString())){
			System.out.println(cnt+" "+n);
			return;
		}
		long sum=n+Long.parseLong(new StringBuilder(st).reverse().toString());
		fun(sum,cnt+1);
		}
		catch(NumberFormatException e){
			System.out.println("error:"+cnt);
		}
	}
}
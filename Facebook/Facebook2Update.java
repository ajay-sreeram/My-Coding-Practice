import java.io.*;
import java.util.*;
public class Facebook2Update {
	public static int n,sump,sumc,sumf;
	public static boolean check;
	public static void main (String[] args) throws IOException {
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader buffer=new BufferedReader(new FileReader("input.in"));
		PrintWriter out=new PrintWriter("output.out");
		String line=buffer.readLine();
		int cntr=1;
		while((line=buffer.readLine())!=null){
			String tmparr[]=line.split(" ");
			sump=Integer.parseInt(tmparr[0]);
			sumc=Integer.parseInt(tmparr[1]);
			sumf=Integer.parseInt(tmparr[2]);
			n=Integer.parseInt(buffer.readLine().trim());
			check=true;
			int parr[]=new int[n];
			int carr[]=new int[n];
			int farr[]=new int[n];
			for(int i=0;i<n;i++){
				tmparr=buffer.readLine().trim().split(" ");
				parr[i]=Integer.parseInt(tmparr[0]);
				carr[i]=Integer.parseInt(tmparr[1]);
				farr[i]=Integer.parseInt(tmparr[2]);
			}
			fun(n,parr,carr,farr);
			if(check==false)
				//System.out.println("Yes");
				out.println("Case #"+(cntr)+": yes");
			else
				//System.out.println("No");
				out.println("Case #"+(cntr)+": no");
			cntr++;
		}
		out.close();
	}
	public static void fun(int n,int parr[],int carr[],int farr[]){
		if(check){
			if(n<1)
				{
					if(sump==0&&sumc==0&&sumf==0)
						{check=false;}
				}
			else
			{
				sump-=parr[n-1];
				sumc-=carr[n-1];
				sumf-=farr[n-1];
				fun(n-1,parr,carr,farr);
				sump+=parr[n-1];
				sumc+=carr[n-1];
				sumf+=farr[n-1];
				fun(n-1,parr,carr,farr);
			}
		}
	}
}
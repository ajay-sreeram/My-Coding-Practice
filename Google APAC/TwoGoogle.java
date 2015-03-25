import java.util.*;
import java.io.*;

public class TwoGoogle{
public static void main(String args[])throws IOException{
	//Scanner in=new Scanner(System.in);
	BufferedReader in=new BufferedReader(new FileReader("input.in"));
	PrintWriter out=new PrintWriter("output.out");
	int t=Integer.parseInt(in.readLine());
	int a,i,j,n,tmp;
	int arr[][];
	String temp[];
	int s[];
	int e[];
	int c;
	int m,cnt;
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.readLine());
		s=new int[n];
		e=new int[n];
		temp=in.readLine().split(" ");
		for(i=0,j=0;i<n;i++)
		{
			s[i]=Integer.parseInt(temp[j++]);
			e[i]=Integer.parseInt(temp[j++]);
		}
		m=Integer.parseInt(in.readLine());
		//System.out.print("Case #"+(a+1)+":");
		out.print("Case #"+(a+1)+":");
			
		for(i=0;i<m;i++)
		{
			c=Integer.parseInt(in.readLine());
			cnt=0;
			for(j=0;j<n;j++)
				if(c>=s[j]&&c<=e[j])
					cnt++;
			//System.out.print(" "+cnt);
			out.print(" "+cnt);
		}
		out.println();
		String xyz=in.readLine();
		//System.out.println();
	}
	out.close();
	
}
}
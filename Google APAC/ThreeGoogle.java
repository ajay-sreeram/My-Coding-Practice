import java.util.*;
import java.io.*;
public class ThreeGoogle{
public static void main(String args[])throws IOException{
	//Scanner in=new Scanner(System.in);
	BufferedReader in=new BufferedReader(new FileReader("input.in"));
	PrintWriter out=new PrintWriter("output.out");
	int t=Integer.parseInt(in.readLine().trim());
	int a,i,j,n;
	String s[];
	String d[];
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.readLine().trim());
		s=new String[n];
		d=new String[n];
		for(i=0;i<n;i++)
		{
			s[i]=in.readLine().trim();
			d[i]=in.readLine().trim();
		}
		String start="";
		
		for(i=0;i<n;i++)
		{
			boolean check=true;
			for(j=0;j<n;j++)
				if(s[i].equals(d[j]))
				{check=false;break;}
			if(check)
			{
			start=s[i];
			break;
			}
		}
		String from=start;
		String to="";
		out.print("Case #"+(a+1)+":");
		while(true){
		boolean check=false;

		for(i=0;i<n;i++)
			if(from.equals(s[i]))
				{check=true;to=d[i];break;}
		
		if(check==false)
			break;
		out.print(" "+from+"-"+to);
		from=to;
		}
		out.println();
	}
	out.close();
}
}
		
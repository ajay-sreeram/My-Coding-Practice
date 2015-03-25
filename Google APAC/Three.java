import java.util.*;
public class Three{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int t=Integer.parseInt(in.nextLine());
	int a,i,j,n;
	String s[];
	String d[];
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.nextLine());
		s=new String[n];
		d=new String[n];
		for(i=0;i<n;i++)
		{
			s[i]=in.nextLine();
			d[i]=in.nextLine();
		}
		String start="";
		
		for(i=0;i<n;i++)
		{
			boolean check=true;
			for(j=0;j<n;j++)
				if(s[i].equals(d[i]))
				{check=false;break;}
			if(check)
			{
			start=s[i];
			break;
			}
		}
		String from=start;
		String to="";
		System.out.print("Case #"+(a+1)+":");
		while(true){
		boolean check=false;
		for(i=0;i<n;i++)
			if(from.equals(s[i]))
				{check=true;to=d[i];from=to;break;}
		if(check==false)
			break;
		System.out.print(" "+from+"-"+to);
		}
		System.out.println();
	}
}
}
		
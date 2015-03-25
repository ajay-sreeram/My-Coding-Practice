import java.util.*;
public class Two{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int t=Integer.parseInt(in.nextLine());
	int a,i,j,n,tmp;
	int arr[][];
	String temp[];
	int s[];
	int e[];
	int c;
	int m,cnt;
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.nextLine());
		s=new int[n];
		e=new int[n];
		temp=in.nextLine().split(" ");
		for(i=0,j=0;i<n;i++)
		{
			s[i]=Integer.parseInt(temp[j++]);
			e[i]=Integer.parseInt(temp[j++]);
		}
		m=Integer.parseInt(in.nextLine());
		for(i=0;i<m;i++)
		{
			System.out.print("Case #"+(a+1)+":");
			c=Integer.parseInt(in.nextLine());
			cnt=0;
			for(j=0;j<n;j++)
				if(c>=s[j]&&c<=e[j])
					cnt++;
			System.out.print(" "+cnt);
		}
		System.out.println();
	}
	
}
}
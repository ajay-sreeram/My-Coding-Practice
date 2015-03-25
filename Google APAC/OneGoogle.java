import java.util.*;
import java.io.*;
public class OneGoogle{
public static void main(String args[])throws IOException{
	//Scanner in=new Scanner(System.in);
	BufferedReader in=new BufferedReader(new FileReader("input.in"));
	PrintWriter out=new PrintWriter("output.out");
	int t=Integer.parseInt(in.readLine());
	int a,i,j,n;
	long tmp;
	int arr[][];
	String temp[];
	String xyz=in.readLine().trim();
	for(a=0;a<t;a++)
	{
		n=Integer.parseInt(in.readLine());
		arr=new int[n+2][n+2];
		for(i=1;i<=n;i++){
			temp=in.readLine().split(" ");
			for(j=0;j<temp.length;j++)
				arr[i][j+1]=Integer.parseInt(temp[j]);
		}
		long maxcnt=0L;
		int val=Integer.MAX_VALUE;
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				{
					tmp=check(arr,i,j)+1;
					if(tmp>=maxcnt)
					{
						if(tmp==maxcnt)
						{	
							if(arr[i][j]<val)
								val=arr[i][j];
						}
						else
						val=arr[i][j];
						maxcnt=tmp;
					}
				}
		System.out.println("Case #"+(a+1)+": "+val+" "+maxcnt);
		out.println("Case #"+(a+1)+": "+val+" "+maxcnt);
	}
	out.close();
}

public static long check(int arr[][],int i,int j){

if(arr[i-1][j]-arr[i][j]==1)
	return 1+check(arr,i-1,j);
if(arr[i+1][j]-arr[i][j]==1)
	return 1+check(arr,i+1,j);
if(arr[i][j-1]-arr[i][j]==1)
	return 1+check(arr,i,j-1);
if(arr[i][j+1]-arr[i][j]==1)
	return 1+check(arr,i,j+1);
return 0;
}

}
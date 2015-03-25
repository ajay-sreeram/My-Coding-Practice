import java.io.*;
public class Sreeram1temp{
public static int n;
public static void main(String args[])throws java.lang.Throwable{
//Scanner in=new Scanner(new FileReader("A-small-attempt0.in"));
BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
int t=Integer.parseInt(in.readLine());
System.out.println(t);
for(int z=1;z<=t;z++){
	n=Integer.parseInt(in.readLine());
	int i,j,cnt=0;
	char arr[][]=new char[n][n];
	char temp[];
	boolean visit[][]=new boolean[n][n];
	for(i=0;i<n;i++)
	{
		temp=in.readLine().toCharArray();
		for(j=0;j<n;j++)
			{
				arr[i][j]=temp[j];
				if(arr[i][j]=='*')
					visit[i][j]=true;
			}
	}
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			if(!visit[i][j]&&check(arr,i,j))
			{fun(arr,visit,i,j);	cnt++;}
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			if(!visit[i][j])
				cnt++;
	System.out.println("case #"+z+": "+cnt);;
	}
}
public static boolean check(char arr[][],int x,int y){
int p[]={-1,-1,-1,0,0,1,1,1};
int q[]={-1,0,1,-1,1,-1,0,1};
int a,b;
for(int i=0;i<8;i++)
	{
		a=x+p[i];b=y+q[i];
		if(a>=0&&a<n&&b>=0&&b<n)
			if(arr[a][b]=='*')
				return false;
	}
return true;
}
public static void fun(char arr[][],boolean visit[][],int x,int y){
visit[x][y]=true;
int p[]={-1,-1,-1,0,0,1,1,1};
int q[]={-1,0,1,-1,1,-1,0,1};
int a,b;
for(int i=0;i<8;i++)
	{
		a=x+p[i];b=y+q[i];
		if(a>=0&&a<n&&b>=0&&b<n)
		{	
			if(!visit[a][b]&&check(arr,a,b))
				fun(arr,visit,a,b);
			else
				visit[a][b]=true;
		}
	}
}
}
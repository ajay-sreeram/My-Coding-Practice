import java.io.*;
public class Solution2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String temp=br.readLine();
String tarr[];
tarr=temp.split(" ");
int n,m;
n=Integer.parseInt(tarr[0]);
m=Integer.parseInt(tarr[1]);
if(n>=3&&m>=1)
{
int arr[]=new int[n];
int i,a,b,r,k;
for(i=0;i<n;i++)
arr[i]=0;
for(int p=0;p<m;p++)
{
temp=br.readLine();
tarr=temp.split(" ");
a=Integer.parseInt(tarr[0]);
b=Integer.parseInt(tarr[1]);
k=Integer.parseInt(tarr[2]);
//if(a>0&&b>0&&a<=b&&b<=n&&k>=0)
for(i=a-1;i<b;i++)
arr[i]+=k;
}
int max=-1;
for(i=0;i<n;i++)
if(arr[i]>max)
max=arr[i];
System.out.println(max);
}
}
}

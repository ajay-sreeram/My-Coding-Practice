import java.io.*;
public class Solution1
{
public static void main(String args[])throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n,count=0;
    char ch;
    n=Integer.parseInt(br.readLine());
String st=br.readLine();   
String starr[]=st.split(" ");
int arr[]=new int[n];
for(i=0;i<n;i++)
arr[i]=Integer.parseInt(starr[i]);
int j,k,sum=0;
int pos=min(arr);
int temp=n;
for(count=1;count<=n;count++,pos++)
{
 if(pos==n)
 pos=0;
 
 sum+=arr[pos]*count;
 }
 
System.out.println(sum);
}

public static int min(int arr[])
{
int minn=arr[0];
int pos=0;
for(int i=0;i<arr.length;i++)
if(arr[i]<minn)
{minn=arr[i];pos=i;}
return pos;
}
}

import java.io.*;
public class Solution7
{
public static void main(String args[])throws IOException
    {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String temp;
String tarr[]=new String[2];
temp=br.readLine();
tarr=temp.split(" ");
int n,q,q1;
n=Integer.parseInt(tarr[0]);
q=Integer.parseInt(tarr[1]);
int arr[]=new int[n];
 int arr1[]=new int[n];
 int res[]=new int[q];
 int i=0,j=1,diff;
 tarr=new String[n];
 temp=br.readLine();
 tarr=temp.split(" ");
 for(i=0;i<n;i++)
 arr[i]=Integer.parseInt(tarr[i]);
for(int k=0;k<q;k++)
{
 q1=Integer.parseInt(br.readLine());
 for(i=0;i<n;i++)
 arr1[i]=arr[i]+q1;
 i=0;j=1;
 if(n!=1)
 label:
 while(true)
 {
 if(check(arr))
 break label;
 if(arr1[i]==arr1[j])
 {
 i++;j++;
 if(j==n)
 {break;}
 }
 else
 {
  diff=Math.abs(arr1[i]-arr1[j]);
  if(arr1[i]>arr1[j])
  arr1[i]=diff;
  else
  arr1[j]=diff;
 }
 }
res[k]=arr1[0];
 }
for(i=0;i<q;i++)
System.out.println(res[i]);
}
public static boolean check(int arr[])
{
 for(int i=0,j=1;j<arr.length;i++,j++)
 if(arr[i]!=arr[j])
 return false;
 return true;
}

}
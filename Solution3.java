import java.io.*;
public class Solution3
{
public static void main(String args[])throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n,count=0;
    char ch;
    n=Integer.parseInt(br.readLine());
    String arr[]=new String[n];
    for(i=0;i<n;i++)
        arr[i]=br.readLine();
    int j,k,temp;
  String st="";
   for(ch='a';ch<='z';ch++)
  {
    count=0;
	for(i=0;i<n;i++)
	if(arr[i].indexOf(""+ch)!=-1)
	count++;
	if(count==n)
	st+=""+ch;
   }
   count=0;
   int cnt[]=new int[n];
   for(i=0;i<st.length();i++)
   {
    ch=st.charAt(i);
	for(j=0;j<n;j++)
	cnt[j]=0;
	for(j=0;j<n;j++)
	{
	  for(k=0;k<arr[j].length();k++)
	  if(arr[j].charAt(k)==ch)
	  cnt[j]++;
	}
	count+=min(cnt);
   }
	
	System.out.println(count);
    
}

public static int min(int arr[])
{
int min=101;
for(int i=0;i<arr.length;i++)
if(arr[i]<min)
min=arr[i];
return min;
}

}
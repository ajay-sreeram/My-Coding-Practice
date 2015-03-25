import java.io.*;
public class Solution4
{
public static void main(String args[])throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,n,count=0;
    char ch;
    n=Integer.parseInt(br.readLine());
    String res[]=new String[n];
	String st1,st2;
	for(int a=0;a<n;a++)
	{
	st1=br.readLine();
	st2=br.readLine();
	res[a]="";
	for(i=0,j=0;i<st1.length()&&j<st2.length();)
	{
	if(st1.charAt(i)<st2.charAt(j))
	{res[a]+=""+st1.charAt(i);i++;}
	else
	{res[a]+=""+st2.charAt(j);j++;}
	}
	if(i==st1.length())
	for(;j<st2.length();j++)
	res[a]+=""+st2.charAt(j);
	else
	for(;i<st1.length();i++)
	res[a]+=""+st1.charAt(i);
	
	}
	for(i=0;i<n;i++)
  System.out.println(res[i]);
	String small,temp;
	for(i=0;i<n;i++)
	{
	 temp=res[i];
	 small=res[i];
	 for(j=0;j<res[i].length();j++)
	 {
	  temp=temp.substring(1,temp.length())+temp.charAt(0);
	  if(temp.compareTo(small)<0)
	  //String.strcpy(small,temp);
	 small=temp;
	 }
	 //String.strcpy(res[i],small);
	 res[i]=small;
	 }
	  
	for(i=0;i<n;i++)
  System.out.println(res[i]);
	
	}
	}
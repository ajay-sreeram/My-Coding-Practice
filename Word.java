import java.io.*;
public class Word
{
static int n;
static int total;
public static void main(String args[])
{
int i,j,k;
String arr[]=new String[4];
arr[0]="abcd";
arr[1]="efgh";
arr[2]="ijkl";
arr[3]="mnop";
String st;
n=4;
total=0;
int count=13;
st="";
//for(count=2;count<=n*n;count++)
for(i=0;i<n;i++)
for(j=0;j<n;j++)
k=rec(arr,i,j,st,count);

System.out.println("\n total:"+total);

}


public static int check(String st,char p)
{
for(int i=0;i<st.length();i++)
if(st.charAt(i)==p)
return 1;
return 0;
}

public static int rec(String arr[] , int i , int j , String st , int len)
{ 
if(st.length()==len)
{
System.out.print(st+"  ");
st="";
total++;
return 1;
}
else if(check(st,arr[i].charAt(j))==0)
{
	st+=arr[i].charAt(j);
	if(i-1>=0&&j-1>=0)
	if(rec(arr,i-1,j-1,st,len)!=0)
	return 0;
	if(i-1>=0)
	if(rec(arr,i-1,j,st,len)!=0)
	return 0;
	if(i-1>=0&&j+1<n)
	if(rec(arr,i-1,j+1,st,len)!=0)
	return 0;
	if(j+1<n)
	if(rec(arr,i,j+1,st,len)!=0)
	return 0;
	if(i+1<n&&j+1<n)
	if(rec(arr,i+1,j+1,st,len)!=0)
	return 0;
	if(i+1<n)
	if(rec(arr,i+1,j,st,len)!=0)
	return 0;
	if(i+1<n&&j-1>=0)
	if(rec(arr,i+1,j-1,st,len)!=0)
	return 0;
	if(j-1>=0)
	if(rec(arr,i,j-1,st,len)!=0)
	return 0;
}
return 0;
}

}
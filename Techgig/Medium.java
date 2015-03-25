import java.io.*;
public class Medium
{
static int n;
static int total;
static int p,q;
public static void main(String args[])
{
int i,j,k;
p=input1[0];
q=input1[1];

//int input2[]={1,3,0,0,0,0,0,0,4,5,1,0,0,0,0,6,7,6,0,0,0,0,5,0};
String arr[]=new String[p];
for(i=0;i<p;i++)
arr[i]="";
int cnt;
for(i=0,cnt=0;i<p;i++)
for(j=0;j<q;j++,cnt++)
arr[i]+=""+input2[cnt];
//for(i=0;i<p;i++)
//System.out.println(arr[i]);

String st;
n=4;
total=0;
int count=3;
st="";
rec(arr,0,0,st,0);
System.out.println("total:"+total);

}



public static int rec(String arr[] , int i , int j , String st , int len)
{ 
if(i==p-1&&j==q-1)
{
//System.out.println("result"+st+"\n  ");
st="";
total++;
return 1;
}
else
{
	st+=""+arr[i].charAt(j);
//	System.out.println(st+" i:"+i+" j:"+j);
	switch(arr[i].charAt(j))
	{
	case '0':break;
	case '1':	
		if(j+1<q)
		if(rec(arr,i,j+1,st,len)!=0)	
		return 0;
		break;
	case '2':
		if(i+1<p)
		if(rec(arr,i+1,j,st,len)!=0)
		return 0;
		break;
	case '3':
		if(i+1<p&&j+1<q)
		if(rec(arr,i+1,j+1,st,len)!=0)
		return 0;
		break;
	case '4':
		if(j+1<q)
		if(rec(arr,i,j+1,st,len)!=0)
		return 0;
		if(i+1<p)
		if(rec(arr,i+1,j,st,len)!=0)
		return 0;
		break;	
	case '5':	
		if(j+1<q)
		if(rec(arr,i,j+1,st,len)!=0)
		return 0;
		if(i+1<p&&j+1<q)
		if(rec(arr,i+1,j+1,st,len)!=0)
		return 0;
		break;
	case '6':	
		if(i+1<p&&j+1<q)
		if(rec(arr,i+1,j+1,st,len)!=0)
		return 0;
		if(i+1<p)
		if(rec(arr,i+1,j,st,len)!=0)
		return 0;
		break;
	case '7':
		if(i+1<p)
		if(rec(arr,i+1,j,st,len)!=0)
		return 0;
		if(j+1<q)
		if(rec(arr,i,j+1,st,len)!=0)
		return 0;
		if(i+1<p&&j+1<q)
		if(rec(arr,i+1,j+1,st,len)!=0)
		return 0;
		break;
	}

}
return 0;
}

}
//import java.io.*;
//import java.util.*;
public class Solution4{
static char arr[][];
public static void main(String args[])
{
int n,i,j;
java.util.Scanner in=new java.util.Scanner(System.in);

n=Integer.parseInt(in.nextLine());
arr=new char[n][];
String st[];
for(i=0;i<n;i++)
{
arr[i]=new char[n];
st=in.nextLine().trim().split(" ");
for(j=0;j<n;j++)
arr[i][j]=st[j].charAt(0);
}
int t=Integer.parseInt(in.nextLine());
int cases[][]=new int[t][];
for(i=0;i<t;i++)
{
cases[i]=new int[2];
st=in.nextLine().split(" ");
cases[i][0]=Integer.parseInt(st[0])-1;
cases[i][1]=Integer.parseInt(st[1])-1;
}
i=0;j=1;
boolean bool=true;
java.util.List lst=new java.util.ArrayList();
b:
for(i=0;i<t;i++)
	for(j=i+1;j<t;j++)
	{
		
		if(check(lst,cases[i][0],cases[i][1],cases[j][0],cases[j][1])!=1)
			{
		//	System.out.println(cases[i][0]+" "+cases[i][1]+":"+cases[j][0]+" "+cases[j][1]);
		//	System.out.println(lst);
			System.out.println("No");
			bool=false;
			break b;
			}
			lst.clear();
	}
if(bool)
	System.out.println("Yes");

		

}

public static int check(java.util.List lst,int si,int sj,int di,int dj)
{
//System.out.println("si:"+si+"sj:"+sj+" di:"+di+"dj:"+dj);
if(si==di&&sj==dj)
return 1;
lst.add(si+":"+sj);
if(si-1>=0&&arr[si-1][sj]!='X')
{
	if(!lst.contains((si-1)+":"+sj))
	{//lst.add((si-1)+":"+sj);
	//lst.add(si+":"+sj);
	if( check(lst,si-1,sj,di,dj) == 1)
		return 1;
	//lst.remove((si-1)+":"+sj);
	//lst.remove(si+":"+sj);
	}
}

if(sj-1>=0&&arr[si][sj-1]!='X')
{
	if(!lst.contains(si+":"+(sj-1)))
	{
	//lst.add(si+":"+(sj-1));
	//lst.add(si+":"+sj);
	if(  check(lst,si,sj-1,di,dj) ==1 )
		return 1;
	//lst.remove(si+":"+(sj-1));
	//lst.remove(si+":"+sj);
	}
	
}
//System.out.println("hello");
if(si+1<arr.length&&arr[si+1][sj]!='X')
{
	if(!lst.contains((si+1)+":"+sj))
	{
	//lst.add((si+1)+":"+sj);
	//lst.add(si+":"+sj);
	if( check(lst,si+1,sj,di,dj) ==1)
		return 1;
	//lst.remove((si+1)+":"+sj);
	//lst.remove(si+":"+sj);
	}
	
}

if(sj+1<arr.length&&arr[si][sj+1]!='X')
{
	if(!lst.contains(lst.contains(si+":"+(sj+1))))
	{
	//lst.add(si+":"+(sj+1));
	//lst.add(si+":"+sj);
	 if( check(lst,si,sj+1,di,dj)==1)
		return 1;
	//lst.remove(si+":"+(sj+1));
	//lst.remove(si+":"+sj);
	}
}
//if(lst.contains(si+":"+sj))
lst.remove(si+":"+sj);
//lst.clear();
return 4;

}

}
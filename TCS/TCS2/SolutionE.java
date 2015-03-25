import java.util.*;
class Node{
public int val;
public List<Integer> arr;
public Node(int v){
val=v;
arr=new ArrayList<Integer>();
}
}

public class SolutionE{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String st[]=sc.nextLine().split(" ");
int n=Integer.parseInt(st[0]);
int t=Integer.parseInt(st[1]);
int n1,n2,i,j,k;
List<Integer> l1=new ArrayList<Integer>();
List<Integer> l2=new ArrayList<Integer>();
String tmp,temp;
for(i=0;i<t;i++)
{
temp="";
st=sc.nextLine().split(" ");
n1=Integer.parseInt(st[0]);
n2=Integer.parseInt(st[1]);
if(n1<n2)
{l1.add(i,n1);l2.add(i,n2);}
else
{l1.add(i,n2);l2.add(i,n1);}
}
Node mainarr[]=new Node[n+1];
Object o1[],o2[];
Integer l1arr[],l2arr[];
l1arr=new Integer[t];
l2arr=new Integer[t];
o1=l1.toArray();
o2=l2.toArray();
for(i=0;i<t;i++)
{
l1arr=<Integer>o1;
l2arr=<Integer>o2;
}
int tempp;
for(i=1;i<=n;i++)
{
int occurrences = Collections.frequency(l1,new Integer(i))+Collections.frequency(l2,new Integer(i));
mainarr[i]=new Node(i);
	for(j=0;j<t;j++)
	{
		if(l1arr[j]==i)
		{
			tempp=l2arr[j];
			if(!mainarr[i].arr.contains(tempp))
				mainarr[i].arr.add(tempp)
		}
		if(l2arr[j]==i)
		{
			tempp=l1arr[j];
			if(!mainarr[i].arr.contains(tempp))
				mainarr[i].arr.add(tempp)
		}
	}
}
int q=Integer.parseInt(in.nextLine());
String ar[]=in.nextLine().toString().split(" ");
Node result[]=new Node[q];
for(i=0;i<q;i++)
{
int tmp=Integer.parseInt(ar[i]);
result[i]=new Node(tmp);
//--------
}

}
}

/*
for input 
5 4
1 2
2 3
2 4
4 5
2
1 2
we get
1      2       3        4     5
|      |       |        |     |
|      |       |        |     |
2    1,3,4     2        5     4

i did upto this

now we have to consider '1' and do recursion to find it dependencies until no dependency is found
do the same for '2' 

Given 1,2
so for 1 we get -> 2,3,4,5
for 2 we get -> 3,4,5

their intersection is 3,4,5
*/




*/

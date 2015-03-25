import java.util.*;
public class SolutionA
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int i,j,k,n=Integer.parseInt(sc.nextLine());
String from,to,tmp;
for(i=0;i<n;i++){
char[] chars=sc.nextLine().toCharArray();
java.util.Arrays.sort(chars);
from=new String(chars);
tmp="";
to="";
for(j=0;j<from.length();j++)
{
 char c=from.charAt(j);
 if(tmp.indexOf(c)==-1)
 tmp+=""+c;
}

for(j=0;j<tmp.length();j++)
{
	char c=tmp.charAt(j);
	int num=(int)c-96;
	for(k=0;k<num;k++)
	to+=""+c;
}


System.out.println(fun(from,to));
}
}


public static int fun(String s1,String s2){
int cost=0;
char s1arr[],s2arr[];
s1arr=s1.toCharArray();
s2arr=s2.toCharArray();
int left,top,corner;
int m=s1.length()+1;
int n=s2.length()+1;
int i,j;

int t[][]=new int[m][];
for(i=0;i<m;i++)
{
 t[i]=new int[n];
  for(j=0;j<n;j++)
    t[i][j]=-1;
}

for(i=0;i<m;i++)
	t[i][0]=i;
for(i=0;i<n;i++)
	t[0][i]=i;
for(i=1;i<m;i++)
{
	for(j=1;j<n;j++)
	{
	left=t[i][j-1];
    left+=3;
	top=t[i-1][j];
    top+=2;
	
    corner=t[i-1][j-1];
	
    if(s1arr[i-1]!=s2arr[j-1])
		corner+=1;
    t[i][j]=Math.min(left,Math.min(top,corner));
	
    }
}
cost=t[m-1][n-1];
return cost;
}



}
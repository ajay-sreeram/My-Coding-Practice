import java.util.*;
public class SolutionA1{
public static void main(String args[]){
System.out.println(""+fun("aabbbc","abbccc"));
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
	if(s1arr[i-1]!=s1arr[j-1])
		corner+=1;
	t[i][j]=Math.min(left,Math.min(top,corner));
	}
}

for(i=0;i<m;i++)
 {
     for(j=0;j<n;j++)
        System.out.print(" "+t[i][j]);
    System.out.println();
}




cost=t[m-1][n-1];
return cost;
}

}
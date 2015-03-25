public class Greedy{
public static void main(String args[]){
int s[]=new int[]{1, 3, 0, 5, 8, 5};
int f[]=new int[]{2, 4, 6, 7, 9, 9};
int n=s.length;
printactivities(s,f,n);
}

public static void printactivities(int s[],int f[],int n){
int j,i=0;
System.out.print(" "+i);
for(j=1;j<n;j++)
{
	if(s[j]>f[i])
	{
		System.out.print(" "+j);
		i=j;
	}
}

}

}
import java.math.BigInteger;
import java.util.Scanner;
public class Solution5{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
n=Integer.parseInt(in.nextLine());
String tarr[]=in.nextLine().split(" ");
BigInteger arr[]=new BigInteger[n];
int i,j;
for(i=0;i<n;i++)
arr[i]=new BigInteger(tarr[i]);
int m=Integer.parseInt(in.nextLine());
int l,r;
BigInteger inc;
for(i=0;i<m;i++)
{

	tarr=in.nextLine().split(" ");
	l=Integer.parseInt(tarr[1])-1;
	r=Integer.parseInt(tarr[2])-1;
	if(tarr[0].equals("0")){
		inc=new BigInteger("1");
		for(j=l,inc=new BigInteger("1");j<=r;j++)
		{
			inc=inc.multiply(new BigInteger("2"));
			arr[j]=arr[j].add(inc);
		}
	}
	else{
		inc=new BigInteger("0");
		for(j=l;j<=r;j++)
		inc=inc.add(arr[j]);
		System.out.println(inc.mod(new BigInteger("1000000007")));
		
	}
	
}

}
}
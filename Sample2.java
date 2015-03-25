import java.util.*;
public class Sample2{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int t=Integer.parseInt(in.nextLine());
	String tmp[];
	boolean check[];
	int s,e;
	for(int i=0;i<t;i++){
		check=new boolean[Integer.MAX_VALUE/2];
		tmp=in.nextLine().split(" ");
		s=Integer.parseInt(tmp[0]);
		e=Integer.parseInt(tmp[1]);
		for(int j=s;j<=e;j++)
			if(check[j]||isPrime(j))
				{check[j]=true;System.out.println(j);}
		System.out.println();
	}
}
public static boolean isPrime(int n){
if(n==2)
	return true;
if(n%2==0||n==1)
	return false;
for(int j=3;j<n/2;j+=2)
	if(n%j==0)
		return false;
return true;
}
}


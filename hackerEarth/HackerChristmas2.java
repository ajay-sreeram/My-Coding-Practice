import java.util.*;
public class HackerChristmas2{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arrA[]=new int[n];
	int i,j;
	for(i=0;i<n;i++)
		arrA[i]=in.nextInt();
	int arrB[]=new int[n];
	for(i=0;i<n;i++)
		arrB[i]=in.nextInt();
	int cnt=0;
	for(j=1;j<n;j++){
		for(i=0;i<j;i++)
			if(arrA[i]>arrB[j])
				cnt++;
	}
	System.out.println(cnt);
}
}
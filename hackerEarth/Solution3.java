import java.util.Scanner;
public class Solution3{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
n=Integer.parseInt(in.nextLine());
int i,j;
String arr[]=new String[n];
for(i=0;i<n;i++)
arr[i]=in.nextLine();
int m=Integer.parseInt(in.nextLine());
int l,r;
String str,tarr[];
for(i=0;i<m;i++){
tarr=in.nextLine().split(" ");
l=Integer.parseInt(tarr[0])-1;
r=Integer.parseInt(tarr[1])-1;
str=tarr[2];
int cnt=0;
for(j=l;j<=r;j++)
if(arr[j].contains(str))
cnt++;
System.out.println(cnt);
}

}
}

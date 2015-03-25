import java.util.*;
public class Nbits{
public static int arr[];
public static void main(String args[]){
	arr=new int[5];
	fun(5);
}
public static void fun(int n){
if(n<1)
	System.out.println(Arrays.toString(arr));
else
{
	arr[n-1]=0;
	fun(n-1);
	arr[n-1]=1;
	fun(n-1);
}
}
}
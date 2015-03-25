import java.util.*;
public class KString{
public static int arr[];
public static void main(String args[]){
arr=new int[4];
fun(-1,3);
}
public static void fun(int n,int k){
if(n>k-1)
	System.out.println(Arrays.toString(arr));
else{
	for(int i=1;i<=k;i++){
		arr[n+1]=i;
		fun(n+1,k);
	}
}
}
}

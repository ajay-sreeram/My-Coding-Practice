import java.util.*;
public class rec{
	public static void main(String args[]){
		int arr[]=new int[3];
		fun(arr,1);
	}
	public static void fun(int arr[],int n){
		System.out.println(n);
		if(n>=arr.length-1){
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=n-1;i>=0;i--){
			arr[i]=0;
			fun(arr,i+1);
			arr[i]=1;
			fun(arr,i+1);
		}
	}
}
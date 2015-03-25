import java.util.*;
import java.io.*;
public class Permutation {
	public static void main(String[] args)throws IOException {
		int arr[]={1,2,3};
		perm(arr,0);
	}
	public static void perm(int arr[],int i){
		if(i==arr.length-1){
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int j=i;j<arr.length;j++){
			swap(arr,i,j);
			perm(arr,i+1);
			swap(arr,i,j);
		}
	}
	public static void swap(int arr[],int i,int j){
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}

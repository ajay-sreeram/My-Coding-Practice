import java.io.*;
import java.util.*;
public class Kuliza3 {
	static int min;
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			min=Integer.MAX_VALUE;
			String tarr[]=br.readLine().split(" ");
			int n=Integer.parseInt(tarr[0]);
			int r=Integer.parseInt(tarr[1]);
			tarr=br.readLine().split(" ");
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=Integer.parseInt(tarr[j]);
			Arrays.sort(arr);
			printCombination(arr,n,r);
			System.out.println(min);
		}
		
		
	}
	public static void printCombination(int arr[],int n,int r){
		int data[]=new int[r];
		for(int i=0;i<n-r+1;i++)
			fun(arr,data,n,r,i,0);
	}
	public static void fun(int arr[],int data[],int n,int r,int i,int cnt){
		if(cnt==r){
			 for(int j=0;j<r;j++){
				int num=data[j];
				int tmp=0;
				for(int k=0;k<r;k++){
					int diff=num-data[k];
					if(diff<0)
						tmp+=Math.abs(diff)*5;
					else
						tmp+=Math.abs(diff)*3;
				}
				if(min>tmp)
					min=tmp;
			} 
			//System.out.println(Arrays.toString(data));
		}else{
			//for(int j=i+1;j<n;j++){
				data[cnt]=arr[i];
				fun(arr,data,n,r,++i,cnt+1);
			//}
		}
	}
	
}

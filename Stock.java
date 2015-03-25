import java.io.*;
public class Stock{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			System.out.println(fun(arr,0,arr.length-1));
		}
	}
	public static int fun(int arr[],int from,int to){
		if(from>=to)
			return 0;
		int mid=from+(to-from)/2;
		int profitLeft=fun(arr,from,mid);
		int profitRight=fun(arr,mid+1,to);
		int minLeft=min(arr,from,mid);
		int maxRight=max(arr,mid,to);
		int profit=arr[maxRight]-arr[minLeft];
		if(profitLeft>max(profit,profitRight))
			return profitLeft;
		else if(profitRight>max(profit,profitLeft))
			return profitRight;
		else
			return profit;
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
	public static int min(int arr[],int from,int to){
		int i;
		int minindex=from;
		int min=arr[from];
		for(i=from;i<=to;i++){
			if(arr[i]<min){
				min=arr[i];
				minindex=i;
			}
		}
		return minindex;
	}
	public static int max(int arr[],int from,int to){
		int i;
		int maxindex=from;
		int max=arr[from];
		for(i=from;i<=to;i++){
			if(arr[i]>max){
				max=arr[i];
				maxindex=i;
			}
		}
		return maxindex;
	}
}
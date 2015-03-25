import java.io.*;
public class Codenigma3 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			int n=Integer.parseInt(br.readLine());
			int arr[]=new int[n];
			fun(arr,0,n);
		}
	}
	public static void fun(int arr[],int i,int n){
		if(i==n){
			for(int j=0;j<n;j++)
				System.out.print(arr[j]+1+" ");
			System.out.println();
			return;
		}
		for(int t=i;t<n;t++){
			arr[t]=i;
			fun(arr,i+1,n);
			arr[t]=0;
		}
	}
}

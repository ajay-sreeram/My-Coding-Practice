import java.io.*;
public class LIS {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		String tarr[]=br.readLine().split(" ");
		int arr[]=new int[tarr.length];
		int i,n=tarr.length;
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(tarr[i]);
		int carr[]=new int[n];
		fun(arr,carr);
	}
	public static void fun(int arr[],int carr[]){
		int i,j;
		int cnt=0;
		int max;
		for(i=0;i<arr.length;i++){
			max=0;
			for(j=i;j>=0;j--)
				if(arr[i]>arr[j])
					if(carr[j]>max)
						max=carr[j];
			carr[i]=max+1;
		}
		System.out.println(carr[i-1]);
	}
}

import java.io.*;
import java.util.*;
class HackerRankGreedy1 {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String tarr[]=buffer.readLine().split(" ");
		int n=Integer.parseInt(tarr[0]);
		int k=Integer.parseInt(tarr[1]);
		tarr=buffer.readLine().split(" ");
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(tarr[i]);
		Arrays.sort(arr);
		int sum=0;
		i=0;
		while(sum<=k&&i<n){
			sum=sum+arr[i];
			i++;
		}
		System.out.println(i-1);
	}
}

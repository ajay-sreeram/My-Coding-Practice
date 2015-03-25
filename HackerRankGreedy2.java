import java.io.*;
import java.util.*;
class HackerRankGreedy2 {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String tarr[]=buffer.readLine().split(" ");
		int n=Integer.parseInt(tarr[0]);
		int k=Integer.parseInt(tarr[1]);
		tarr=buffer.readLine().split(" ");
		int arr[]=new int[n];
		int i,j,sum;
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(tarr[i]);
		Arrays.sort(arr);
		sum=0;
		int people[]=new int[k];
		for(i=arr.length-1;i>=0;){
			for(j=0;j<k&&i>=0;j++,i--){
				people[j]++;
				sum=sum+people[j]*arr[i];
			}				
		}
		System.out.println(sum);
	}
}

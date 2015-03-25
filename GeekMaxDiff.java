import java.io.*;
//import java.util.*;
public class GeekMaxDiff{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(tarr[i]);
			}
			System.out.println(maxDiff(arr));
		}
	}
	public static int maxDiff(int arr[]){
		int maxdiff=Integer.MIN_VALUE;
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]-min>maxdiff)
				maxdiff=arr[i]-min;
			if(arr[i]<min)
				min=arr[i];
		}
		return maxdiff;
	}
}

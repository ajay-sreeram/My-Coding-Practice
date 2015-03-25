//Find the smallest positive integer value that cannot be represented as sum of any subset of a given array

import java.io.*;
//import java.util.*;
public class GeekSmallestPositive{
	public static int jumpArr[];
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
			int res=1;
			for(i=0;i<arr.length&&arr[i]<=res;i++)
				res+=arr[i];
			System.out.println("RESULT:"+res);
		}
	}
}
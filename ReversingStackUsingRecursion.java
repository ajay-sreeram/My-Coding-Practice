import java.io.*;
import java.util.*;
class ReversingStackUsingRecursion {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int i;
			int arr[]=new int[tarr.length];
			for(i=0;i<tarr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			System.out.println(Arrays.toString(arr));
			rec(arr,0);
		}
	}
	public static int rec(int arr[],int i){
		if(i==arr.length)
			return 0;
		int tmp=arr[i];
		rec(arr,++i);
		System.out.print(tmp+" ");
		return 0;
	}
}

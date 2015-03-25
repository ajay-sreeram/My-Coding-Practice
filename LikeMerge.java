import java.util.*;
import java.io.*;
class LikeMerge {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int i;
			swap(tarr);
			for(i=0;i<tarr.length;i++)
				System.out.print(tarr[i]+" ");
		}
	}
	public static void swap(String arr[]){
		int i,j,k,q;
		int n=arr.length/2;
		for(i=0,q=1,k=n;i<n;i++,k++,q++){
			for(j=k;j>i+q;j--){
				String tmp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=tmp;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}

import java.io.*;
import java.util.*;
class BookRailPlatform {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine()),i=0;
		int start[]=new int[n];
		int end[]=new int[n];
		int arr[]=new int[2*n];
		boolean type[]=new boolean[2*n];
		while(i<arr.length&&(line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int s=Integer.parseInt(tarr[0]);
			int e=Integer.parseInt(tarr[1]);
			type[i]=true;
			arr[i++]=s;
			arr[i++]=e;
		}
		sort(type,arr);
		int res=0;
		System.out.println(Arrays.toString(type));
		int max=0;
		for(i=0;i<arr.length;i++){
			if(type[i])
				res++;
			else
				res--;
			if(max<res)
				max=res;
		}
		System.out.println(max);
	}
	public static void sort(boolean start[],int end[]){
		for(int i=0;i<start.length;i++){
			for(int j=i+1;j<start.length;j++){
				if(end[i]>end[j]){
					end[i]=end[i]+end[j];
					end[j]=end[i]-end[j];
					end[i]=end[i]-end[j];
					
					boolean tmp=start[i];
					start[i]=start[j];
					start[j]=tmp;
				}
			}
		}
	}
}

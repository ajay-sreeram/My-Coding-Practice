import java.io.*;
class MaxSubSum1 {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
				String tarr[]=line.split(" ");
				int arr[]=new int[tarr.length],i;
				for(i=0;i<arr.length;i++)
					arr[i]=Integer.parseInt(tarr[i]);
				fun(arr);
		}
	}
	public static void fun(int arr[]){
		int maxsum=0;
		int cursum=0;
		for(int i=0;i<arr.length;i++){
			cursum=arr[i]+cursum;
			if(cursum<0){
				cursum=0;
				continue;
			}
			maxsum=max(maxsum,cursum);
		}
		System.out.println(maxsum);
	}
	public static int max(int a,int b){
		return a>b?a:b;
	}
}

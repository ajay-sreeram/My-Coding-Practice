import java.io.*;
class BookSort012 {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(tarr[i]);
			}
			sort(arr);
			for(i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int arr[]){
		int low,high,mid;
		low=0;
		mid=0;
		high=arr.length-1;
		while(mid<=high){
			switch(arr[mid]){
				case 0:swap(arr,low,mid);
					low++;
					mid++;
					break;
				case 1:mid++;
					break;
				case 2:swap(arr,high,mid);
					high--;
					break;
			}
		}
	}
	public static void swap(int arr[],int i,int j){
		arr[i]=arr[i]^arr[j];
		arr[j]=arr[i]^arr[j];
		arr[i]=arr[i]^arr[j];
	}
}

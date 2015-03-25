import java.io.*;
class BookFindSpecial {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i,j;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			System.out.println(fun(arr,0,arr.length-1));
		}
	}
	public static int fun(int arr[],int l,int h){
		int mid=l+(h-l)/2;
		if(l>h)
			return -1;
		if(l==h)
			return arr[l];
		if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid])
			return arr[mid];
		if(arr[mid-1]<arr[mid]&&arr[mid]<arr[mid+1])
			return fun(arr,mid+1,h);
		if(arr[mid-1]>arr[mid]&&arr[mid]>arr[mid+1])
			return fun(arr,l,mid);
		return -1;
	}
}

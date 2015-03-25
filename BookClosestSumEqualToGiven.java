import java.io.*;
class BookClosestSumEqualToGiven {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int given=Integer.parseInt(buffer.readLine());
			int arr[]=new int[tarr.length];
			int i,j;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			int tmp;
			lab:
			for(int k=0;k<arr.length;k++){
				for(i=k+1,j=arr.length-1;i<j;){
					if(arr[k]+arr[i]+arr[j]<given){
						i++;
					}
					else if(arr[k]+arr[i]+arr[j]>given){
						j--;
					}
					else{
						System.out.println("FOUND");
						break lab;
					}
				}
			}
		}
	}
}

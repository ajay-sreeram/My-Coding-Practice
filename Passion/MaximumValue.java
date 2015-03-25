import java.io.*;
class  MaximumValue{
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			int sum=0,tmp=0;
			for(i=0;i<arr.length;i++){
				/* tmp=tmp+arr[i];
				if(tmp<0)
					tmp=0;
				else if(tmp>sum)
					sum=tmp; */
				sum=max(sum,arr[i],sum+arr[i]);
			}
			System.out.println(sum);
		}
	}
	public static int max(int a,int b,int c){
		if(a>b&&a>c)
			return a;
		if(b>c&&b>a)
			return b;
		if(c>a&&c>b)
			return c;
		return -1;
	}
}

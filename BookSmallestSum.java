import java.io.*;
class BookSmallestSum {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i,j;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			int neg,pos;
			int min=Integer.MAX_VALUE;
			neg=Integer.MIN_VALUE;
			pos=Integer.MAX_VALUE;
			for(i=0,j=arr.length-1;i<j;){
				int tmp=arr[i]+arr[j];
					if(tmp<0){
						if(tmp>neg)
							neg=tmp;
						i++;
					}
					else if(tmp>0){
						if(tmp<pos)
							pos=tmp;
						j--;
				}
			}
			System.out.println(neg+":"+pos);
		}
	}
}

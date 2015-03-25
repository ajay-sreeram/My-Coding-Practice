import java.io.*;
//import java.util.*;
public class GeeksLongestContiguousSum {
    static int maxlen;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(",");
			int arr[]=new int[tarr.length];
			int i;
			int sum=Integer.parseInt(tarr[0].trim());
			int maxsum=Integer.parseInt(tarr[0].trim());
			for(i=1;i<tarr.length;i++){
				int tmp=Integer.parseInt(tarr[i].trim());
				sum=tmp+sum>tmp?tmp+sum:tmp;
				if(maxsum<sum)
					maxsum=sum;
			}
			System.out.println("MAX SUM:"+maxsum);
		}
	}
}
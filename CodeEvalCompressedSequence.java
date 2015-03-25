import java.io.*;
import java.util.*;
public class CodeEvalCompressedSequence {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(tarr[i]);
			}
			int num=arr[0],cnt=0;
			i=0;
			for(i=0;i<arr.length-1;i++){
				if(arr[i]!=arr[i+1]){
					System.out.print((++cnt)+" "+arr[i]+" ");
					cnt=0;
				}
				else
					cnt++;
			}
				System.out.print((++cnt)+" "+arr[i]);
			System.out.println();
		}
	}
}
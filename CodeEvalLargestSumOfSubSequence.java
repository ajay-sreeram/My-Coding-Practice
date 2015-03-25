import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalLargestSumOfSubSequence {
    public static void main (String[] args) throws IOException {
 
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
		String tarr[]=line.split(",");
		int i,j;
		int max=Integer.MIN_VALUE;
		int sum=0;
		int arr[]=new int[tarr.length];
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(tarr[i]);
		for(i=0;i<arr.length;i++){
			sum=0;
			for(j=i;j<arr.length;j++){
				sum+=arr[j];
				if(sum>max)
					max=sum;
			}			
		}
		System.out.println(max);
	
		}	
	}	
}
import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalPermInSorted {
	public static int result=0;
    public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			line=line.trim();
			char arr[]=line.toCharArray();
			Arrays.sort(arr);
			int len=arr.length;
			System.out.print(new String(arr));
			boolean finished=false;
			while(true){
				int i;
				for(i=len-2;i>=0;i--)
					if(arr[i]<arr[i+1])
						break;
				if(i==-1)
					break;
				int second=ceil(arr,arr[i],i+1,len-1);
				//swap
				char tmp=arr[i];
				arr[i]=arr[second];
				arr[second]=tmp;
				rev(arr,i+1,len-1);
			//	System.out.println("FIRST:"+i+" SECOND:"+second);
				System.out.print(","+new String(arr));
			//	String tmpp=buffer.readLine();
			}
			System.out.println();
		}
	}
	public static int ceil(char arr[],char ch,int s,int e){
		int index=s;
		for(int i=s+1;i<=e;i++)
			if(arr[i]>ch && arr[i]<arr[index])
				index=i;
		return index;
	}
	public static void rev(char arr[],int s,int e){
		while(s<e){
			char tmp=arr[s];
			arr[s]=arr[e];
			arr[e]=tmp;
			s++;
			e--;
		}
	}
}
//https://www.codeeval.com/open_challenges/135/
import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class Try {
    static int max;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
		String arr[]=line.split(",");
		max=0;
		int len=arr.length;
		for(int i=0;i<len;i++)
			{fun(arr,i,1,1,len);
			System.out.println();}
		System.out.println(max);
		}
	}
	public static void fun(String arr[],int j,int curLen,int cntr,int len){//j->curloc
		if(curLen==len){
			if(cntr>max)
				max=cntr;
			return;
		}
		System.out.println(arr[j]+":"+cntr);
		for(int i=0;i<len&&j<len;i++,j++){
			if(j<len-1){
				if(arr[j].charAt(arr[j].length()-1)==arr[j+1].charAt(0))
				{	fun(arr,j+1,curLen+1,cntr+1,len); System.out.println("HELLO1");}
				else
				{	fun(arr,j+1,curLen+1,cntr,len); System.out.println("S:"+arr[j]+", E:"+arr[j+1]);}
			}
			else{
				if(arr[j].charAt(arr[j].length()-1)==arr[0].charAt(0))
				{	fun(arr,0,curLen+1,cntr+1,len); System.out.println("HELLO2");}
				else
				{	fun(arr,0,curLen+1,cntr,len); System.out.println("S:"+arr[j]+", E:"+arr[0]);}
			}
		}
	}
}
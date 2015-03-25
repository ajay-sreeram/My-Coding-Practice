import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalPerm {
    public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			line="abc";
			perm(line.toCharArray(),0);
		}
	}
	
	
	public static void perm(char arr[],int i){
	if(i==arr.length-1)
	{
		System.out.println(new String(arr));
		return;
	}
	for(int j=i;j<arr.length;j++){
		swap(arr,i,j);
		perm(arr,i+1);
		swap(arr,i,j);
	}
	}
	public static void swap(char arr[],int i,int j){
		char tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}
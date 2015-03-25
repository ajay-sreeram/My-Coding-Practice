import java.io.*;
import java.util.*;
import java.text.*;
public class CodeEvalQuickSort {
    public static void main (String[] args) throws IOException {
 
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			float arr[]=new float[tarr.length];
			int i=0;
			for(;i<arr.length;i++)
				arr[i]=Float.parseFloat(tarr[i]);
			quicksort(arr,0,arr.length-1);
			for(i=0;i<arr.length;i++)
				System.out.print(String.format("%.3f",arr[i])+" ");
			System.out.println();
		}
	}
	
	public static void quicksort(float arr[],int l,int h){
if(l<h){
	int p=partition(arr,l,h);
	quicksort(arr,l,p-1);
	quicksort(arr,p+1,h);
}
}

public static int partition (float arr[],int l,int h){
float pivot=arr[h];
int i=l-1;
for(int j=l;j<=h-1;j++){
	if(arr[j]<=pivot){
		i++;
		float tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}
float tmp=arr[i+1];
arr[i+1]=arr[h];
arr[h]=tmp;
return i+1;
}
}
		

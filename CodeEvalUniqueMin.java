import java.io.*;
import java.util.*;
public class CodeEvalUniqueMin {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String starr[]=line.split(" ");
			int arr[]=new int[starr.length];
			int i,j;
			for(i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(starr[i].trim());
			}
			int tmp[]=new int[arr.length];
			int min=Integer.MAX_VALUE;
			for(i=0;i<arr.length;i++)
			{
				if(tmp[i]==0)
				{
					for(j=i;j<arr.length;j++){
						if(arr[i]==arr[j]){
							++tmp[i];
							tmp[j]=tmp[i];
						}
					}
					if(tmp[i]==1)
						if(arr[i]<min)
							min=arr[i];
				}	
			}
			if(min==Integer.MAX_VALUE)
				System.out.println("0");
			else
				System.out.println(arr[min-1]);
		}
	}
}
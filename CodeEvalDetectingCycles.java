import java.io.*;
import java.util.*;
import java.text.*;
public class CodeEvalDetectingCycles {
    public static void main (String[] args) throws IOException {
 
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
		String arr[]=line.split(" ");
		List<String> list=new ArrayList<String>();
		int i;
		for(i=arr.length-1;i>=0;i--)
		{	
			if(list.contains(arr[i]))
				break;
			list.add(arr[i]);
		}
		for(int j=list.size()-1;j>=0;j--)
			if(j==0)
				System.out.println(list.get(j));
			else
				System.out.print(list.get(j)+" ");
		}
		
	}	
}
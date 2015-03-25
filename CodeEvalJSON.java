import java.io.*;
import java.util.*;
public class CodeEvalJSON {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
		String arr[]=line.split("\\{\"id\":");
		int sum=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i].indexOf("\"Label ")!=-1)
			{
				String tmp=arr[i].substring(1,arr[i].indexOf(","));
				sum+=Integer.parseInt(tmp);
			}
		System.out.println(sum);
		}
		
	}
}
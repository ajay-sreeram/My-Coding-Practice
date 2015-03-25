import java.io.*;
import java.util.*;
public class CodeEvalEncrypt {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String arr=line.substring(0,line.indexOf('|'));
			String num[]=line.substring(line.indexOf('|')+2,line.length()).split(" ");
			//System.out.println("\nnums:"+Arrays.toString(num));
			String result="";
			for(int i=0;i<num.length;i++)
				result=result+arr.charAt(Integer.parseInt(num[i].trim())-1);
			System.out.println(result);
		}
		
	}
}
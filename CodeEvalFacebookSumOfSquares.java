import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalFacebookSumOfSquares {
    public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		line=buffer.readLine();
		while((line=buffer.readLine())!=null){
		int n=Integer.parseInt(line);
		int cnt=0;
		int times=(int)Math.sqrt((double)n/2.0);
		for(int i=0;i<=times;i++){
			double tmp=Math.sqrt((double)n-i*i);
			if(tmp-(int)tmp==0.0)
				cnt++;
		}
		System.out.println(cnt);
		}
	}
}
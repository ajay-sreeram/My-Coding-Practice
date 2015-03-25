/* 3000000000
2147483647
 */
import java.io.*;
//import java.util.*;
public class CodeEvalPredictTheNumber{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			long n=Long.parseLong(line);
			int i=1;
			String st="0";
			while(n>i){
					String tmp="";
					for(int j=0;j<st.length();j++)
						if(st.charAt(j)=='0')
							tmp=tmp+"1";
						else if(st.charAt(j)=='1')
							tmp=tmp+"2";
						else
							tmp=tmp+"0";
					st=st+tmp;
					i*=2;
			}
			
			System.out.println(st.charAt((int)n));
		}
	}
}
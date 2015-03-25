import java.io.*;
import java.util.*;
public class CodeEvalBalancedSmilies{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			if(line.equals("(:)")){
				System.out.println("YES");
				continue;
			}
			char arr[]=line.toCharArray();
			String st="";
			int i=0;
			for(i=0;i<arr.length;i++){
				if(arr[i]=='(')
					if(i>0)
					{
						if(arr[i-1]!=':')
							st=st+"(";
					}
					else
						st=st+"(";
					
				if(arr[i]==')')
					if(i>0)
					{
						if(arr[i-1]!=':')
							if(st.length()!=0)
								st=st.substring(0,st.length()-1);
							else
								break;
					}
					else
						break;
			}
			if(i!=arr.length||st.length()!=0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
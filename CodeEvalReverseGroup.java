import java.io.*;
//import java.util.*;
public class CodeEvalReverseGroup{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String val[]=line.split(";");
			int k=Integer.parseInt(val[1]);
			String arr[]=val[0].split(",");
			int i,j;
			String st="";
			for(i=0;i<arr.length;){
				j=k+i-1;
				if(j>=arr.length)
					break;
				for(;j>=i;j--)
					st=st+arr[j]+",";
				i+=k;
			}
			for(;i<arr.length;i++)
				st=st+arr[i]+",";
			System.out.println(st.substring(0,st.length()-1));
		}
	}
}
import java.io.*;
//import java.util.*;
public class CodeEvalPascalsTriangle{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			int len=Integer.parseInt(line);
			for(int n=1;n<=len;n++){
				int num=1;
				for(int i=1;i<=n;i++){
					System.out.print(num+" ");
					num=num*(n-i)/i;
				}
			}
			System.out.println();
		}
	}
}
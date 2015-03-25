import java.io.*;
public class CodeEvalString{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line="aa";	
	while ((line = buffer.readLine()) != null) {
		line=line.trim().toLowerCase();
		int sum=0;
		for(int i=0;i<line.length();i++)
			{
			int ch=(int)line.charAt(i);
			System.out.print(":"+ch);
			if(ch>=97&&ch<=122)
				sum+=(ch-96);
			}
		System.out.println(sum);
	}
}
}
import java.io.*;
import java.util.*;
public class SpojMain {
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine());
		while((line=buffer.readLine())!=null){
			int num=Integer.parseInt(line);
			while(true){
				num++;
				if(num>1000000)
					break;
				line=""+num;
				if(line.equals(new StringBuilder(line).reverse().toString()))
				{
					System.out.println(line);
					break;
				}
			}
		}
	}
}
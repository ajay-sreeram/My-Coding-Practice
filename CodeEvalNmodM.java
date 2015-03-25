import java.io.*;
public class CodeEvalNmodM{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = buffer.readLine()) != null) {
		String arr[]=line.split(",");
		int n=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		while(n>=m){
			n-=m;
		}
		System.out.println(n);
	}
}
}
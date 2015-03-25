import java.io.*;
public class CodeEvalHappyNumbers{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = buffer.readLine()) != null) {
		int n=Integer.parseInt(line);
		while((n/10)!=0){
			int sum=0;
			while(n!=0){
				sum+=((n%10)*(n%10));
				n/=10;
			}
			n=sum;
		}
		if(n==1||n==7)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
}
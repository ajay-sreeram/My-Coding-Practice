import java.io.*;
public class CodeEvalArmstrongNumber{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line="aa";
    	
	while ((line = buffer.readLine()) != null) {
	int n=Integer.parseInt(line);
	int len=line.length();
	int sum=0;
	int tmp=n;
	while(tmp!=0){
	sum+=Math.pow(tmp%10,len);
	tmp/=10;
	}
	if(n==sum)
		System.out.println("True");
	else
		System.out.println("False");
	}	
}
}
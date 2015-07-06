import java.io.*;
import java.math.*;
public class BigIntegers {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger n1=new BigInteger(br.readLine());
		BigInteger n2=new BigInteger(br.readLine());
		System.out.println(n1.add(n2));
		System.out.println(n1.multiply(n2));
	}
}

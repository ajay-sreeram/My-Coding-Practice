import java.io.*;
public class  Gcd{
	public static void main(String[] args)throws IOException {
		System.out.println(gcd(10,6));
	}
	public static int gcd(int n, int m) {
            if (n%m ==0) return m;
            if (n < m){
				n=n^m;
		m=n^m;
		n=n^m;
			} //swap(n, m);
            while (m > 0) {
                n = n%m;
               // swap(n, m);
			   n=n^m;
		m=n^m;
		n=n^m;
            }
            return n;
    }
	
}

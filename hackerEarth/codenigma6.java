import java.io.*;
public class Codenigma6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			String tarr[]=br.readLine().trim().split(" ");
			int n=Integer.parseInt(tarr[0]);
			if(tarr[1].equals("y")){
				if(n==1||n==4||n==6)
					System.out.println("1");
				else
					System.out.println("0");
			}else{
				System.out.println(n-primeFactorMax(n));
			}
		}
	}
	public static int primeFactorMax(int number) {
    int i;
    for (i = 2; i <= number; i++) {
        if (number % i == 0) {
            number /= i;
            i--;
        }
    }
    return i;
}
}

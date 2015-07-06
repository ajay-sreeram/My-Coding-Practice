import java.io.*;
public class Loops {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String lines[]=br.readLine().split(" ");
			int a=Integer.parseInt(lines[0]);
			int b=Integer.parseInt(lines[1]);
			int n=Integer.parseInt(lines[2]);
			int p=a+b;
			System.out.print(p+" ");
			for(int j=1;j<n;j++){
				p=p+(1<<j)*b;
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}

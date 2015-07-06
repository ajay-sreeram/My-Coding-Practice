import java.io.*;
public class Kuliza1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String l1[]=br.readLine().split(" ");
		String l2[]=br.readLine().split(" ");
		int m1=0,m2=0;
		for(int i=1;i<n;i++){
			int t1=Math.abs(Integer.parseInt(l1[i-1])-Integer.parseInt(l1[i]));
			int t2=Math.abs(Integer.parseInt(l2[i-1])-Integer.parseInt(l2[i]));
			if(t1>m1)
				m1=t1;
			if(t2>m2)
				m2=t2;
		}
		if(m1==m2)
			System.out.println("Tie\n"+m1);
		else if(m1>m2)
			System.out.println("Dom\n"+m1);
		else
			System.out.println("Brian\n"+m2);
	}
}

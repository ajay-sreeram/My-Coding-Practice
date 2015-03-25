import java.io.*;
public class SpojPattern{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String tmp[]=br.readLine().trim().split(" ");
			int x=Integer.parseInt(tmp[0]);
			int y=Integer.parseInt(tmp[1]);
			if(x%2==0&&y%2==0){
				if(x>=y)
					System.out.println(x+y);
				else
					System.out.println("No Number");
			}
			else if(x%2!=0&&y%2!=0){
				if(x>=y)
					System.out.println(x+y-1);
				else
					System.out.println("No Number");
			}
			else
				System.out.println("No Number");
				
		}
	}
}
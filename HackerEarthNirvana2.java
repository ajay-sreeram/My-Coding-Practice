import java.io.*;
public class HackerEarthNirvana2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
		String line;
		for(int k=0;k<n;k++){
			char carr[]=br.readLine().trim().toCharArray();
			int i,arr[]=new int[256];
			for(i=0;i<carr.length;i++){
				int tmp=(int)carr[i];
				if(arr[tmp]==1)
					arr[tmp]=0;
				else
					arr[tmp]=1;
			}
			for(i=0;i<arr.length;i++)
				if(arr[i]==1)
					break;
			if(i==arr.length)
				System.out.println("1");
			else
				System.out.println("-1");
		}
	}
}

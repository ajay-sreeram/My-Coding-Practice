import java.io.*;
public class Sample{
	public static void main(String args[]){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			int n=Integer.parseInt(line.trim());
			int num=1,cntr=1;
			while(cntr>n){
				if(ugly(num))
					cntr++;
				num++;
			}
			System.out.println(n+"th ugly num:"+num);
		}
	}
	
}
import java.io.*;
public class Battery {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		double n=0,d=0;
		for(int i=0;i<100;i++){
			line=br.readLine();
			String tmp[]=line.split(",");
			n+=Double.parseDouble(tmp[0]);
			d+=Double.parseDouble(tmp[1]);
		}
		double tmp=Double.parseDouble(br.readLine());
		System.out.println((d/n));
	}
}

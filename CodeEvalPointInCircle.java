import java.io.*;
import java.util.*;
public class CodeEvalPointInCircle{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&line.trim().length()!=0){
			String val[]=line.split(" ");
			double cx=Double.parseDouble(val[1].substring(1,val[1].indexOf(',')));
			double cy=Double.parseDouble(val[2].substring(0,val[2].length()-2));
			double r=Double.parseDouble(val[4].substring(0,val[4].length()-1));
			double px=Double.parseDouble(val[6].substring(1,val[6].indexOf(',')));
			double py=Double.parseDouble(val[7].substring(0,val[7].length()-1));
			
			if(Math.sqrt(Math.pow((px-cx),2)+Math.pow((py-cy),2))<=r)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
import java.io.*;
import java.util.regex.*;
public class IP {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
		String reg="([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-5][0-5])";
		Pattern p = Pattern.compile(reg);
		if(p.matcher(line).matches()){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	}
}

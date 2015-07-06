import java.io.*;
import java.util.regex.*;
public class DetectLatLan {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String reg="\\(([+|-]|)((([1-8][0-9])|([1-9])|([9][0])|([1-9]))|((([1-8][0-9])|([1-9])|([9][0])||([1-9]))(\\.[0-9]{1,11}))),\\s([+|-]|)(([1][8][0])|([1][8][0]\\.[0]{1,9})|(([1][0-7][0-9])|([2-9][0-9])|([1-9]))|((([1][0-7][0-9])|([2-9][0-9])|([1-9]))\\.[0-9]{1,11}))\\)";
		
		
		//String reg="\\(([+|-]|)([1-8]?[0-9]|90)\\.[0-9]{1,11},\\s([+|-]|)((1?[0-7]?|[0-9]?)[0-9]|180)\\.[0-9]{1,11}\\)";
		
		
		
		//String reg="\\(([+|-]|)([1-8]?[0-9]|90)\\.[0-9]{1,11},\\s([+|-]|)((1?[0-7]?|[0-9]?)[0-9]|180)\\.[0-9]{1,11}\\)";
		Pattern p = Pattern.compile(reg);
		if(p.matcher(line).matches()){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
}

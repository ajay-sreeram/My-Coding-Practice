//Sample code to read in test cases:
import java.io.*;
import java.util.*;
public class CodeEvalPatternLength {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
		int i;
		char ch=line.charAt(0);
		for(i=1;i<line.length();i++)
			if(line.charAt(i)==ch)
				break;
		System.out.println(i);
		}
	}
}
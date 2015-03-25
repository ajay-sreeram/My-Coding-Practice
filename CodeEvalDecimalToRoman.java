import java.io.*;
import java.util.*;
import java.text.*;
public class CodeEvalDecimalToRoman	 {
    public static void main (String[] args) throws IOException {
              BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		int dec[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String rom[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int n;
		while((line=buffer.readLine())!=null){
		line=line.trim();
		n=Integer.parseInt(line);
		String st="";
		for(int i=0;i<rom.length;i++){
			while(n>=dec[i]){
				n-=dec[i];
				st=st+rom[i];
			}
		}
		System.out.println(st);
		}
	}
	
}
import java.io.*;
import java.text.*;
import java.util.*;
public class CodeEvalBigDigits {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		String num[][]=new String[7][11];
		num[1]=new String[]{"-**--","--*--","***--","***--","-*---","****-","-**--","****-","-**--","-**--"};
		num[2]=new String[]{"*--*-","-**--", "---*-", "---*-", "*--*-", "*----", "*----", "---*-", "*--*-", "*--*-"};
		num[3]=new String[]{"*--*-", "--*--", "-**--", "-**--", "****-", "***--", "***--", "--*--", "-**--", "-***-"};
		num[4]=new String[]{"*--*-", "--*--", "*----", "---*-", "---*-", "---*-", "*--*-", "-*---", "*--*-", "---*-"};
		num[5]=new String[]{"-**--", "-***-", "****-", "***--", "---*-", "***--", "-**--", "-*---", "-**--", "-**--"};
		num[6]=new String[]{"-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----"};
		while((line=buffer.readLine())!=null){
		char arr[]=line.toCharArray();
		for(int row=1;row<=6;row++){
			for(int i=0;i<arr.length;i++){
				if(Character.isDigit(arr[i])){
					int n=(int)arr[i]-48;
					System.out.print(num[row][n]);
				}
			}
			System.out.println();
		}
		}
	}
}
import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalVALIDPARENTHESES {
    public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			char arr[]=line.toCharArray();
			String st1="";
			String st2="";
			int i;
			for(i=0;i<arr.length;i++){
			char ch=arr[i];
			if(ch=='('||ch=='['||ch=='{')
				st1=st1+ch;
			else if(ch==')')
				st2=st2+'(';
			else if(ch==']')
				st2=st2+'[';
			else if(ch=='}')
				st2=st2+'{';
			}
			System.out.println("BEFORE:"+st2);
			st2=new StringBuilder(st2).reverse().toString();
			System.out.println("AFTER:"+st2);
			if(st1.equals(st2))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
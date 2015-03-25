import java.io.*;
import java.util.*;
public class CodeEvalWordsNums {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;//=buffer.readLine();
		while((line=buffer.readLine())!=null){
			String arr[]=line.split(",");
			int i,check[]=new int[arr.length];
			boolean havewords=false;
			if(isNumber(arr[0]))
				check[0]=1;
			else{
				System.out.print(arr[0]);
				havewords=true;
			}
			for(i=1;i<arr.length;i++)
				if(isNumber(arr[i]))
				{
					check[i]=1;
				}
				else{
					System.out.print(","+arr[i]);
					havewords=true;
				}
			if(!havewords)
				{System.out.print(arr[0]);i=1;}
			else
				i=0;
			for(;i<arr.length;i++){
				if(check[i]==1)
					System.out.print(","+arr[i]);
			}
		}
	}
	public static boolean isNumber(String st){
	try{
		Double d=Double.parseDouble(st);
		return true;
	}
	catch(NumberFormatException e){
		return false;
	}
	}
}
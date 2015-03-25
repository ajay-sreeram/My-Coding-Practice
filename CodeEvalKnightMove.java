import java.io.*;
//import java.util.*;
public class CodeEvalKnightMove{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			char arr[]=line.trim().toCharArray();
			int col=((int)arr[0])-96;
			String st="";
			int row=Integer.parseInt(arr[1]+"");
			if(col-2>0&&row-1>0)
				st=st+((char)(col-2+96))+(row-1)+" ";
			if(col-2>0&&row+1<9)
				st=st+((char)(col-2+96))+(row+1)+" ";
			if(col-1>0&&row-2>0)
				st=st+((char)(col-1+96))+(row-2)+" ";
			if(col-1>0&&row+2<9)
				st=st+((char)(col-1+96))+(row+2)+" ";
			if(col+1<9&&row-2>0)
				st=st+((char)(col+1+96))+(row-2)+" ";
			if(col+1<9&&row+2<9)
				st=st+((char)(col+1+96))+(row+2)+" ";
			if(col+2<9&&row-1>0)
				st=st+((char)(col+2+96))+(row-1)+" ";
			if(col+2<9&&row+1<9)
				st=st+((char)(col+2+96))+(row+1)+" ";
			System.out.println(st.trim());
		}
	}
}
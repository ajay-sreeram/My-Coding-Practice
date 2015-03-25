import java.io.*;
import java.util.*;
import java.nio.ByteOrder;
import java.text.*;
public class CodeEvalRectanglesOverlap {
	public static int result=0;
    public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			String arr[]=line.split(",");
			int l1x=Integer.parseInt(arr[0]);
			int l1y=Integer.parseInt(arr[1]);
			int r1x=Integer.parseInt(arr[2]);
			int r1y=Integer.parseInt(arr[3]);
			int l2x=Integer.parseInt(arr[4]);
			int l2y=Integer.parseInt(arr[5]);
			int r2x=Integer.parseInt(arr[6]);
			int r2y=Integer.parseInt(arr[7]);
			if(fun(l1x,l1y,r1x,r1y,l2x,l2y,r2x,r2y))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
	public static boolean fun(int l1x,int l1y,int r1x,int r1y,int l2x,int l2y,int r2x,int r2y){
		if (l1y < r2y || l2y < r1y)
			return false;
		if (l1x > r2x || l2x > r1x)
			return false;
		return true;
	}
}
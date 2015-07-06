import java.util.*;
import java.io.*;
public class Trail {
	public static void main(String args[])throws IOException{
			Scanner in=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String arr[]=br.readLine().split(" ");
			//String arr[]=in.nextLine().trim().split(" ");
			
			String gvn[]=arr[0].split("-");
			/* int y=Integer.parseInt(gvn[0])-2003;
			int m=Integer.parseInt(gvn[1]);
			int w=Integer.parseInt(gvn[2].trim())/7+1;
			int a=Integer.parseInt(arr[3]);
			 */
			 System.out.println(arr[2].substring(11,arr[2].length()));
			 System.out.println(Arrays.toString(arr));
	}
}
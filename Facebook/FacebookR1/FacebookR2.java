import java.io.*;
import java.util.*;
public class FacebookR2 {
    static int maxlen;
	public static void main (String[] args) throws IOException {
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		 BufferedReader buffer=new BufferedReader(new FileReader("input2.in"));
		PrintWriter out=new PrintWriter("output2.out"); 
		int n=Integer.parseInt(buffer.readLine());
		for(int c=1;c<=n;c++){
			int wcnt=Integer.parseInt(buffer.readLine());
			int result=0;
			List<String> list=new ArrayList<String>();
			for(int w=0;w<wcnt;w++){
				String st=buffer.readLine();
				int i=0,j=1;
				while(j<=st.length()){
					if(list.contains(st.substring(i,j)))
						j++;
					else{
						for(int k=j;k<=st.length();k++)
							list.add(st.substring(i,k));
						break;
					}
				}
				if(j<=st.length())
					result+=j;
				else
					result+=(j-1);
			}
			out.println("Case #"+c+": "+result);
		}
		out.close();
	}
}
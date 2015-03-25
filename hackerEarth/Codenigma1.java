import java.io.*;
public class Codenigma1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int s,e,i;
		int tests=Integer.parseInt(br.readLine());
		for(int p=0;p<=tests;p++){
			line=br.readLine().trim();
			while(line.length()!=1){
				String tmp="";
				for(s=0,e=9;e<=line.length();){
					String st=line.substring(s,e);
					int sum=0;
					for(i=0;i<st.length();i++)
						sum+=((int)st.charAt(i)-48);
					sum=sum%9;
					tmp=tmp+""+sum;
					s=e;
					e+=9;
				}
				if(s<line.length()){
					String st=line.substring(s);
					int sum=0;
					for(i=0;i<st.length();i++)
						sum+=((int)st.charAt(i)-48);
					sum=sum%9;
					tmp=tmp+""+sum;
				}
				line=tmp;
			}
			System.out.println(line);
		}
	}
}

import java.io.*;
import java.util.*;
public class  SPOJTOANDFRO{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null&&!line.equals("0")){
			int n=Integer.parseInt(line);
			line=br.readLine();
			int s=0,e=n;
			List<String> arr=new ArrayList<String>();
			int i=0,j=0;
			boolean flag=false;
			while(e<=line.length()){
				if(flag){
				arr.add(new StringBuilder(line.substring(s,e)).reverse().toString());
				flag=false;
				}else{
				flag=true;
				arr.add(line.substring(s,e));
				}
				s=e;
				e+=n;
			}
			for(i=0;i<n;i++){
				for(j=0;j<arr.size();j++)
					System.out.print(arr.get(j).charAt(i));
			}
			System.out.println();
		}
	}
}

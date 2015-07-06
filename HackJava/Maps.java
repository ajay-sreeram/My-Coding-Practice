import java.io.*;
import java.util.*;
public class Maps {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		HashMap<String,String> hm=new HashMap<String,String>();
		int n=Integer.parseInt(br.readLine());
		for(int c=0;c<n;c++){
			String name=br.readLine();
			String num=br.readLine();
			hm.put(name,num);
		}
		while((line=br.readLine())!=null){
			if(hm.containsKey(line)){
					System.out.println(line+"="+hm.get(line).toString());
			}else{
				System.out.println("Not found");
			}
			
		}
	}
}

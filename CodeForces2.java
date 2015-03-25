import java.io.*;
import java.util.*;
public class CodeForces2 {
    static int max;
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n=Integer.parseInt(buffer.readLine());
		int i=0;
		String arr1[]=new String[n];
		String arr2[]=new String[n];
		for(i=0;i<n;i++){
			String tmp[]=buffer.readLine().split(" ");
			arr1[i]=tmp[0];
			arr2[i]=tmp[1];
		}
		boolean check[]=new boolean[n];
		List<String> list=new ArrayList<String>();
		for(i=0;i<n;i++){
			if(!check[i])
			{
				String tmp=arr2[i];
				for(int j=i+1;j<n;j++){
					if(check[j]==false&&arr1[j].equals(tmp)){
						check[j]=true;
						tmp=arr2[j];
					}
				}
				if(!arr2[i].equals(tmp)){
					list.add(arr1[i]+" "+tmp);
					check[i]=true;
				}
			}
		}
		for(i=0;i<n;i++)
			if(!check[i])
				list.add(arr1[i]+" "+arr2[i]);
		System.out.println(list.size());
		for(i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}
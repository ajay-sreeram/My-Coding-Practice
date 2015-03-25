import java.io.*;
public class Codenigma4 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int tests=Integer.parseInt(br.readLine());
		for(int t=0;t<tests;t++){
			String st=br.readLine().trim();
			if(fun(st.toCharArray()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static boolean fun(char arr[]){
		int j=0;
		for(int i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					if(check(arr,i,j))
						return true;
					else{
						break;
					}
				}
			}
		}
		return false;
	}
	public static boolean check(char arr[],int s,int e){
		int i,j;
		for(i=s,j=e;j<arr.length&&i<e;j++,i++)
			if(arr[i]!=arr[j])
				return false;
		if(i==e)
			return true;
		else
			return false;
	}
}

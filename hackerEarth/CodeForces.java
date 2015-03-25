import java.io.*;
public class CodeForces{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char arr[]=br.readLine().trim().toCharArray();
		int tmp1=(int)arr[0]-48;
		int tmp2=9-tmp1;
		if(tmp2!=0){
			if(tmp2<tmp1)
				arr[0]=(char)(tmp2+48);
		}
		for(int i=1;i<arr.length;i++){
			tmp1=(int)arr[i]-48;
			tmp2=9-tmp1;
			if(tmp2<tmp1)
				arr[i]=(char)(tmp2+48);
		}
		System.out.println(new String(arr));
	}
}

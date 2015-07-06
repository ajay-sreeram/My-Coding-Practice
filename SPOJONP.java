import java.io.*;
import java.util.*;
public class SPOJONP {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			char gvn[]=br.readLine().toCharArray();
			String res="";
			Stack stk=new Stack();
			for(int j=0;j<gvn.length;j++){
				switch(gvn[j]){
					case '(':break;
					case '+':
					case '-':
					case '*':
					case '/':
					case '^':
					stk.push(gvn[j]);break;
					case ')':res=res+stk.pop();break;
					default: res=res+gvn[j];
				}
			}
			System.out.println(res);
		}
	}
}

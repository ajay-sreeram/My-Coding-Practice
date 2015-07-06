import java.util.*;
public class StringPattern {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String st="1";
		for(int i=0;i<n;i++){
			int p=0;
			String tmp="";
			while(p<st.length()){
				char ch=st.charAt(p);
				int cnt=0;
				while(p<st.length()&&st.charAt(p)==ch){
					p++;cnt++;
				}
				tmp=tmp+cnt+ch;
			}
			st=tmp;
			System.out.println(st);
		}
	}
}

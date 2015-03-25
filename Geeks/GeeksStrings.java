import java.util.*;
public class GeeksStrings{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	String st=in.nextLine();
	char ch[]=st.toCharArray();
	boolean buf[]=new boolean[st.length()];
	System.out.println("\n---------------------------------------------");
	spacing(ch,buf,0);
}
static void spacing(char ch[],boolean buf[],int n){
if(n==ch.length-1){
	System.out.print(ch[0]);
	for(int i=1;i<ch.length;i++)
	if(buf[i-1])
	System.out.print(" "+ch[i]);
	else
	System.out.print(ch[i]);
	System.out.println();
	return;
}

buf[n]=false;
spacing(ch,buf,n+1);
buf[n]=true;
spacing(ch,buf,n+1);

}

}
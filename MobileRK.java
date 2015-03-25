import java.io.*;
import java.util.*;
public class MobileRK{
public static void main(String args[])throws IOException{
Scanner in=new Scanner(System.in);
int t=Integer.parseInt(in.nextLine());
int i,j,n;
for(int a=0;a<t;a++){
String temp[]=in.nextLine().split(" ");
String st=in.nextLine();
int mr=Integer.parseInt(temp[0]);
int nk=Integer.parseInt(temp[1]);
int cntm=0,cntn=0;
int len=st.length();
for(i=mr;i<=len;i++){
	n=len-i+1;
	for(j=0;j<n;j++){
		if(st.substring(j,j+i).replace(""+'K',"").length()==mr)
			cntm++;
		//System.out.println(st.substring(j,j+i)+":"+st.substring(j,j+i).replace(""+'K',"").length());
		}
	}

for(i=nk;i<=len;i++){
	n=len-i+1;
	for(j=0;j<n;j++)
		if(st.substring(j,j+i).replace(""+'R',"").length()==nk)
			cntn++;
	}
	
System.out.println(cntm+" "+cntn);	
}

}
}
			

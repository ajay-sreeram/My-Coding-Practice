import java.util.*;
public class Hexa{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String res="";
String temp[];
int n=Integer.parseInt(in.nextLine());
for(int i=0;i<n;i++){
	temp=in.nextLine().split(" ");
	String tempres="";
	for(int j=0;j<temp.length;j++)
		tempres+=" "+(char)Integer.parseInt(temp[j].toLowerCase(),16);
	res+=tempres+"\n";
}
System.out.println(res);
}
}
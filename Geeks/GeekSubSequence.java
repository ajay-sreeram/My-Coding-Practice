import java.util.*;
public class GeekSubSequence{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String st1=in.nextLine();
String st2=in.nextLine();
if(isSubSequence(st1,st2,st1.length(),st2.length()))
	System.out.println("TRUE");
else
	System.out.println("FALSE");
}
public static boolean isSubSequence(String st1,String st2,int m,int n){
	if(m==0)return true;
	if(n==0)return false;
	if(st1.charAt(m-1)==st2.charAt(n-1))
		return isSubSequence(st1,st2,m-1,n-1);
	else
		return isSubSequence(st1,st2,m,n-1);
}
}
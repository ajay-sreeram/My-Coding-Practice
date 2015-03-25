import java.util.*;
public class SriHari{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n;
	n=in.nextInt();
	int i;
	for(i=1;i<n;i++){
		checkNum(i);
	}
	System.out.println("\n"+"multiple of 5,7");
	for(i=1;i<n;i++){
		checkNum5or7(i);
	}
}
public static void checkNum(int n){
if((n+"").indexOf("9")>=0){
	System.out.print(" "+n);
}	
}
public static void checkNum5or7(int n){
if(n%5==0||n%7==0){
	System.out.print(" "+n);
}	
}
}


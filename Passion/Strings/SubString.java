import java.util.*;
public class SubString{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	String st=in.nextLine();
	String pattern=in.nextLine();
	int i,j;
	for(i=0;i<=(st.length()-pattern.length());i++){
		j=0;
		//System.out.println("HELLO");
		while(j<pattern.length()&&pattern.charAt(j)==st.charAt(i+j)){
		//	System.out.print(" "+st.charAt(i+j));
			j++;
		}
		if(j==pattern.length()){
			System.out.println("TRUE");return;
		}
	}
	System.out.println("FALSE");
}
}
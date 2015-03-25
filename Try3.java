import java.util.*;
public class Try3{
public static void main(String args[]){
	String st="ab*cd";
	String arr[]=st.split("\\*");
	System.out.println(Arrays.toString(arr)+":"+st.indexOf('*'));
}
}
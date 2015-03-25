import java.io.*;
import java.util.*;
public class Solution1{
public static void main(String args[])
{
	int i,t;
	Scanner in=new Scanner(System.in);
	t=Integer.parseInt(in.nextLine());
	while(t--!=0)
	{
		if(check(in.nextLine())==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
public static boolean check(String st)
{
	char arr[]=st.toCharArray();
	Arrays.sort(arr);
	st=new String(arr);
	for(char ch='a';ch<='z';ch++)
		if(st.indexOf(ch)!=-1)
			if(st.length()-st.replace(""+ch,"").length()!=(int)ch-96)
				return false;
	return true;
}

}

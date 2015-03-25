import java.util.*;
public class Sample{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
boolean check=true;
while(true){
	String st=in.nextLine();
	if(st!=null&&st.length()!=0)
		if(check)
			{
			int num=Integer.parseInt(st);
			if(num==42)
				check=false;
			else
				System.out.println(num);
			}
		else
			break;
	else
		break;
}

}

}
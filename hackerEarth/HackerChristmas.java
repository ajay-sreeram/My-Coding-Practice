//H-a*tan(@)/2;
//a,H,theta
import java.util.*;
public class HackerChristmas{
public static void main(String args[])throws Exception{
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	int a,H,theta;
	for(int i=0;i<t;i++){
		a=in.nextInt();
		H=in.nextInt();
		theta=in.nextInt();
		double val=Math.tan(Math.toRadians(theta));
		System.out.println((int)Math.round((H-((a*val)/2))));
	}
}
}

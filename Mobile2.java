import java.io.*;
import java.util.*;
public class Mobile2{
public static void main(String args[])throws IOException{
Scanner in=new Scanner(System.in);
int t=Integer.parseInt(in.nextLine());
int h,l,r;
int pos,cnt;
int walk=0;
boolean check;
for(int a=0;a<t;a++)
{
	String temp[]=in.nextLine().split(" ");
	h=Integer.parseInt(temp[0]);
	r=Integer.parseInt(temp[1]);
	l=Integer.parseInt(temp[2]);
	check=false;
	if(h%r==0)
		System.out.println(h/r);
	else{
		//System.out.println("hello");
		pos=r*(h/r);
		//System.out.println("pos:"+pos);
		cnt=1;
		walk=h/r;
		while(true)
		{
			pos=pos-cnt*l;
			walk+=cnt;
			if(pos<0)
			{
				check=true;
				break;
			}
			pos+=r;
			walk++;
			if(pos==h)
				break;
			if(pos<h)
				while(true)
				{
					pos+=r;
					if(pos>=h)
						break;
					walk++;
				}
			if(pos==h)
				break;
			cnt++;
		}
		if(check)
			System.out.println("Not Possible");
		else
			System.out.println(walk);
	}
}

}
}
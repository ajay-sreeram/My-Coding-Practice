import java.io.*;
public class Solution8
{
public static void main(String input1[])throws IOException
    {
    int a=input1.length;
	int array[]=new int[a];
	for(int i=0;i<a;i++)
	{
	  String x=input1[i];
	  int ia;
	  for(ia=0;ia<x.length();ia++){
	     if(x.charAt(ia)=='#')
			break;
	  }
	  String s1=x.substring(0,ia);
	  String s2=x.substring(ia+1,x.length());
	  int f=Integer.parseInt(s1);
	  int s=Integer.parseInt(s2);
	  if(f<4 || f>7)
	  System.out.println("ERROR");
	  if(s<0||s>11)
	  System.out.println("ERROR");
	  array[i]=f*12+s;
	
	}
	int count=0;
	for(int i=0;i<array.length;i++){
	for(int j=i+1;j<array.length;j++){
	if(array[i]>array[j])
	count++;
	}
	}
	System.out.println("RESULT:"+count);
	}
}

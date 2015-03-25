import java.io.*;

public class tech
{
public static void main(String args[])
{
//int input1[]=new int[]{3,4,2,5,1};
//int input1[]=new int[]{1,3,2};
int input1[]=new int[]{};

System.out.println(get_order(input1));
}
public static int get_order(int[] input1)
    {
       int i,j,k,n=input1.length;
       int temp;
       int count=0;
       int loc=0,val=0;
       for(i=n-1;i>0;i--)
       {
       if(sort(input1))
       break;
       for(j=0;j<n-1;j++)
       if(input1[j]>input1[j+1])
       if(input1[j+1]>val)
       {loc=j+1;val=input1[j+1];}
       System.out.println("value:"+val);
       for(k=loc;k>0;k--)
       input1[k]=input1[k-1];
       input1[k]=val;
	val=0;
for(k=0;k<n;k++)
System.out.print(" "+input1[k]);
System.out.println();
      count++;
       }
       return count;
       }
    public static boolean sort(int input[])
    {
    for(int i=0;i<input.length-1;i++)
    if(input[i]>input[i+1])
    return false;
    return true;
    }
}
import java.lang.*;
import java.util.*;
public class PermTry3
{
public static long counter=0;
public static void main(String[] args)
{
//int a[]=new int[]{1,4,5,2};
char a[]=new char[104];
int temp=0;
char c='a';
for(int i=0;i<104;i++)
{
	if(temp>3)
	{
		temp=0;
		c++;
	}
temp++;
a[i]=c;
//c++;
}

counter=0;
permute(a,0);
System.out.println("Finale count:"+counter);
}

public static void permute(char[] arr, int i)
{
    if (i == 16)//arr.length)
    {
       // System.out.println(Arrays.toString(arr));
	   //for(int x=0;x<16;x++)
	   //System.out.print(arr[x]+" ");
	   //System.out.println();
	   System.out.print(counter);
	   counter++;
    }
    for (int j = i; j <arr.length; j++)
    {
        swap(arr, i, j);      
        permute(arr, i + 1);  
        swap(arr, i, j);      
    }
} 
public static void swap(char[] arr, int i, int j)
{
    char tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}

}


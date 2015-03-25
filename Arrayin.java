//longest increasing sub sequence

import java.lang.*;
public class Arrayin
{
	public static void main (String args[])
	{
		int a[]= {1,20,3,4,5,6,7,8,7,6,5,4,7,8,9,10,11};
		int j=0,t;
		int b[]=new int[a.length];
		t=a[0];
		b[j]=t;
		j=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>t)
			{
				t=a[i];
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("array size="+j+"\n");
		for (int i=0;i<j;i++)
		{
			System.out.println(", "+b[i]);
		}
		
	}
}
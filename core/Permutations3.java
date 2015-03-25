import java.lang.*;
import java.util.*;
public class Permutations3
{
static int cnt=0;
static int resultlength=0;
public static void main(String[] args)
{
int a[]=new int[]{1,2,3,4,5,6,7,8,7,6,5,4,5,6,7,8,9,10,11};//{10,22,9,33,21,50,41,60,80}; 
int seq[]=new int[a.length];
for(int i=0;i<a.length;i++)
seq[i]=i+1;
int len=a.length;
for(;len>0;len--)
permute(a,seq,0,len);
//System.out.println("count:"+cnt);
}

public static void permute(int[] arr,int[] seq, int i,int len)
{
    if (i == len)
    {
		if(check(seq,len)==1&&check(arr,len)==1&&len>resultlength)
		{
		resultlength=len;
		System.out.println(len);
		//System.out.println(Arrays.toString(arr)+":::");
		System.exit(0);
		}
        //System.out.println(Arrays.toString(arr));
    }
    for (int j = i; j <arr.length; j++)
    {
        swap(arr, i, j); 
        swap(seq, i, j); 
		
        permute(arr,seq, i + 1,len);  
        swap(arr, i, j);   
        swap(seq, i, j); 
		
    }
} 
public static void swap(int[] arr, int i, int j)
{
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}

public static int check(int arr[],int  len)
{
for(int i=0;i<len-1;i++)
if(arr[i]<arr[i+1])
return 0;
return 1;
}

}


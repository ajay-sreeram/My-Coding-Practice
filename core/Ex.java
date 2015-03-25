import java.lang.*;
import java.util.*;
public class Ex
{
public static void main(String[] args)
{
int a[]=new int[]{1,4,5,2};
permute(a,0);


}

public static void permute(int[] arr, int i)
{
    if (i == arr.length)
    {
        System.out.println(Arrays.toString(arr));
int p,q,r,count=0;
for(p=1;p<arr.length;p++)
{
int sum1=0,sum2=0;
for(q=0;q<arr.length-p;q++)
sum1+=arr[q];
for(r=arr.length-1,count=0;count<p;count++,r--)
sum2+=arr[r];
//System.out.println("sum1:"+sum1+" sum2:"+sum2);
if(sum1==sum2)
System.out.println("true");
}


        return;
    }
    for (int j = i; j <arr.length; j++)
    {
        swap(arr, i, j);      
        permute(arr, i + 1);  
        swap(arr, i, j);      
    }
} 


public static void swap(int[] arr, int i, int j)
{
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}


}


import java.lang.*;
import java.util.*;
public class Permutations2
{
static int cnt=0;
public static void main(String[] args)
{
int a[]=new int[]{1,2,3,4};
permute(a,0);
System.out.println("count:"+cnt);
}

public static void permute(int[] arr, int i)
{
    if (i == arr.length-2)
    {cnt++;
        System.out.println(Arrays.toString(arr));
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


import java.lang.*;
import java.util.*;
public class Permutations2
{
public static long total=0;
public static void main(String[] args)
{
int a[]=new int[]{1,4,5,2};
total=0;
permute(a,0);
System.out.println("Total:"+total);
}

public static void permute(int[] arr, int i)
{
    if (i == arr.length-1)
    {
        //System.out.println(Arrays.toString(arr));
		for(int x=0;x<arr.length-1;x++)
		System.out.print(" "+arr[x]);
		System.out.println();
		total++;
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


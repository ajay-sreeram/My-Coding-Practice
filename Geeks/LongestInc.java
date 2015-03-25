public class LongestInc{
public static void main(String args[])
{
int arr[]=new int[]{ 10, 22, 9, 33, 21, 65, 41, 60 };
int n=arr.length;
System.out.println("RESULT:"+lis(arr,n));
}

public static int lis(int arr[],int n){
int lis[]=new int[arr.length];
int i,j;
for(i=0;i<arr.length;i++)
lis[i]=1;
for(i=1;i<arr.length;i++)
	for(j=0;j<i;j++)
		if(arr[i]>arr[j]&&lis[i]<lis[j]+1)
			lis[i]=lis[j]+1;
int max=0;
for(i=0;i<n;i++)
	if(max<lis[i])
		max=lis[i];
return max;
}



}

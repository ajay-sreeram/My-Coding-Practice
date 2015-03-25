import java.util.*;
public class ThirdMSc{
public static void main(String args[]){
System.out.println(Arrays.toString(getSubarray(new int[]{2, 1, 2, 2, 1, 2},1,1)));
}
public static int[] getSubarray(int arr[],int m,int n){
if(m>n)
	return null;
int temp[]=new int[arr.length];
int i,j,cnt=0;
for(i=0;i<arr.length;i++){
	if(arr[i]>=m&&arr[i]<=n){
			temp[i]=1;
			cnt++;
		}
}
int result[]=new int[cnt];
for(i=0,j=0;i<arr.length;i++)
	if(temp[i]==1)
		{
			result[j]=arr[i];
			j++;
		}

return result;
}
}

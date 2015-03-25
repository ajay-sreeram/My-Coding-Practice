public class SecondMSc{
public static void main(String args[]){
System.out.println(isSandwiched(new int[]{0, 2, 1, 6, 7, 9}));
}
public static int isSandwiched(int a[]){
if(a.length==0)
	return 0;
if(a.length==1)
	return 1;
if(a.length==2)
	if(a[0]<a[1])
		return 1;
	else
		return 0;
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(int i=1;i<a.length-1;i++)
{
	min=Math.min(min,a[i]);
	max=Math.max(max,a[i]);
}
if(a[0]<min&&a[a.length-1]>max)
	return 1;
else
	return 0;
}

}
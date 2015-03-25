public class LongIncSubSeq
{
public static void main(String args[])
{
 int arr[]=new int[]{10,2,9,33,21,50,41,60,80};
//{1,2,3,4,5,6,7,8,7,6,5,4,5,6,7,8,9,10,11} ;//
int i,j;
 int n=arr.length;
 int LS[]=new int[arr.length];
 for(i=0;i<n;i++)
   {
     LS[i]=1;
     for(j=0;j<i;j++)
       if(arr[i]>arr[j]&&LS[i]<=LS[j])
         LS[i]=LS[j]+1;
   }

for(i=0;i<n;i++)
System.out.println(LS[i]);

int largest=0;
 for(i=0;i<n;i++)
   if(largest<LS[i])
    largest=LS[i];
System.out.println("::"+ largest);
}
}

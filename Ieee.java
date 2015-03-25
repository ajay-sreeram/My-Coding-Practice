import java.util.*;
public class Ieee{
public static void main(String args[]){
int arr[]={1,5,3,4,2,1,5};
int i,j,k,n,m;
n=5;
m=3;
k=2;
List<Integer> list=new ArrayList<Integer>();

for(i=0;i<n;i++)
	list.add(min(arr,i,m,k));
		
System.out.println(Collections.min(list));

}

public static int min(int arr[],int i,int m,int k){

int tarr[]=new int[m];
for(int j=0,t=i;j<m;j++){
tarr[j]=arr[t];
t++;
}
//System.out.println(i+":"+Arrays.toString(tarr));
Arrays.sort(tarr);
return tarr[k-1];
}


}
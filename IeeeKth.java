import java.util.*;
public class IeeeKth{
public static void main(String args[]){
int arr[]={1,5,3,4,2};
int n,m,k,tk,p,i,j;
n=5;
m=3;
k=2;
tk=k;
int fullarr[]=new int[n+m-1];
for(i=0;i<n;i++)
	fullarr[i]=arr[i];
for(j=0;j<m-1;j++,i++)
	fullarr[i]=arr[j];
	//System.out.println(Arrays.toString(fullarr));
while(true){
p=kthSmall(arr,tk,0,arr.length-1);
//System.out.println("p:"+p);
int min=p;
for(i=0;i<arr.length;i++)
{
	if(fullarr[i]==p)
		{
			//System.out.println("pos:"+i);
			if(fun(fullarr,i,k,m,p))
				{System.out.println(p);return ;}
		}	
}

if(++tk==n)
	break;
}

}

public static boolean fun(int arr[],int pos,int k,int size,int num){
int i,j;
for(i=pos-size+1,j=0;j<size;j++,i++)
	{
		if(i<0)
			continue;
		//for(int p=i,q=0;q<size;q++,p++)
		//	System.out.print(arr[p]+" ");
		//System.out.println("pos fun:"+kthSmall(Arrays.copyOf(arr,arr.length),k,i,i+size-1));
		
		if(kthSmall(Arrays.copyOf(arr,arr.length),k,i,i+size-1)==num)
			return true;
	}
return false;
}


public static int kthSmall(int[]a, int k){
    if(k == a.length)   
        return a[a.length-1];
     
    else
        return kthSmall(a, k, 0, a.length-1);
}
 
 
public static int kthSmall(int[] a, int k, int start, int end){
 
	int j = start;
    int i = j-1;
     
    int pivot = a[end];
     
    for(;j<end;j++){
        if(a[j] < pivot){
            i++;
            swap(a, i, j);
        }
    }
     
    i++;
    swap(a, i, end);
   
    int small = i-start+1;
    if(small == k){
        return a[i];
    }else if(small > k){
        return kthSmall(a, k, start, i-1);
    }else{   //small is less than k
        return kthSmall(a, k-small, i+1, end);
    }
}
 
public static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

}
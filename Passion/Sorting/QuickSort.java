public class QuickSort{
public static void main(String args[]){
	//int i,j;
	int arr[]=new int[]{9,8,7,6,5,4,3,2,1,0};
	sort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
	}
}
public static void sort(int arr[],int low,int high){
if(low>=high)
	return;
int i,storeIndex=low;
int pivote=arr[high];
int tmp;
for(i=low;i<high;i++){
	if(arr[i]<pivote){
		tmp=arr[i];
		arr[i]=arr[storeIndex];
		arr[storeIndex]=tmp;
		storeIndex++;
	}
}
tmp=arr[high];
arr[high]=arr[storeIndex];
arr[storeIndex]=tmp;
sort(arr,low,storeIndex-1);
sort(arr,storeIndex+1,high);
}
}
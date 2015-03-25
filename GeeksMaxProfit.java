public class GeeksMaxProfit{
	public static void main(String args[]){
		int arr[][]=new int[][]{{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};
		System.out.println(maxProfit(arr,arr.length));
	}
	public static int maxProfit(int arr[][],int n){
		if(n<=1)
			return arr[n-1][2];
		int including=arr[n-1][2];
		int tmp=isNoConflict(arr,n);
		if(tmp!=-1)
			including+=maxProfit(arr,tmp+1);
		int excluding=maxProfit(arr,n-1);
		return max(including,excluding);
	}
	public static int max(int i,int j){
		if(i>j)
			return i;
		return j;
	}
	public static int isNoConflict(int arr[][],int i){
		for(int j=i-1;j>=0;j--)
			if(arr[j][1] <=arr[i-1][0])
				return j;
		return -1;
	}
}
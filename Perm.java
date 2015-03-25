import java.util.*;
public class Perm{
	
	public static void main(String args[]){
		int arr[]=new int[3];
		int given[]={1,2,3};
		for(int i=1;i<=given.length;i++)
			rec(arr,0,given,i);
		
	}
	public static void rec(int arr[],int d,int given[],int size){
		if(d==size){
			List<Integer> list=new LinkedList<Integer>();
			for(int i=0;i<d;i++){
				list.add(arr[i]);
			}
			res.add(list);
		}else{
			for(int i=0;i<given.length;i++){
				if(valid(arr,d,given[i])){
					arr[d]=given[i];
					rec(arr,d+1,given,size);
				}
			}
		}
	}
	public static boolean valid(int arr[],int len,int val){
		int i;
		for(i=0;i<len;i++){
			if(arr[i]>=val)
				return false;
		}
		return true;
	}
}
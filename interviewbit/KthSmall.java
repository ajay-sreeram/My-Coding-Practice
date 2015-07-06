import java.util.*;
public class KthSmall {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static void main(String args[]){
		int arr[]={8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
		List<Integer> a=new ArrayList<Integer>();
		//a.add(1);a.add(6);a.add(4);a.add(3);a.add(5);a.add(2);
		//a=Arrays.asList(arr);
		for (int index = 0; index < arr.length; index++)
		{
			a.add(arr[index]);
		}
		int t=kthsmallest(a,9);
		
	}
	
	public static int kthsmallest(final List<Integer> A, int k) {
	    int fp=-1,curmin=-1;
	    for(int i=0;i<k;i++){
	        int p=0,val=Integer.MAX_VALUE;
	        for(int j=0;j<A.size();j++){
	            int tmp=A.get(j).intValue();
	            if(j!=fp&&tmp>=curmin&&tmp<val){
					if(tmp==curmin){
						if(j>fp){
							val=tmp;
							p=j;
						}
					}else{
						val=tmp;
						p=j;
					}
	                
	            }
	        }
	        curmin=val;
	        fp=p;
			System.out.println(curmin);
	    }
	    return curmin;
	}
}

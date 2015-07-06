import java.util.*;
public class KthSmall {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static void main(String args[]){
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);a.add(6);a.add(4);a.add(3);a.add(5);a.add(2);
		int t=kthsmallest(3);
		
	}
	
	public static int kthsmallest(final List<Integer> A, int k) {
	    int fp=-1,val=Integer.MAX_VALUE,curmin=-1;
	    for(int i=0;i<k;i++){
	        int p=0;
	        for(int j=0;j<A.size();j++){
	            int tmp=A.get(j).intValue();
	            if(fp!=j&&tmp>=curmin&&tmp<=val){
	                val=tmp;
	                p=j;
	            }
	        }
	        curmin=val;
	        fp=p;
			System.out.println(curmin);
	    }
	    return curmin;
	}
}

import java.util.*;
public class Num {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(7);list.add(2);list.add(9);list.add(8);list.add(4);
		System.out.println(list);
		System.out.println("RES:"+twoSum(list,9));
	}
	public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    int x,y;
	    x=y=Integer.MAX_VALUE;
	    HashMap<StringBuilder,Integer> hm=new HashMap<StringBuilder,Integer>();
	    for(int i=0;i<A.size();i++){
	        hm.put(new StringBuilder(A.get(i)+" "+i),i);
	    }
		System.out.println(hm);
	    for(int i=0;i<A.size();i++){
	        int tmp=B-A.get(i).intValue();
	        if(hm.containsKey(new StringBuilder(A.get(i)+" "+i))){
	            int j=hm.get(new StringBuilder(A.get(i)+" "+i)).intValue();
				System.out.println("i:"+i+" j:"+j);
	            if(i<j){
    	            if(j<y){
    	                x=i;
    	                y=j;
    	            }else if(j==y&&i<x){
    	                x=i;
    	                y=j;
    	            }
	            }
	        }
	    }
	    if(x!=Integer.MAX_VALUE&&y!=Integer.MAX_VALUE){
	        list.add(x+1);
	        list.add(y+1);
	    }
	    return list;
	}
}

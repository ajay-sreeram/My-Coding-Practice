import java.util.*;
public class Intersect {
	// DO NOT MODIFY THE LISTS
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(100000);
		b.add(100000);
		System.out.println("RES:"+intersect(a,b));
	}
	public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=0,j=0;i<A.size()&&j<B.size();){
	        if(A.get(i)==B.get(j)){
	            list.add(A.get(i));
	            i++;j++;
	        }else if(A.get(i)<B.get(j)){
	            i++;
	        }else{
	            j++;
	        }
	    }
	    return list;
	}
}

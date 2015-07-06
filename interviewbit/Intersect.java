import java.util.*;
public class Intersect {
	// DO NOT MODIFY THE LISTS
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(10000000);
		b.add(10000000 );
		System.out.println("RES:"+intersect(a,b));
	}
	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
	    ArrayList<Integer> list=new ArrayList<Integer>();
		//System.out.println("A:"+A.size()+" B:"+B.size());
	    for(int i=0,j=0;i<A.size()&&j<B.size();){
			//System.out.println("A:"+A.get(i)+" B:"+B.get(i));
	        if(A.get(i).intValue()==B.get(j).intValue()){
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

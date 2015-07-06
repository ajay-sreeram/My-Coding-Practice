import java.util.*;
public class Comb {
    static ArrayList<ArrayList<Integer>> res;
	 public static void main(String[] args){
		 System.out.println(combine(9,7));
	 }
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
	    res=new  ArrayList<ArrayList<Integer>>();
	    aux(n,k,new ArrayList<Integer>(),1);
	    return res;
	}
	public static void aux(int n,int k,ArrayList<Integer> list,int index){
	    if(list.size()==k){
	        res.add(new ArrayList<Integer>(list));
	        return;
	    }
	    for(int i=index;i<=n;i++){
	        list.add(new Integer(i));
	        aux(n,k,list,i+1);
	        list.remove(list.size()-1);
	    }
	}
}

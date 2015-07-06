import java.util.*;
public class Pascal2 {
	public static void main(String args[]){
		
		System.out.println(generate(3));
	}
	public static ArrayList<ArrayList<Integer>> generate(int A) {
	    ArrayList<ArrayList<Integer>> listarray=new ArrayList<ArrayList<Integer>>();
	    for(int n=0;n<A;n++){
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        list.add(1);
	        int p=1;
	        for(int i=0;i<n;i++){
	            int tmp=p*(n-i)/(i+1);
	            list.add(tmp);
	            p=tmp;
	        }
			listarray.add(list);
	    }
		return listarray;
	}
}

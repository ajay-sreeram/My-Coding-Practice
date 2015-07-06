import java.util.*;
public class Rotate2df {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);
		list.add(arr);
		arr=new ArrayList<Integer>();
		arr.add(5);arr.add(6);arr.add(7);arr.add(8);
		list.add(arr);
		arr=new ArrayList<Integer>();
		arr.add(9);arr.add(10);arr.add(11);arr.add(12);
		list.add(arr);
		arr=new ArrayList<Integer>();
		arr.add(13);arr.add(14);arr.add(15);arr.add(16);
		list.add(arr);
		
		rotate(list);
		for(ArrayList<Integer> l:list){
			System.out.println(l);
		}
	}
	public static void rotate(ArrayList<ArrayList<Integer>> A) {
	    int n = A.size();
	    int T=0, L=0, R=n-1, B=n-1;
	    while (T<B)
	    {
			//System.out.println("T:"+T+" L:"+L);
			int i=1;
	        for (i=1;i<n-L;i++)
	        {
	            int temp1= A.get(T).get(L+i-1);
	            int temp2= A.get(B).get(R-i+1);
	            int temp3= A.get(T+i-1).get(R);
	            int temp4= A.get(B-i+1).get(L);
	            A.get(T).set(L+i-1,temp4);
	            A.get(B).set(R-i+1,temp3);
	            A.get(B-i+1).set(L,temp2);
	            A.get(T+i-1).set(R,temp1);
	        }
			System.out.println("i:"+i);
	        L++;
	        T++;
	        B--;
	        R--;
	    }
    }
}
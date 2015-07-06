import java.util.*;
public class NextPerm {
	public static void main(String args[]){
		int arr[]={ 251, 844, 767, 778, 658, 337, 10, 252, 632, 262, 707, 506, 701, 475, 410, 696, 631, 903, 516, 149, 344, 101, 42, 891, 991 };
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			list.add(arr[i]);
		//Arrays.asList(arr); 
		
		nextPermutation(list);
		
	}
	public static void nextPermutation(ArrayList<Integer> A) {
	    int p,q;
	    p=-1;
	    int i;
	    for(i=0;i<A.size()-1;i++){
	        if(A.get(i)<A.get(i+1))
	            p=i;
	    }
	    if(p==-1){
	        Collections.sort(A);
	        return;
	    }
	    int j=0;
	    for(j=A.size()-1;j>p;j--){
	        if(A.get(j)>A.get(p))
	            break;
	    }
	    q=j;
		System.out.println("p:"+p+" q:"+q+" size:"+A.size());
		System.out.println(A);
	    int tmp=A.get(p);
	    A.set(p,A.get(q));
	    A.set(q,tmp);
		System.out.println(A);
	    for(i=p+1,j=A.size()-1;i<=j;i++,j--){
	        tmp=A.get(i);
	        A.set(i,A.get(j));
	        A.set(j,tmp);
	    }
	}
}

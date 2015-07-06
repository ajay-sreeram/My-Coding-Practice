import java.util.*;
public class Plus1 {
	public static void main(String args[]){
		ArrayList<Integer> a=new <Integer>ArrayList();
		a.add(new Integer("1"));a.add(new Integer("2"));a.add(new Integer("3"));
		
		System.out.println(plusOne(a));
	}
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    String st="";
	    for(int n:A)
	        st=st+n;
	    A.clear();
	    char arr[]=st.toCharArray();
	   // Arrays.sort(arr);
	   for(int i=A.size()-1;i>=0;i--){
	       if(A.get(i).intValue()==9){
	           A.set(i,0);
	       }else{
			   System.out.println(A);
	           A.set(i,A.get(i).intValue()+1);
	           return fun(A,new <Integer>ArrayList());
	       }
	   }
	   ArrayList<Integer> nw=new <Integer>ArrayList();
	   nw.add(1);
	   for(int i=0;i<A.size();i++)
	    nw.add(0);
	   return nw;
	    
	}
	public static ArrayList<Integer> fun(ArrayList<Integer> A,ArrayList<Integer> nw){
	    int i=0;
	    for(i=0;i<A.size();i++)
	        if(A.get(i)!=0)
	            break;
	    for(;i<A.size();i++){
	        nw.add(A.get(i));
	    }
	    return nw;
	}
}

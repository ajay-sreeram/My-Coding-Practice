import java.util.*;
class Num implements Comparable<Num> {
    String n;
    public Num(int n){
        this.n=""+n;
    }
	public String toString(){
		return n;
	}
    public int compareTo(Num no){
		int i=0;
		for(i=0;i<n.length()&&i<no.n.length();i++){
			if(n.charAt(i)>no.n.charAt(i))
				return 1;
			else
				return -1;
		}
		if(i==n.length()&&i==no.n.length())
			return 0;
		else if(i==n.length()){
			if(no.n.charAt(i-1)>no.n.charAt(i)){
				return -1;
			}else{
				return 1;
			}
		}else if(i==no.n.length()){
			if(n.charAt(i-1)>n.charAt(i)){
				return 1;
			}else{
				return -1;
			}
		}else
			return 0;
    }
}

public class LargeNum {
	// DO NOT MODIFY THE LIST
	public static void main(String args[]){
		List<Integer> list=new ArrayList<Integer>();
	int arr[]={ 3, 36, 34, 5, 9 };
	for(int i=0;i<arr.length;i++)
		list.add(arr[i]);
	System.out.println(largestNumber(list));
	}
	public static String largestNumber(final List<Integer> list) {
	    String res="";
		List<Num> A=new <Num>ArrayList();
		for(int n:list){
			A.add(new Num(n));
		}
	    Collections.sort(A ,Collections.reverseOrder() );
	    System.out.println(A);
	    // Collections.reverse(A);
		//System.out.println(a
	    if(Integer.parseInt(A.get(0)+""+A.get(1))>Integer.parseInt(A.get(1)+""+A.get(0))){
	        res=A.get(0)+""+A.get(1);
	    }else{
	        res=A.get(0)+""+A.get(1);
	    }
		
	    for(int i=2;i<A.size();i++){
	         if(Integer.parseInt(A.get(i)+res)>Integer.parseInt(res+A.get(i))){
	             res=res+A.get(i);
	         }else{
	             res=res+A.get(i);
	         }
	    }
	    return res;
	    /*Num arr[]=new Num[A.size()];
	    int i=0;
	    for(int num:A){
	        arr[i]=new Num(num);
	        i++;
	    }
	    Arrays.sort(arr);
	    String res="";
	    for(i=arr.length-1;i>=0;i--){
	        res=res+arr[i].n;
	    }
	    return res;
	    */
	}
}

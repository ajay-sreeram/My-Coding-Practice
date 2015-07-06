import java.util.*;
public class RepNonRep {
	public static void main(String args[]){
	int arr[]={3, 1, 2, 5, 3};
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
		list.add(arr[i]);
	System.out.println(repeatedNumber(list));
	}
	// DO NOT MODIFY THE LIST
	public static  ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	    
	    long sumOfArray = 0, sumOfN = 0, sumOfNsq = 0, sumOfSquares = 0;
	    
	    int size = A.size();
	    
	    sumOfN = ((long)size * ((long)size+1))/2;
	    
	    sumOfNsq = (((2 * (long)size) + 1) * sumOfN)/3;
	    
	    int val = 0;
	    
	    for(int i=0; i< size;i++)
	    {
	        val = A.get(i);
	        
	        sumOfArray = sumOfArray + (long) val;
	        
	        sumOfSquares = sumOfSquares + (long) (val*val);
	    }
	    
	    long x = 0 , y = 0;
	    
	    x = (sumOfArray - sumOfN);
	    
	    y = (sumOfSquares - sumOfNsq);
	    
	    int ans1 = 0 , ans2 = 0;
	    
	    ans1 = (int)((y + (x * x))/(2*x));
	    
	    ans2 = (int)((y - (x * x))/(2*x));
	    
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    
	    for(int j=0;j<size-1;j++)
	    {
	        if(A.get(j) == ans1)
	        {
	            ans.add(ans1);
                ans.add(ans2);
                break;
	        }
	        
	        if(A.get(j) == ans2)
	        {
	            ans.add(ans2);
                ans.add(ans1);
                break;
	        }
	    }
	    
        return ans;
        
	}
}
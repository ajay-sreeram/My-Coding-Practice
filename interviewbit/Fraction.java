import java.util.*;
public class Fraction {
	public static void main(String args[]){
		Fraction s=new Fraction();
		System.out.println(s.fractionToDecimal(1,-2));
	}
	public String fractionToDecimal(int n1, int d1) {
	    if(n1==0)
	        return "0";
	    if(d1==0)
	        return "";
	    long n=n1,d=d1;
		int tmp=n1/d1;
	    String result=""+tmp;
	   /*  if ((n < 0) ^ (d < 0)) {
    		result += "-";
    	} */
	    n=Math.abs(n);
	    d=Math.abs(d);
	    //result+=String.valueOf((long)(n/d));
	    
	    long rem=(n%d)*10;
	    if(rem==0)
	        return result;
	    HashMap<Long,Integer> hm=new HashMap<Long,Integer>();
	    result+=".";
	    while(rem!=0){
	        if(hm.containsKey(rem)){
	            int beg=hm.get(rem);
	            String p1=result.substring(0, beg);
	            String p2 = result.substring(beg, result.length());
			    result = p1 + "(" + p2 + ")";
			    return result;
	        }
	        hm.put(rem,result.length());
	        Long res=rem/d;
	        result=result+res;
	        rem=(rem%d)*10;
	    }
	    return result;
	}
}

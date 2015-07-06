public class Shifts {
	public static void main(String args[]){
		System.out.println(".x.x.x..x");
		System.out.println(seats(".x.x.x..x"));
	}
	public static int seats(String A) {
	    int prevsize,nextsize,cntgaps,shifts;
	    prevsize=nextsize=cntgaps=shifts=0;
	    for(int i=0;i<A.length();i++){
	        if(A.charAt(i)=='.'){
	            cntgaps++;
	        }else{
	            while(i<A.length()&&A.charAt(i)=='x'){
	                nextsize++;
	                i++;
	            }
	            if(i<A.length())
	                i--;
	            if(prevsize<=nextsize){
	                shifts+=prevsize*cntgaps;
					cntgaps=0;
				}
	            else{
	                shifts+=nextsize*cntgaps;
				}
				System.out.println("prev:"+prevsize+" next:"+nextsize+" shifts:"+shifts);
	            prevsize+=nextsize;
	            //cntgaps=0;
	            nextsize=0;
	        }
	    }
	    return shifts;
	}
}

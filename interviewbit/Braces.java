import java.util.*;
public class Braces {
	public static void main(String args[]){
		System.out.println(braces("(a+(a+b))"));
	}
	public static int braces(String st) {
	    Stack<Integer> stk=new Stack<Integer>();
	    stk.push(0);
	    for(int i=0;i<st.length();i++){
	        char ch=st.charAt(i);
	        if(ch=='('){
	            stk.push(0);
	        }else if(ch==')'){
				int tmp=stk.pop().intValue();
	            if(tmp==0){
					return 1;
				}
	             System.out.println("::"+tmp);
	        }else{
	            stk.push(stk.pop()+1);
	        }
	    }
		int tmp=stk.pop().intValue();
		System.out.println("HELLO"+tmp);
		
	    return tmp==0?1:0;
	}
}

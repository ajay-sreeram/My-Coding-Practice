import java.util.*;
public class SimplifyPath {
	public static void main(String args[]){
		System.out.println("/a/./b/../../c/");
		System.out.println(simplifyPath("/a/./b/../../c/"));
	}
	public static String simplifyPath(String A) {
	    if(A.length()==0)
	        return "/";
	    int n=A.length(),start=0;
	    Stack<String> stack=new Stack<String>();
	    while(start<n){
	        while(start<n&&A.charAt(start)=='/')
	            start++;
	        if(start==n)
	            break;
	        int end=start;
	        while(end<n&&A.charAt(end)!='/')
	            end++;
	        String folder=A.substring(start,end);
			System.out.println(folder);
	        if(folder.equals("..")){
	            if(stack.size()!=0)
	                stack.pop();
	        }else if(!folder.equals(".")){
	            stack.push("/"+folder);
	        }
	        start=end;
	    }
	    if(stack.size()==0)
	        return "/";
	    StringBuilder sb=new StringBuilder();
	    while(!stack.isEmpty()){
	        sb.append(stack.pop());
	    }
	    return sb.toString();
	}
}

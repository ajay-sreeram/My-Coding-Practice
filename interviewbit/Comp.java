import java.util.*;
public class Comp {
	public static void main(String[] args){
		System.out.println(compareVersion("13.0","13.0.8"));
	}
	public static int compareVersion(String A, String B) {
		String arr1[];
	    String arr2[];
	    if(A.contains(".")){
			A=A.replace('.',' ');
	        arr1=A.split(" ");
		}else{
		    arr1=new String[1];
	        arr1[0]=A;
	    }
		
		if(B.contains(".")){
			B=B.replace('.',' ');
	        arr2=B.split(" ");
	    }else{
	        arr2=new String[1];
	        arr2[0]=B;
	    }
	    int i=0,j=0;
			System.out.println(Arrays.toString(arr2)+" "+B);
	        System.out.println("A:"+arr1.length+" B:"+arr2.length);
	    for(i=0,j=0;i<arr1.length&&j<arr2.length;i++,j++){
	        int n1=Integer.parseInt(arr1[i]);
	        int n2=Integer.parseInt(arr2[j]);
	        if(n1>n2)
	            return 1;
	        if(n1<n2)
	            return -1;
	    }
			System.out.println("i:"+i+" j:"+j);
	    
	    if(arr1.length==arr2.length)
	        return 0;
	    if(i==arr1.length){
	        while(j<arr2.length){
	            if(Integer.parseInt(arr2[j])!=0)
	                return -1;
	           j++;
	        }
	    }
	    else if(j==arr2.length){
	        while(i<arr1.length){
	            if(Integer.parseInt(arr1[i])!=0)
	                return 1;
	            i++;
	        }
	    }
	    return 0;
	}
}

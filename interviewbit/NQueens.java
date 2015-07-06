import java.util.*;
public class NQueens {
    static ArrayList<ArrayList<String>> res;
	public static void main(String args[]){
		
		ArrayList<ArrayList<String>> aa=solveNQueens(4);
		for(ArrayList<String> a1:aa){
			for(String a2:a1){
				System.out.println(a2);
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<String>> solveNQueens(int A) {
	    res=new ArrayList<ArrayList<String>>();
	    if(A==1){
	        ArrayList<String> list=new ArrayList<String>();
	        list.add("Q");
	        res.add(list);
	        return res;
	    }
	    boolean arr[][]=new boolean[A][A];
	    solve(arr,0,0);
	    return res;
	}
	public static void solve(boolean arr[][],int r,int c){
	    if(r==arr.length){
			
    	    if(solved(arr)){
    	        ArrayList<String> list=new ArrayList<String>();
    	        for(int i=0;i<arr.length;i++){
    	            StringBuilder sb=new StringBuilder("");
    	            for(int j=0;j<arr.length;j++){
    	                if(arr[i][j])
    	                    sb.append('Q');
    	                else
    	                    sb.append('.');
    	            }
    	            list.add(sb.toString());
    	        }
    	        res.add(list);
				//System.out.println("r:"+r+" c:"+c);
    	        return;
    	    }
    	    return;
	    }
	    for(int i=r;i<arr.length;i++){
	        for(int j=0;j<arr.length;j++){
	            if(valid(arr,i,j)){
	                arr[i][j]=true;
					//if(i==arr.length-1)
						//System.out.println("r:"+i+" c:"+j);
	                solve(arr,i+1,j+1);
	                arr[i][j]=false;
	            }
	        }
	    }
	}
	public static boolean solved(boolean arr[][]){
	    for(int i=0;i<arr.length;i++){
	        int j=0;
	        for(j=0;j<arr.length;j++)
	            if(arr[i][j])
	                break;
	        if(j==arr.length)
	            return false;
	    }
	    return true;
	}
	public static boolean valid(boolean arr[][],int r,int c){
	    if(arr[r][c])
	        return false;
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i][c]||arr[r][i])
	                return false;
	        for(int j=0;j<arr.length;j++){
	            if(i-r==j-c||i+j==r+c){
	                if(arr[i][j])
	                    return false;
	            }
	        }
	    }
		if(r==arr.length-1)
			System.out.println("r1:"+r+" c1:"+c);
	    return true;
	}
}

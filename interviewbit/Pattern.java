import java.util.*;
public class Pattern {
	public static void main(String args[]){
		prettyPrint(3);
	}
	public static ArrayList<ArrayList<Integer>> prettyPrint(int nn) {
	    int arr[][]=new int[2*nn-1][2*nn-1];
	    int size=2*nn-1;
	    int p,q;
	    p=q=size/2;
	    int cnt=1;
		//System.out.println("p:"+p+" q:"+q);
	    for(int num=1;num<=nn;num++){
	        int r,c,n;
			r=p;c=q;
	        for(n=1;n<=cnt;n++,c++){
	            arr[r][c]=num;
	        }
			c--;
			r++;
	        for(n=1;n<=cnt-1;n++,r++){
	            arr[r][c]=num;
	        }
			r--;
			c--;
	        for(n=1;n<=cnt-1;n++,c--){
	            arr[r][c]=num;
	        }
			c++;
			r--;
	        for(n=1;n<=cnt-1;n++,r--){
	            arr[r][c]=num;
	        }
			r++;
	        p--;q--;cnt+=2;
			
			//System.out.println("--------------------");
	    }
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<arr.length;i++){
				ArrayList<Integer> tlist=new ArrayList<Integer>();
				for(int j=0;j<arr.length;j++)
					tlist.add(arr[i][j]);
					//System.out.print(arr[i][j]+" ");
				//System.out.println();
				list.add(tlist);
			}
		System.out.println(list);
		return null;
	}
}

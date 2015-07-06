import java.util.*;
class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
	public String toString(){
		return "("+x+","+y+")";
	}
}
public class Zero {
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp=new ArrayList<Integer>();
		tmp.add(0);tmp.add(0);
		arr.add(tmp);
		tmp=new ArrayList<Integer>();
		tmp.add(1);tmp.add(1);
		arr.add(tmp);
		setZeroes(arr);
		System.out.println(arr);
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> A) {
	    int i,j;
	   List<Point> ps=new ArrayList<Point>();
	    for(i=0;i<A.size();i++){
	        for(j=0;j<A.get(i).size();j++){
	            if(A.get(i).get(j)==0)
	                ps.add(new Point(i,j));
	        }
	    }
		System.out.println(ps);
	    for(Point p:ps){
	        for(i=0;i<A.size();i++)
	            A.get(i).set(p.y,0);
	        for(i=0;i<A.get(0).size();i++)
	            A.get(p.x).set(i,0);
			System.out.println(p+" : "+A);
	    }
	   
		/* int i,j;
	    for(i=0;i<A.size();i++){
	        for(j=0;j<A.get(i).size();j++){
	            if(A.get(i).get(j)==0){
					//System.out.println("i:"+i+" j:
	                for(int k=0;k<A.get(i).size();k++)
	                    A.get(i).set(k,-1);
	               for(int k=0;k<A.size();k++)
	                    A.get(k).set(j,-1);
	            }
	        }
	    }
		System.out.println(A);
	    for(i=0;i<A.size();i++){
	        for(j=0;j<A.get(i).size();j++)
	            if(A.get(i).get(j)==-1)
	                A.get(i).set(j,0);
	    } */
	}
}

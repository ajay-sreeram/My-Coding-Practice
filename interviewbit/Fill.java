import java.util.*;
class Cell{
    int first,second;
    public Cell(int f,int s){
        this.first=f;
        this.second=s;
    }
}
public class Fill {
	public static void main(String args[]){
		Fill f=new Fill();
		ArrayList<ArrayList<Character>> arr=new ArrayList<ArrayList<Character>>();
		ArrayList<Character> c=new ArrayList<Character>();
		c.add('O');
		arr.add(c);
		c=new ArrayList<Character>();
		c.add('O');
		arr.add(c);
		f.solve(arr);
		System.out.println(arr);
	}
	public void solve(ArrayList<ArrayList<Character>> A) {
	    if(A==null||A.size()==0||A.get(0).size()==0)
	        return;
	    for(int i=0;i<A.get(0).size();i++)
	        if(A.get(0).get(i).charValue()=='O')
	            mark(A,0,i);
	     for(int i=0;i<A.size();i++)
	        if(A.get(i).get(0).charValue()=='O')
	            mark(A,i,0);
	   
	    for(int i=0;i<A.get(A.size()-1).size();i++)
	        if(A.get(A.size()-1).get(i).charValue()=='O')
	            mark(A,A.size()-1,i);
	    for(int i=0;i<A.size();i++)
	        if(A.get(i).get(A.get(i).size()-1).charValue()=='O')
	            mark(A,i,A.size()-1);
	    
		for(int i = 0; i < A.size(); ++i) {
            for(int j = 0; j < A.get(i).size(); ++j) {
                if(A.get(i).get(j).charValue()== 'O') {
                    A.get(i).set(j,'X');
                } else if(A.get(i).get(j).charValue()== 'A') {
                    A.get(i).set(j,'O');
                }
            }
        }
	}
	public void mark(ArrayList<ArrayList<Character>> A,int r,int c){
	    int x[]={-1,0,1,0};
	    int y[]={0,1,0,-1};
	    Stack<Cell> stack=new Stack<Cell>();
	    stack.push(new Cell(r,c));
		
	    while(!stack.isEmpty()){
	        Cell p=stack.pop();
	        A.get(p.first).set(p.second,'A');
			//System.out.println(A);
	    
	        for(int i=0;i<x.length;i++){
	            if(p.first + x[i] >= 0 && p.first + x[i] < A.size() && p.second + y[i] >= 0 && p.second +y[i] < A.get(p.first + x[i]).size() && A.get(p.first+x[i]).get(p.second+y[i]).charValue() == 'O') {
                    stack.push(new Cell(p.first+x[i],p.second+y[i]));
                }
	        }
	    }
	}
}

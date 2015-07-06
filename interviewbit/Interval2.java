 import java.util.*;
 class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
	  public String toString(){
		  return "("+start+", "+end+")";
	  }
  }
 
public class Interval2 {
	public static void main(String args[]){
		ArrayList<Interval> list=new ArrayList<Interval>();
		list.add(new Interval(1,10));
		list.add(new Interval(2,9));
		list.add(new Interval(3,8));
		list.add(new Interval(4,7));
		list.add(new Interval(5,6));
		list.add(new Interval(6,6));
		System.out.println(merge(list));
	}
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int arr[]=new int[intervals.size()*2];
        char se[]=new char[intervals.size()*2];
        int i=0;
        for(Interval in:intervals){
            arr[i]=in.start;
            se[i++]='s';
            arr[i]=in.end;
            se[i++]='e';
        }
        sort(arr,se);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(se));
        ArrayList<Interval> list=new ArrayList<Interval>();
        i=0;
        int s,e;
        while(i<arr.length){
            s=arr[i];
            i++;
            while(i<arr.length&&se[i]!='e')
                i++;
            while(i<arr.length&&se[i]!='s')
                i++;
            i--;
			if(list.size()==0)
				list.add(new Interval(s,arr[i]));
			else{
				
				if(list.get(list.size()-1).end==s){
					int tmp=list.get(list.size()-1).start;
					list.remove(list.size()-1);
					list.add(new Interval(tmp,arr[i]));
				}else{
					list.add(new Interval(s,arr[i]));
				}
			}
            i++;
        }
		/* if(intervals.size()!=list.size())
			return merge(list);
		else */
			return list;
    }
    public static void sort(int arr[],char se[]){
        int n = arr.length;
        int c,d;
        for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (arr[d] > arr[d+1]) /* For descending order use < */
				{
					int t=arr[d+1];
        			arr[d+1]=arr[d];
        			arr[d]=t;
        			char ch=se[d+1];
        			se[d+1]=se[d];
        			se[d]=ch;
        		}
        	}
        }
    }
}

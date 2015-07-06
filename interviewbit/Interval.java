import java.util.*;
import java.io.*;
class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }

public class Interval {
	public static void main(String args[]){
		ArrayList<Interval> in=new ArrayList<Interval>();
		in.add(new Interval(1,2));
		in.add(new Interval(3,6));
		System.out.println(insert(in));
	}
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval nextin) {
        int p1=-1,p2=-1;
        int s1=-1,s2=-1;
        Interval ni;
        if(nextin.start<nextin.end){
            ni=new Interval(nextin.start,nextin.end);
        }else{
            ni=new Interval(nextin.end,nextin.start);
        }
        
        for(int i=0;i<intervals.size();i++){
            Interval tmp=intervals.get(i);
            if(tmp.start>=ni.start){
                s1=0;
                p1=i;
            }
            if(tmp.end>=ni.start){
                s1=1;
                p1=i; 
            }
            if(tmp.start>=ni.end){
                s2=0;
                p2=i;
            }
            if(tmp.end>=ni.end){
                s2=1;
                p2=i; 
            }    
        }
        if(p1==p2)
            return intervals;
        if(s1==1&&s2==0){
            ArrayList<Interval> tmp=new ArrayList<Interval>();
            for(int i=p1;i<p2;i++){
                tmp.add(intervals.get(i));
            }
            Interval nw=new Interval(tmp.get(0).start,ni.end);
            for(Interval t:tmp)
                intervals.remove(t);
            intervals.add(nw);
            return intervals;
        }
        else if(s1==0&&s1==1){
            ArrayList<Interval> tmp=new ArrayList<Interval>();
            for(int i=p1;i<=p2;i++){
                tmp.add(intervals.get(i));
            }
            for(Interval t:tmp)
                intervals.remove(t);
            intervals.add(ni);
            return intervals;
        }
        else if(s1==0&&s2==0){
            ArrayList<Interval> tmp=new ArrayList<Interval>();
            for(int i=p1;i<p2;i++){
                tmp.add(intervals.get(i));
            }
            for(Interval t:tmp)
                intervals.remove(t);
            intervals.add(ni);
            return intervals;
        }
        else if(s1==1&&s2==1){
            ArrayList<Interval> tmp=new ArrayList<Interval>();
            for(int i=p1;i<=p2;i++){
                tmp.add(intervals.get(i));
            }
            Interval nw=new Interval(tmp.get(0).start,tmp.get(tmp.size()-1).end);
            for(Interval t:tmp)
                intervals.remove(t);
            intervals.add(nw);
            return intervals;
        }
        intervals.add(ni);
        return  intervals;
    }
}

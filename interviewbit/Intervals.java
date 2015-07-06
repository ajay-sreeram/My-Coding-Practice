import java.util.*;
import java.io.*;
class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
	 public String toString(){
		 return "("+start+","+end+")";
	 }
 }
public class Intervals {
	public static void main(String args[]){
		ArrayList<Interval> in=new ArrayList<Interval>();
		in.add( new Interval(6037774, 6198243));
 in.add(new Interval(6726550, 7004541));
 in.add(new Interval(8842554, 10866536));
 in.add(new Interval(11027721, 11341296));
 in.add(new Interval(11972532, 14746848));
 in.add(new Interval(16374805, 16706396));
 in.add(new Interval(17557262, 20518214));
 in.add(new Interval(22139780, 22379559));
 in.add(new Interval(27212352, 28404611));
 in.add(new Interval(28921768, 29621583));
 in.add(new Interval(29823256, 32060921));
 in.add(new Interval(33950165, 36418956));
 in.add(new Interval(37225039, 37785557));
 in.add(new Interval(40087908, 41184444));
 in.add(new Interval(41922814, 45297414));
 in.add(new Interval(48142402, 48244133));
 in.add(new Interval(48622983, 50443163));
 in.add(new Interval(50898369, 55612831));
 in.add(new Interval(57030757, 58120901));
 in.add(new Interval(59772759, 59943999));
 in.add(new Interval(61141939, 64859907));
 in.add(new Interval(65277782, 65296274));
 in.add(new Interval(67497842, 68386607));
 in.add(new Interval(70414085, 73339545));
 in.add(new Interval(73896106, 75605861));
 in.add(new Interval(79672668, 84539434));
 in.add(new Interval(84821550, 86558001));
 in.add(new Interval(91116470, 92198054));
 in.add(new Interval(96147808, 98979097));
		
		System.out.println(insert(in,new Interval(36210193, 61984219)));
	}
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval nextin) {
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
            if(ni.start>=tmp.start)
                p1=i;
            if(tmp.start<ni.end&&ni.end<=tmp.end)
                p2=i;
        }
		//System.out.println("p1:"+p1+" p2:"+p2);
        if(p1>=0&&p2>=0){
            Interval tmp=new Interval(Math.min(intervals.get(p1).start,ni.start),Math.max(ni.end,intervals.get(p2).end));
            ArrayList<Interval> ta=new <Interval>ArrayList();
            for(int i=p1;i<=p2;i++)
                ta.add(intervals.get(i));
			//System.out.println("TA:"+ta.size()+" Interval Size"+intervals.size());
            
			for(Interval t:ta){
			//	System.out.println("HELLO: "+t);
			  intervals.remove(t);
			}
			
			//System.out.println("TA:"+ta.size()+" Interval Size"+intervals.size());
            System.out.println("TMP:"+tmp);
			intervals.add(tmp);
            return intervals;
        }
       /* for(int i=0;i<intervals.size();i++){
            Interval tmp=intervals.get(i);
            if(ni.start<=tmp.start)
                p1=i;
            if(ni.end>=tmp.start)
                p2=i;
        }
        if(p1>=0&&p2>=0){
            //Interval tmp=new Interval(Math.min(intervals.get(p1).start,ni.start),Math.max(ni.end,intervals.get(p2).end));;
            ArrayList<Interval> ta=new <Interval>ArrayList();
            for(int i=p1;i<=p2;i++)
                ta.add(intervals.get(p1));
            for(Interval t:ta)
                intervals.remove(t);
          
            return intervals;
        }*/
          intervals.add(ni);
        return intervals;
    }
}

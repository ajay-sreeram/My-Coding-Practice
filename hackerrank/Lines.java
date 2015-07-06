import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Line implements Comparable<Line>{
    int s,e;
    int ol;
    public Line(int s,int e){
        this.s=s;
        this.e=e;
        ol=0;
    }
    public int compareTo(Line L){
        return ol-L.ol;
    }
	public int compare(Line l1,Line l2){
		return l1.ol-l2.ol;
	}
	public boolean equals(Line L){
		return ol==L.ol;
	}
}
public class Lines {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n=Integer.parseInt(in.nextLine());
        Line arr[]=new Line[n];
        for(int t=0;t<n;t++){
           String arrs[]=in.nextLine().split(" ");
            arr[i]=new Line(Integer.parseInt(arrs[0]),Integer.parseInt(arrs[1]));
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i].s>=arr[j].s&&arr[i].s<=arr[j].e)||(arr[i].e>=arr[j].s&&arr[i].e<=arr[j].e)){
                    arr[i].ol++;
                    arr[j].ol++;
                }
            }
        }
        Collections.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i].ol!=0)
                   break;
        }
       System.out.println(i+1);
    }
}
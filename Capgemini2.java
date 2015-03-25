import java.util.*;
public class Capgemini2{
static double exp=0;
static int imp[];
static double val[][];
static int n;
public static void main(String args[]){
n=10;
imp=new int[]{1,2,3,4,5,6,7,8,9,10};
long l1=System.nanoTime();
sum(0,n-1);
long l2=System.nanoTime();
System.out.println(exp);
System.out.println((double)(l2-l1)/10000);


}

public static void sum(int x,int y){
if(x>=n||y<0||y<x){
return;
}
if(x==y){
exp=exp+imp[x];
return;
}
exp=(exp + 0.5*imp[x] + 0.5*imp[y]);
sum(x+2,y);
sum(x+1,y-1);
sum(x,y-2);
sum(x+1,y-1);
return;
}

}

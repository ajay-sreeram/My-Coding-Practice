import java.util.*;
public class Capgemini{
static double exp=0;
static int imp[];
static double val[];
static int n;
public static void main(String args[]){
n=6;
for(n=3;n<21;n+=2)
{
imp=new int[n];
val=new double[n];
sum(0,n-1);
for(int i=0;i<val.length;i++)
val[i]*=2;
System.out.println(Arrays.toString(val));

}
}

public static void sum(int x,int y){
if(x>=n||y<0||y<x){
return;
}
if(x==y){
exp=exp+imp[x];
//System.out.println("x:"+x+"y:"+y+Arrays.toString(val));
val[x]+=1;
return;
}
val[x]+=0.5;
val[y]+=0.5;
//System.out.println("x:"+x+"y:"+y+Arrays.toString(val));
exp=(exp + 0.5*imp[x] + 0.5*imp[y]);
sum(x+2,y);
sum(x+1,y-1);
sum(x,y-2);
sum(x+1,y-1);
return;
}

}
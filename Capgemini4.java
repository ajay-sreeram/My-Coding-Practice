import java.util.*;
public class Capgemini4{
static double exp=0;
static int imp[];
static double val[][];
static int n;
public static void main(String args[]){
n=10;
imp=new int[]{1,2,3,4,5,6,7,8,9,10};
val=new double[n][n];
long l1=System.nanoTime();
exp=sum(0,n-1);
long l2=System.nanoTime();
System.out.println(exp);
System.out.println((double)(l2-l1)/10000);

}
public static double sum(int x,int y){
if(y<x||x>=n||y<0){
return 0;
}
if(val[x][y]!=0)
return val[x][y];
if(x==y){
return imp[x];
}
double temp=0.5*imp[x] + 0.5*imp[y];
temp+=sum(x+2,y);
temp+=2*sum(x+1,y-1);
temp+=sum(x,y-2);
val[x][y]=temp;
return temp;
}

}

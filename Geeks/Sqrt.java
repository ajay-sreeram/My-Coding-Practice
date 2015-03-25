public class Sqrt{
public static void main(String args[]){
double n=81;
System.out.println("RESULT SQRT:"+squareRoot(n));
}
public static double squareRoot(double n){
double x=n;
double y=1;
double e=0.000001;
while(x-y>e){
x=(x+y)/2;
y=n/x;
}
return x;
}
}
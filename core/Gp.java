public class Gp
{
public static void main(String args[]){
int input[] = {3,15,80,296,582,1184};
        System.out.println("The odd man is : " + findOddManOut(input));
}
public static int findOddManOut(int[] input) {
double r1,r2,r3,r;
r1=input[1]/input[0];
r2=input[2]/input[1];
r3=input[3]/input[2];
if(r1==r2)
r=r1;
else if(r2==r3)
r=r2;
else
r=r3;
double x,y,a=1;
x=input[0]*r;
y=input[0]*r*r;
if(x==input[1]||y==input[2])
a=input[0];
else
{ x=input[1]/r;
  y=input[2]*r;
  if(x==input[0]||y==input[2])
  a=input[1]/r;
  else
   {
     x=input[2]/(x*x);
     y=input[2]/x;
     if(x==input[0]||y==input[1])
      a=input[2]/(x*x);
    }
}
int pro=(int)a;
System.out.println("a:"+pro+" r:"+r);
for(int i=0;i<input.length;i++)
{
if(pro!=input[i])
return input[i];
pro*=r;
}
return 0;
}

}

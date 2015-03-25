public class Test
{
int mx,my;
public Test(int x,int y){
mx=x;
my=y;
}
public Test(){this(5,5);}
public int getX(){return mx;}
public int getY(){return my;}
public static void main(String args[])
{
Test t=new Test();
System.out.println(t.getX());
}
}
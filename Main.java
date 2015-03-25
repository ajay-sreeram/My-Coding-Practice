final class C{
public double re,im;
public C(double re,double im){
this.re=re;
this.im=im;
}
C(C c){
System.out.println("Copy");
re=c.re;
im=c.im;
}
public String toString(){
return ":"+re+""+im;
}

}

public class Main{
public static void main(String args[]){
C c1=new C(5,10);
C c2=new C(c1);
C c3=c1;
System.out.println(c2);
}
}

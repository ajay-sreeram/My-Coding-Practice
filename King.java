public class King
{
public static void main(String args[]){
King k=new King();
Elephant e=new Elephant();
System.out.print("output = ");
System.out.print(e.step2(2,3));
}
interface Queen{
float step2(int low,int high);
}
interface pawn{
float step3(int a,int b,int c);
}

abstract class Knight implements Queen,pawn{
}
class Elephant implements Queen{
public float step2(int x,int y){
return 2;
}
}
}

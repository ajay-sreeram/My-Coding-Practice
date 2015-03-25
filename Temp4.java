 import java.io.*;
public class Temp4
{
public static void main(String args[])
{
new Yuvi().bat();
new Yuvaraj().bat();
((Yuvi)new Yuvaraj()).bat();
}
}

class Yuvi{
void bat(){System.out.print("Unbeaten");}
}

class Yuvaraj extends Yuvi{
void bat(int i){System.out.print(i+" ");}
void bat(){
System.out.print("YOURAJ's");
super.bat();
this.bat(7);
}
}
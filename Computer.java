public class Computer
{
class HardDisk{
HardDisk(){
Computer.memory();
}
}
public static void main(String args[])
{
new Computer().display();
}
void display(){
new HardDisk();
}
void memory(){
System.out.println("Hello World");
}

}
import java.awt.*;
import java.io.*;
import java.awt.event.*;
class Fram extends Frame 
{
Button b1;
Fram()
{
setLayout(new FlowLayout());
 b1=new Button("THIS");
add(b1);
}
public static void main(String ar[])
{
Fram p=new Fram();
p.setVisible(true);
p.setTitle("Ajay");
p.setSize(400,400);
}
}
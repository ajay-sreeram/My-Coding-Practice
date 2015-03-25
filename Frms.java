import java.awt.*;
import java.awt.event.*;
class Frms extends Frame implements ActionListener
{
Button b1;
Label l1;
Frms()
{
setLayout(new FlowLayout());
b1=new Button("HAI");
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
l1=new Label("YOU CLICKED HAI");
add(l1);
}
public static void main(String s[])
{
Frms f;
f=new Frms();
f.setTitle("AJAY");
f.setSize(400,400);
f.setVisible(true);
}}

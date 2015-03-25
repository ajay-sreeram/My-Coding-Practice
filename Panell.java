import java.awt.*;
import java.awt.event.*;
import java.applet.*;;
/*<applet code="Panell" width=424 height =400></applet>*/
public class Panell extends Applet implements ActionListener
{
Button b1,b2;
Panel p1,p2;
public void init()
{
b1=new Button("PANEL 1");
b2=new Button("PANEL 2");
p1=new Panel();p2=new Panel();
setLayout(null);
b1.setBounds(50,20,50,30);
b2.setBounds(150,20,50,30);
b1.setBackground(Color.blue);b2.setBackground(Color.green);
b1.addActionListener(this);b2.addActionListener(this);
p1.setBounds(10,50,400,100);p2.setBounds(10,50,400,100);
p1.setBackground(Color.blue);p2.setBackground(Color.green);
b1.addActionListener(this);b2.addActionListener(this);
add(b1);add(b2);
}
public void actionPerformed(ActionEvent e)
{
if(b1.getLabel().equals(e.getActionCommand()))
add(p1);
else
if(b2.getLabel().equals(e.getActionCommand()))
add(p2);
}
}
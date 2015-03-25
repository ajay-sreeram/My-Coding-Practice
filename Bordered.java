import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Bordered" width=424 height=400></applet>*/
public class Bordered extends Applet //implements FocusListener
{
Button b1,b2;
public void init()
{
//setLayout(null);
Font f=new Font("arial",Font.ITALIC/Font.BOLD,35);
b1=new Button("COMPUTER SCIENCE");
//b1.setBounds(10,10,400,400);
b1.setFont(f);
b1.setBackground(new Color(30,40,60));
b1.setForeground(new Color(80,50,70));
Choice l=new Choice();
Scrollbar s=new Scrollbar();

add(s);
l.add("Ajay");
l.add("Puneeth");
l.add("Chaitu");
l.add("Mahesh");
l.add("Karthik");
add(b1);
add(l);
}
}
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Threadd" width=500 height=500></applet>*/

public class Threadd extends Applet implements ActionListener
{
Button b,b2;
String st="";
TextField t;
//Threadss t;
public void init()
{
//t=new Threadss();
b=new Button("BUTTON 1");
b2=new Button("BUTTON 2");
t=new TextField(40);
add(b);
add(t);
add(b2);
b2.addActionListener(this);
 b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{t.selectAll();

st=st+"First Class   "+t.getSelectedText()+"   ";
repaint();
}
public void update(Graphics g)
{
g.drawString(st,100,100);
}
}


/*class Threadss extends Applet implements ActionListener
{
String q=" ";
Button b3;
public void init()
{
b3=new Button("BUTTON 3");
add(b3);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
q="SECOND CLASS";
}
public void update(Graphics g)
{
g.drawString(q,100,150);
}
}*/
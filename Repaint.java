import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Repaint" width=500 height=500></applet>*/
public class Repaint extends Applet implements ActionListener
{
Button b;
int i;
public void init()
{
b=new Button("HAI DARLING");
add(b);i=5;
b.addActionListener(this);
setBackground(Color.black);
}
public void actionPerformed(ActionEvent e)
{
long p=6000;
i=10;
repaint(p);
}
public void paint(Graphics g)
{
if(i==10)
setBackground(Color.red);
}
}
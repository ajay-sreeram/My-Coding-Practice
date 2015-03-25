import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Lab" width=200 height=200></applet>*/
public class Lab extends Applet implements ActionListener
{
Button b;
String st="";
public void init()
{
b=new Button("+");
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String p=e.getActionCommand();
char ch=p.charAt(0);
//if(p.equals("+"))
if(ch=='+')
st="this is + boss";
repaint();
}
public void paint(Graphics g)
{
//String q=st[2]+st[3];
g.drawString(st,100,100);
}
}
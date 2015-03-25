import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AppletCheck extends Applet implements ActionListener
{
int a=50;String st=" ";
Button b=new Button("BUTTON");
public void init()
{
b.addActionListener(this);add(b);}

public void ActionPerformed(ActionEvent a)
{
st=a.getActionCommand();repaint();
}
public void paint(Graphics g)
{
g.drawString("heyu pressed "+st,50,50);
g.drawRect(10,10,50,40);
}
}
/*<applet code=AppletCheck width=100 height=100></applet>*/
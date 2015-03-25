import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Scroll" width=500 height=500></applet>*/
public class Scroll extends Applet implements AdjustmentListener,MouseMotionListener
{
Scrollbar b1,b2;
int x,y;String msg;
public void init()
{
setLayout(new BorderLayout());
b2=new Scrollbar(Scrollbar.VERTICAL,0,1,0,Integer.parseInt(getParameter("height")));
b1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,Integer.parseInt(getParameter("width")));
add(b1,BorderLayout.NORTH);
add(b2,BorderLayout.WEST);
addMouseMotionListener(this);
b1.addAdjustmentListener(this);b2.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent e)
{repaint();}
public void mouseDragged(MouseEvent e)
{
x=e.getX();y=e.getY();
b1.setValue(x);
b2.setValue(y);
repaint();
}
public void mouseMoved(MouseEvent e){}
public void update(Graphics g)
{
msg="Verticle"+b2.getValue();
msg+=",Horizantal"+b1.getValue();
g.drawString(msg,10,600);
g.drawString("***",b1.getValue(),b2.getValue());
}
}
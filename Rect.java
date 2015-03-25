import java.awt.*;import java.applet.*;
import java.awt.event.*;
/*<applet code="Rect" width=424 height=400></applet>*/
public class Rect extends Applet implements MouseMotionListener,MouseListener
{
int x1,x2,y1,y2;Boolean flag=true;
public void init(){addMouseMotionListener(this);addMouseListener(this);}
public void mouseMoved(MouseEvent e){}
public void mouseDragged(MouseEvent e)
{
if(flag)
{x1=e.getX();y1=e.getY();flag=false;}
else
{x2=e.getX();y2=e.getY();repaint();}
}
public void mousePressed(MouseEvent e){}
public void mouseClicked(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mouseReleased(MouseEvent e){flag=true;}
public void paint(Graphics g)
{
if(x1>x2&&y1>y2)
g.drawRect(x2,y2,x1-x2,y1-y2);
if(x1<x2&&y1<y2)
g.drawRect(x1,y1,x2-x1,y2-y1);
if(x1>x2)
g.drawRect(x2,y1,x1-x2,y2-y1);
else
g.drawRect(x1,y2,x2-x1,y1-y2);
}
}
import java.awt.*;
import java.awt.event.*;
class Side extends Frame implements MouseListener
{
Canvas p;
boolean f=false;
int x,y;
Side()
{
//setLayout(null);
p=new Canvas();
addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
x=e.getX();
y=e.getY();
p.setBackground(new Color(120,120,120));
if(f)
{p.setVisible(false);f=false;}
else
{
f=true;
p.setBounds(x,y,100,250);
p.setVisible(true);
}

}
public void paint(Graphics g){
}
public void mouseReleased(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mousePressed(MouseEvent e){}
public static void main(String args[])
{
Side q=new Side();
q.setBounds(0,0,700,700);
q.setVisible(true);
}
}
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Pencil" width=424 height=400></applet>*/
public class Pencil extends Applet implements MouseMotionListener,MouseListener,AdjustmentListener
{
int x,y,x1,x2,y1,y2;
int ch;Boolean flag=true;
String st="~";
Checkbox c1,c2,c3,C1,C2,a1,a2,a3,co1,co2,co3,co4;
CheckboxGroup g1,g2,g3;
Scrollbar sv;
//Button b1,b2,b3;
Panel p;
public void init()
{
setLayout(new BorderLayout());
sv=new Scrollbar(Scrollbar.VERTICAL,0,1,0,400);
add(sv,BorderLayout.WEST);
sv.addAdjustmentListener(this);
addMouseMotionListener(this);
addMouseListener(this);
g2=new CheckboxGroup();
C1=new Checkbox("PENCIL",g2,false);C2=new Checkbox("SHAPE",g2,true);
//b2=new Button("drawings");
g1=new CheckboxGroup();
c1=new Checkbox("{.}",g1,true);
c2=new Checkbox("{*}",g1,false);
c3=new Checkbox("{o}",g1,false);
/*b1=new Button("TYPE");
b1.addActionListener(this);*/
g3=new CheckboxGroup();
a1=new Checkbox("Rect",g3,true);
a2=new Checkbox("Oval",g3,false);
a3=new Checkbox("Line",g3,false);
g1=new CheckboxGroup();
co1=new Checkbox("Red",false,g1);
co2=new Checkbox("Green",false,g1);
co3=new Checkbox("Blue",g1,false);
co4=new Checkbox("Black",g1,true);
p=new Panel();
p.setLayout(new GridLayout(3,3));p.setBackground(new Color(210,210,210));p.add(C1);
p.add(c1);p.add(c2);p.add(c3);p.add(C2);p.add(a1);p.add(a2);p.add(a3);
p.add(co1);p.add(co2);p.add(co3);p.add(co4);
add(p,"South");
}
//public void actionPerformed(ActionEvent e){ch=1;}
public void adjustmentValueChanged(AdjustmentEvent ae){repaint();}
public void mouseMoved(MouseEvent e){}
public void mouseDragged(MouseEvent e)
{
if((g2.getSelectedCheckbox().getLabel()).equals("PENCIL"))
{x=e.getX();y=e.getY();repaint();}
}
public void mouseClicked(MouseEvent e){
if((g2.getSelectedCheckbox().getLabel()).equals("SHAPE"))
{
if(flag){x1=e.getX();y1=e.getY();flag=false;}
else{x2=e.getX();y2=e.getY();repaint();flag=true;}
}
}
public void mouseReleased(MouseEvent e){}//x2=e.getX();y2=e.getY();repaint();}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mousePressed(MouseEvent e){}//x1=e.getX();y1=e.getY();}
public void update(Graphics g)
{
String stp=g1.getSelectedCheckbox().getLabel();
if(stp.equals("Red")) g.setColor(Color.red);
if(stp.equals("Green")) g.setColor(Color.green);
if(stp.equals("Blue")) g.setColor(Color.blue);
if(stp.equals("Black")) g.setColor(new Color(0,0,0));
if((g2.getSelectedCheckbox().getLabel()).equals("PENCIL"))
{
	if(c1.getState())st=".";
	if(c2.getState())st="*";
	if(c3.getState())st="o";
	g.drawString(st,x,y);
}
else
{
	if("Rect".equals(g3.getSelectedCheckbox().getLabel()))
	{
	if(x1<x2&&y1<y2)g.drawRect(x1,y1,x2-x1,y2-y1);
	if(x1>x2&&y1>y2)g.drawRect(x2,y2,x1-x2,y1-y2);
	if(x1>x2)g.drawRect(x2,y1,x1-x2,y2-y1);
	else g.drawRect(x1,y2,x2-x1,y1-y2);
	}
	if("Oval".equals(g3.getSelectedCheckbox().getLabel()))
	{
	if(x1<x2&&y1<y2)g.drawOval(x1,y1,x2-x1,y2-y1);
	if(x1>x2&&y1>y2)g.drawOval(x2,y2,x1-x2,y1-y2);
	if(x1>x2)g.drawOval(x2,y1,x1-x2,y2-y1);
	 else g.drawOval(x1,y2,x2-x1,y1-y2);
	}
	if("Line".equals(g3.getSelectedCheckbox().getLabel()))
	{g.drawLine(x1,y1,x2,y2);}
}
}

}
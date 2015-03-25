import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code= "Shabpaint22" width =800 height=700 ></applet>*/

public class Shabpaint22 extends Applet implements ActionListener,MouseListener,MouseMotionListener,ItemListener,Runnable
{
int x1,y1,x2,y2;
int sx,sy,dx,dy;                                  Choice c;String chng="";String chng1;   String clr;
boolean flag=true;
boolean flag1=true;                     String cc;              Color col;
Button b1,b2,b3,b4,b5,b6,b7,bt,eras,sr,eraser,finalera;
Button b[];
String str;
TextArea big,sml;
Boolean flagg=true;  Label l;

String wis=" M   S        P   A   I    N     T";
int go=0;


public void start()
{
Thread t=new Thread(this);
t.start();
}

public void run()
{

for(;flagg;)
{
go+=10;
repaint();
try{Thread.sleep(100);}
catch(InterruptedException e){}
}
}




public void init()
{
setLayout(null);   
Panel p=new Panel();

col=new Color(120,100,95);
setBackground(col);
Color col1=new Color(100,120,90);

setForeground(Color.red);
Font f=new Font("ARIAL",Font.BOLD,15);
setFont(f);

c=new Choice();
c.add("shabaaz");
c.add("paint");
add(c);


b=new Button[12];
for(int i=0;i<11;i++)                        
{

b[i]=new Button(""+i);
b[i].addActionListener(this);
p.add(b[i]);
 p.setBounds(40,600,200,100); 	 	
add(p,"South");  
}                                                                           

                                   

b[0].setBackground(Color.black);
b[1].setBackground(Color.blue);
b[2].setBackground(Color.yellow);
b[3].setBackground(Color.green);
b[4].setBackground(Color.pink);
b[5].setBackground(Color.cyan);
b[6].setBackground(Color.magenta);
b[7].setBackground(Color.red);
b[8].setBackground(Color.orange);
b[9].setBackground(Color.blue);
b[10].setBackground(Color.white);




setLayout(null);

finalera=new Button("undo");finalera.addActionListener(this);            finalera.setBounds(50,340,40,70);  add(finalera);
eraser=new Button("UNDO ALL");eraser.addActionListener(this);           //eraser.setBounds(100,100,100,110); add(eraser);
eras=new Button("brush");eras.addActionListener(this);                            eras.setBounds(50,100,40,70); add(eras); 
bt=new Button("TEXT");bt.addActionListener(this);                  // bt.setBounds(50,100,100,110); add(bt);
b1=new Button("-----"); b1.addActionListener(this);        b1.setBounds(50,160,40,70);              add(b1);
b2=new Button("O");   b2.addActionListener(this);     b2.setBounds(50,220,40,70);               add(b2);
b3=new Button("[]");   b3.addActionListener(this);       b3.setBounds(50,280,40,70);      add(b3);

b4=new Button("[[]]");b4.addActionListener(this);        b4.setBounds(10,100,40,70); add(b4);
b5=new Button("()");b5.addActionListener(this);               b5.setBounds(10,160,40,70);         add(b5);
b6=new Button("(O)");b6.addActionListener(this);              b6.setBounds(10,220,40,70);        add(b6);
b7=new Button("|");b7.addActionListener(this);                   b7.setBounds(10,280,40,70);          add(b7);
 
sr=new Button("pen");sr.addActionListener(this);         sr.setBounds(10,340,40,70);          add(sr);

 

addMouseListener(this);
addMouseMotionListener(this);


}




public void actionPerformed(ActionEvent e)
{

str=e.getActionCommand();                       //generally button name comes if we click color boxex then its should come


if(str==eras.getLabel())
{
setBackground(col);
repaint();
}
if(str==eraser.getLabel())
{
setBackground(col);
setForeground(Color.white);
}

if(str==finalera.getLabel())
{
setForeground(col);
//repaint();

}


for(int i=0;i<11;i++)
{  
if(str== b[i].getLabel())

{  

switch(i)
{
case 0:setForeground(Color.black); break;

case 1:setForeground(Color.blue); break;
case 2:setForeground(Color.yellow);break;
case 3:setForeground(Color.green);break;
case 4:setForeground(Color.pink);break;
case 5:setForeground(Color.cyan);break;
case 6:setForeground(Color.magenta);break;
case 7:setForeground(Color.red);break;
 case 8:setForeground(Color.orange);break;
case 9:setForeground(Color.blue);break;
case 10:setForeground(Color.white);break;
}
      }

 }                                                    

}


public void itemStateChanged(ItemEvent ie)                     //for b8. for chng1 mean pencil in update
{
repaint();


}

public void mouseClicked(MouseEvent me)
{
if(flag==true)
{
x1=me.getX(); y1=me.getY();                        //mouse clicked going to update
flag=false;
}
else
{
x2=me.getX();y2=me.getY();
repaint();
flag=true;
}
}

public void mouseMoved(MouseEvent e)

{


}



public void mouseDragged(MouseEvent e)
{



if(flag1)
{
sx=e.getX(); sy=e.getY();
flag1=false;
}
else                                                                  //mouse dragging going to paint
{
dx=e.getX();
dy=e.getY();
showStatus(sx+","+sy+","+dx+","+dy);
repaint();
}
}

//public void paint(Graphics g)
//{
//}



public void update(Graphics g)
{


if(str==b1.getLabel())
{ g.drawLine(x1,y1,x2,y2);}

if(str==b2.getLabel())
{   g.drawOval(x1,y1,x2-x1,y2-y1);  }

if(str==b3.getLabel())
{  g.drawRect(x1,y1,x2-x1,y2-y1); }


if(chng==c.getSelectedItem())                             //choice of * . + to do with mouse 
{setForeground(Color.red);}

if(str==sr.getLabel())
{
//setBackground(col);
//setForeground(Color.white);

g.drawString(".",dx,dy);
}


if(str==bt.getLabel())
{
sml=new TextArea(10,20);
String txt=sml.getText();
}


if(str==eras.getLabel())
{

g.drawString("*",dx,dy);
}








if(str==finalera.getLabel())
{

setForeground(Color.white);
g.drawString("O",dx,dy);

}





if(str==b4.getLabel())
{

if(sx<dx&&sy<dy)
g.drawRect(sx,sy,dx-sx,dy-sy);
else
if(dx<sx&&dy<sy)
g.drawRect(dx,dy,sx-dx,sy-dy);
else
if(dx<sx)
g.drawRect(dx,sy,sx-dx,dy-sy);
else
g.drawRect(sx,dy,dx-sx,sy-dy);

}

if(str==b5.getLabel())
{

if(sx<dx&&sy<dy)
g.drawRoundRect(sx,sy,dx-sx,dy-sy,10,10);
else
if(dx<sx&&dy<sy)
g.drawRoundRect(dx,dy,sx-dx,sy-dy,10,10);
else
if(dx<sx)
g.drawRoundRect(dx,sy,sx-dx,dy-sy,10,10);
else
g.drawRoundRect(sx,dy,dx-sx,sy-dy,10,10);

}

if(str==b6.getLabel())
{

if(sx<dx&&sy<dy)
g.drawOval(sx,sy,dx-sx,dy-sy);
else
if(dx<sx&&dy<sy)
g.drawOval(dx,dy,sx-dx,sy-dy);
else
if(dx<sx)
g.drawOval(dx,sy,sx-dx,dy-sy);
else
g.drawOval(sx,dy,dx-sx,sy-dy);

}

if(str==b7.getLabel())
{

if(sx<dx&&sy<dy)
g.drawLine(sx,sy,dx,dy);
else
if(dx<sx&&dy<sy)
g.drawLine(dx,dy,dx,dy);
else
if(dx<sx)
g.drawLine(dx,sy,dx,dy);
else
g.drawLine(sx,dy,dx,sy);
}




g.drawString(""+wis,go,go+20);


g.drawString("WELCOME    TO    SHABAAZ   PAINT",400,50);


for(int i=0;i<11;i++)
{  

if(str==b[i].getLabel())
{

switch(i)
{
case 0:setForeground(Color.black);break;

case 1:setForeground(Color.blue);break;
case 2:setForeground(Color.yellow);break;
case 3:setForeground(Color.green);break;
case 4:setForeground(Color.pink);break;
case 5:setForeground(Color.cyan);break;
case 6:setForeground(Color.magenta);break;
case 7:setForeground(Color.red);break;

 case 8:setForeground(Color.orange);break;
case 9:setForeground(Color.blue);break;
case 10:setForeground(Color.white);break;


}
 

      }

 }                  






















}





public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}

}



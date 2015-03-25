import java.awt.*;
import java.awt.event.*;

public class Shabaaz extends Frame implements ActionListener,WindowListener,KeyListener
{
public int  i=0;String disp="";
char ch[ ]={'i',' ','a','m',' ', 'a',' ','f','o','o','l','.','.'};              Button b1,b2;String stri;int j=0;
TextArea t;
Shabaaz()
{
super("shab EDITOR");
addWindowListener(this);
Font f=new Font("Arial",Font.BOLD,20);
setFont(f);
//setLayout(null);
t=new TextArea(300,300);
t.addKeyListener(this);
t.setBounds(10,20,300,300);
add(t);
}

Drg dr=new Drg();

public void keyPressed(KeyEvent e)
{
System.out.println("pressed");

}
public void keyReleased(KeyEvent e)
{
System.out.println("released");

}
public void keyTyped(KeyEvent e)
{

System.out.println(ch[i]);
repaint();
i++;
if(i==13)
{i=0;}
}


public void paint(Graphics g)
{

disp=disp+ch[i];
t.setText("i"+disp);
if(j==0)
{
//dr.setVisible(false);
}
j++;
if(j>70)
{
dr.setSize(500,150);
dr.setVisible(true);
j=0;
}
}


public void actionPerformed(ActionEvent ae){}
public void windowClosing(WindowEvent e)
{

Exi ex;
ex=new Exi();
ex.setSize(400,200);

ex.setVisible(true);

//System.exit(0);
}

public void windowDeactivated(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e)
{

}
public void windowActivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e0){}

public static void main(String args[])
{
Shabaaz f=new Shabaaz();

//f.setSize(300,300);
f.setBounds(50,50,600,400);
f.setVisible(true);

}

}


class Exii extends Frame implements ActionListener
{
Button bt;Label l;
Exii()
{
super("BYE BYE");
setBackground(Color.black); 
setForeground(Color.red);
bt=new Button("OK");
bt.setBackground(Color.green);
bt.setForeground(Color.black);
l=new Label("bye bye fool..");
setLayout(null);
l.setBounds(20,30,65,28);
add(l);
bt.addActionListener(this);
bt.setBounds(60,60,70,62);
add(bt);
}

public void actionPerformed(ActionEvent e)
{
if(bt.getLabel().equals("OK"));
{
System.exit(0);
}

}
}




class Exi extends Frame implements ActionListener
{
Button b1,b2;
Exi()
{
super("confirm ur a fool");
setBackground(Color.red);
setForeground(Color.black);
setLayout(null);
b1=new Button("i confirm");
b1.setBackground(Color.black);
b1.setForeground(Color.cyan);
b1.setBounds(81,66,121,67);
b2=new Button("                  no");
b2.setBackground(Color.black);
b2.setForeground(Color.cyan);
b2.setBounds(130,66,177,67);
b1.addActionListener(this);
b2.addActionListener(this);
add(b1);
add(b2);
}
public void actionPerformed(ActionEvent ae)
{
String str;
str=ae.getActionCommand();
//if(b1.getLabel().equals("i confirm"));
if(str==b1.getLabel())
{
setLayout(null);
Exii ee=new Exii();
ee.setBounds(100,100,180,150);
//ee.setSize(200,150);
ee.setVisible(true);
}

//if(b2.getLabel().equals("no"))
if(str==b2.getLabel())
{
Shabaaz f=new Shabaaz();
f.setBounds(300,300,600,400);
//f.setSize(300,300);
f.setVisible(true);
//ee.setVisible(false);
}

}

}
class Drg extends Frame 
{
Label l;
Drg()
{
setBackground(Color.red);
setForeground(Color.white);
l=new Label("Abe oye.....i think u r not still satisfied..hahaha minimize me and continue....haha");
add(l);
}
}

/*class Strt extends Frame
{
TextField tf;
Label l;

Strt()
{

l=new Label("enter your name");
tf=new TextField(20);
add(l);
add(tf);
}
}*/
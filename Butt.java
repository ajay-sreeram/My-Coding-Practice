//import java.io.*;
//import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Butt" width=400 height=400></applet>*/
public class Butt extends Applet implements ActionListener
{
    Button b1;
    String st="";
public void init()
{
    b1=new Button("BUTTON");
    Label l1=new Label("Click here");
    add(l1);
    add(b1);
    b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
   st=e.getActionCommand();
   repaint();
}
public void paint(Graphics g)
{
      g.drawString("YOU HAVE CLICKED"+st,120,120);
}
}

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ButtonCheck extends Applet implements ActionListener,Runnable
{
    Button b1;
    String st="",st1="HAI MR.AJAY SREERAM   ";
  Thread t;
Boolean flag=true;
public void init()
{
     t=new Thread(this);
    b1=new Button("BUTTON");
    Label l1=new Label("Click here");
    b1.addActionListener(this);
    add(l1);
    add(b1);
    t.start();
}
public void run()
{
char a;
for(;flag;)
try{
a=st1.charAt(0);
st1=st1.substring(1);
st1=st1+a;
Thread.sleep(250);
repaint();
}
catch(InterruptedException e){}
}

public void stop()
{flag=false;}

public void actionPerformed(ActionEvent e)
{
   st=e.getActionCommand();
   repaint();

}
public void paint(Graphics g)
{
      g.drawString("YOU HAVE CLICKED"+st,30,40);
    g.drawString(st1,40,70);
}
}
/*<applet code="ButtonCheck" width=500 height=500></applet>*/

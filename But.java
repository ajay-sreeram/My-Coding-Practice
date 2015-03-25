import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class But extends Applet 
{
Button b;
public void init()
{
b=new Button("AJAY");
b.setFont(new Font("arial",Font.BOLD,20));
Color c=new Color(100,150,130);
b.setBackground(c);
add(b);
}
}
/*<applet code="But" width=300 height=300></applet>*/
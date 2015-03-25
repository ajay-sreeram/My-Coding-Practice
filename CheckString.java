import java.applet.*;
import java.awt.*;
public class AppletCheck extends Applet 
{
int a;
public void init()
{
a=50;
}
public void paint(Graphics g)
{
g.drawString("NUMBER IS"+a);
}
}
/*<applet code=CheckString width=100 height=100></applet>*/
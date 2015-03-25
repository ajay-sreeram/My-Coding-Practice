import java.awt.*;
import java.applet.*;
/*<applet cdoe="Border" width=500 height=400></applet>*/
public class Border extends Applet
{

public void init()
{
setLayout(new BorderLayout());
ScrollBar b=new ScrollBar();

add(b,CENTER);
}
}
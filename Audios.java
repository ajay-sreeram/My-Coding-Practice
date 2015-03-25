import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Audios" width=400 height=400></applet>*/
public class Audios extends Applet
{
AudioClip p;
public void init()
{
p=getAudioClip(getDocumentBase(),"gv.wav");
p.play();
}
}
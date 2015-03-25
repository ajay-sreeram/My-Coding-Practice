import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
public class Audio extends Applet implements ActionListener
{
Button play,stop;
AudioClip audioclip;
public void init()
{
play=new Button("play");
add(play);
play.addActionPerformed(this);
stop=new Button("stop");
add(stop);
stop.addActionListener(this);
audioclip=getAudioclip(getCodeBase(),"au.mp3");
}
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("play"))
{audioclip.loop();}
if(e.getActionCommand().equals("stop"))
{audioclip.stop();}
}
/*public static void main(String arg[])
{
Audio p=new Audio();
p.setBounds(200,200,400,400);
p.setVisible(true);
}*/
}

/*<applet code="Audio" width=400 height=400></applet>*/

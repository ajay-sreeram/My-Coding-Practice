import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="Fontb" width=424 height=400></applet>*/
public class Fontb extends Applet implements ItemListener,FocusListener,Runnable,ActionListener
{
Label f;
TextField ft,fstylt,sizet;
List fl,fstyll,sizel;
Font fon1,fon2,fon3;
Boolean flag=true;
Boolean ch=false;
Label l1;
Button ok,cancel;
String st1,st2,st3;
String st="AaBbYyZz  ";
public void init()
{
Color c=new Color(230,230,230);
setBackground(c);
f=new Label("Font:                                               Font Style:                          Size:");
setLayout(null);
ft=new TextField();
fstylt=new  TextField();
sizet=new TextField();
ft.setBounds(30,40,150,20);
fstylt.setBounds(200,40,120,20);
sizet.setBounds(340,40,60,20);
f.setBounds(30,10,390,20);
add(f);add(ft);add(fstylt);add(sizet);
fl=new  List(6);fstyll=new List(6);sizel=new List(6);
fl.add("Adobe arabic");fl.add("Adobe Caslon pro");fl.add("Adobe Fan Helti std");fl.add("Adobe Fang song std");fl.add("Adobe garamond pro");fl.add("Bell mt");fl.add("Berlin sans FB");fl.add("Bernard MT");fl.add("Cambria");fl.add("Can dara");fl.add("Elephant");fl.add("Dialog");fl.add("DialogInput");fl.add("SansSerief");fl.add("Serif");fl.add("Monospaced");
fstyll.add("REGULAR");fstyll.add("OBLIQUE");fstyll.add("BOLD");fstyll.add("BOLD OBLIC");
sizel.add("8");sizel.add("9");sizel.add("10");sizel.add("12");sizel.add("14");sizel.add("16");sizel.add("18");sizel.add("20");sizel.add("22");sizel.add("24");
fl.setBounds(30,60,150,120);fstyll.setBounds(200,60,120,120);sizel.setBounds(340,60,60,120);
fl.select(0);fstyll.select(0);sizel.select(0);
add(fl);add(fstyll);add(sizel);
Label l=new Label("Sample");
l.setBounds(200,190,50,20);
add(l);
//l1=new Label("AaBbYyZz");
fon1=new Font("Arial",Font.BOLD,30);
fon2=new Font("Serif",Font.ITALIC,30);
fon3=new Font("Dialog",Font.PLAIN,30);
//l1.setFont(fon1);l1.setBounds(230,220,160,70);add(l1);
Label script=new Label("Script:");
script.setBounds(216,310,50,20);add(script);
Choice sc=new Choice();
sc.add("western");sc.select(0);sc.setBounds(220,330,170,20);add(sc);
ok=new Button("Ok");
ok.addActionListener(this);
cancel=new Button("Cancel");
cancel.addActionListener(this);
Color c4=new Color(200,200,200);
ok.setBackground(c4);
cancel.setBackground(c4);
ok.setBounds(220,360,75,30);add(ok);
cancel.setBounds(300,360,75,30);add(cancel);
fl.addItemListener(this);fstyll.addItemListener(this);sizel.addItemListener(this);
ft.addFocusListener(this);fstylt.addFocusListener(this);sizet.addFocusListener(this);
sizet.addFocusListener(this);
}
public void start()
{
Thread t=new Thread(this);
t.start();
}
public void run()
{
for(;flag;)
{
char q;
q=st.charAt(0);
st=st.substring(1);
st=st+q;
try{
Thread.sleep(500);}
catch(InterruptedException e){}
repaint();
}
}
public void stop(){flag=false;}
public void actionPerformed(ActionEvent et)
{
if(et.getActionCommand().equals("Ok"))
{
ch=true;
st1=ft.getText();
st2=fstylt.getText();
st3=sizet.getText();
repaint();
}
if(et.getActionCommand().equals("Cancel"))
{
ch=false;
repaint();
}
}
public void focusGained(FocusEvent e)
{
ft.setText(fl.getSelectedItem());fstylt.setText(fstyll.getSelectedItem());sizet.setText(sizel.getSelectedItem());
}
public void focusLost(FocusEvent e)
{
	String aj=sizet.getText();
	if(aj.equals("8"))sizel.select(0);
	if(aj.equals("9"))sizel.select(1);
	if(aj.equals("10"))sizel.select(2);
	if(aj.equals("12"))sizel.select(3);
	if(aj.equals("14"))sizel.select(4);
	if(aj.equals("16"))sizel.select(5);
	if(aj.equals("18"))sizel.select(6);
	if(aj.equals("20"))sizel.select(7);
	if(aj.equals("22"))sizel.select(8);
	if(aj.equals("24"))sizel.select(9);
}

public void itemStateChanged(ItemEvent e)
{
ft.setText(fl.getSelectedItem());fstylt.setText(fstyll.getSelectedItem());sizet.setText(sizel.getSelectedItem());
int i=(fl.getSelectedIndex())%3;
/*switch(i)
{
case 0:l1.setFont(fon1);break;
case 1:l1.setFont(fon2);break;//fstyll.add("Narrow Italic",1);fstyll.add("Bold Italic",2);break;
case 2:l1.setFont(fon3);break;//fstyll.remove("Narrow Italic");fstyll.remove("Bold Italic");
}*/
repaint();
}
public void paint(Graphics g)
{
if(ch)
{
g.setFont(new Font("Arial",Font.BOLD,16));
g.drawString("STYLE:"+st2,20,250);
g.drawString("SIZE:"+st3,20,280);
g.drawString("FONT:"+st1,20,310);

}
Color p=new Color(190,190,190);
g.setColor(p);
g.drawRect(200,200,190,100);
int i=(fl.getSelectedIndex())%8;
switch(i)
{
case 0:g.setFont(fon1);break;
case 1:g.setFont(fon2);break;//fstyll.add("Narrow Italic",1);fstyll.add("Bold Italic",2);break;
case 2:g.setFont(fon3);break;//fstyll.remove("Narrow Italic");fstyll.remove("Bold Italic");
case 3:g.setFont(new Font("DialogInput",Font.BOLD,30));break;
case 4:g.setFont(new Font("SansSerief",Font.PLAIN,30));break;
case 5:g.setFont(new Font("Serief",Font.PLAIN,30));break;
case 6:g.setFont(new Font("Monospaced",Font.ITALIC,30));break;
case 7:g.setFont(new Font("Dialog",Font.ITALIC,30));break;
}
g.setColor(Color.black);
g.drawString(st,210,260);
}
}

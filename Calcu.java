import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Calcu" width=500 height=500></applet>*/
public class Calcu extends Applet implements ActionListener
{
Button b[];
Panel pa;
TextField tf;
int i;
String st1="",st2="";

String op1="";
String st11="";
int num1=0,num2=0,res=0;
boolean flag=true;
boolean flag1=true;
public void init()
{
tf=new TextField(8);
pa=new Panel();
pa.setLayout(new GridLayout(4,4));
b=new Button[16];
b[0]=new Button("@");b[1]=new Button("0");b[2]=new Button("=");b[3]=new Button("+");
b[4]=new Button("1");b[5]=new Button("2");b[6]=new Button("3");b[7]=new Button("-");
b[8]=new Button("4");b[9]=new Button("5");b[10]=new Button("6");b[11]=new Button("*");
b[12]=new Button("7");b[13]=new Button("8");b[14]=new Button("9");b[15]=new Button("/");
pa.add(tf);
for(i=1;i<16;i++)
{pa.add(b[i]);b[i].addActionListener(this);}
pa.setSize(300,300);
add(pa);

}
public void actionPerformed(ActionEvent e)
{
String op=e.getActionCommand();
char ch=op.charAt(0);
if(ch!='=')
{
	if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
	{
	flag=false;
	op1=op;
	}
	if(flag)
	{
	if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/')
	st1=st1+op;
	}
	else
	{
	if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/')
	st2=st2+op;
	}
}
else
{

	flag=true;
	num1=Integer.parseInt(st1);
	num2=Integer.parseInt(st2);

	if(op1.equals("+"))res=num1+num2;

	if(op1.equals("-"))res=num1-num2;

	if(op1.equals("*"))res=num1*num2;
	if(op1.equals("/"))res=num1/num2;
tf.setText(""+res);
st1=""+res;st2="";op1="";
}
repaint();	
}	
public void paint(Graphics g)
{
g.drawString("st1:"+st1,120,120);
g.drawString("st2:"+st2,120,140);
}



}
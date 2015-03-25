import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class Stackss
{
String num1,num2;
char ch1;
Stackss()
{
num1="";num2="";ch1='`';
}
void pushn(char n)
{
if(ch1=='`')
num1=num1+(""+n);
else
{num2=num2+(""+n);}
}
void pushc(char c)
{
if(c!='@')
{
	if(num2.equals(""))
	{ch1=c;}
	else
	{
	int n1,n2;
	n1=Integer.parseInt(num1);
	n2=Integer.parseInt(num2);
	switch(ch1)
	{
	case '+':n1=n1+n2;break;
	case '-':n1	=n1-n2;break;
	case '*':n1=n1*n2;break;
	case '/':n1=n1/n2;
	}
	num1="";num2="";
	num1=""+n1;
	ch1=c;
	}
}
else
{num1="";num2="";ch1='`';}
}
String res()
{
if(!num2.equals(""))
{
	int n1,n2;
	n1=Integer.parseInt(num1);
	n2=Integer.parseInt(num2);
	switch(ch1)
	{
	case '+':n1=n1+n2;break;
	case '-':n1	=n1-n2;break;
	case '*':n1=n1*n2;break;
	case '/':n1=n1/n2;
	}
	num1="";num2="";
	num1=""+n1;
}
return num1;
}
String arr()
{
return num1+ch1+num2;
}
}
public class Calcula extends Frame implements ActionListener,WindowListener
{
 Button b[];
Panel pa;
TextField tf;
int i;String c;
Stackss st;
Calcula()
{
addWindowListener(this);
setLayout(null);
st=new Stackss();
tf=new TextField(8);
pa=new Panel();
pa.setLayout(new GridLayout(4,4));
b=new Button[16];
b[0]=new Button("ON");b[1]=new Button("0");b[2]=new Button("=");b[3]=new Button("+");
b[4]=new Button("1");b[5]=new Button("2");b[6]=new Button("3");b[7]=new Button("-");
b[8]=new Button("4");b[9]=new Button("5");b[10]=new Button("6");b[11]=new Button("*");
b[12]=new Button("7");b[13]=new Button("8");b[14]=new Button("9");b[15]=new Button("/");
pa.add(tf);
for(i=1;i<16;i++)
{pa.add(b[i]);b[i].addActionListener(this);}
b[0].setBounds(10,30,190,23);
add(b[0]);b[0].addActionListener(this);
pa.setSize(300,300);
pa.setBounds(10,55,190,100);
add(pa);
}
public void actionPerformed(ActionEvent e)
{
c=e.getActionCommand();
char ch=c.charAt(0);
if(c.equals("ON"))ch='@';
if(ch!='=')
{
	if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='@')
	st.pushc(ch);
	else
	st.pushn(ch);
	tf.setText(st.arr());
}
else
tf.setText(st.res());
}
public void windowClosing(WindowEvent e){System.exit(0);}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public static void main(String args[])throws IOException
{
 Calcula z=new Calcula();
z.setTitle("Calculator");
z.setSize(210,170);
z.setVisible(true);
}
}
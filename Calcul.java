import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Calcu" width=500 height=500></applet>*/
publick Stacks
{
int top;
String s[];
Stacks()
{
top=-1;
s[]=new String[10];
s[0]="0";s[1]="1";s[2]="0";
}
void push(char ch)
{
if(top==-1)
	s[++top]=""+ch;
if(top==0)
{
	if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
	s[++top]=""+ch;
}
if(top==1)
{	
	if(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/')
	s[++top]=""+ch;
}
if(top==2)
{
	int n1,n2;
	n1=Integer.parseInt(s[0]);
	n2=Integer.parseInt(s[2]);
	if(s[1].equals("+")){s[0]=""+(n1+n2);top=0;}
	if(s[1].equals("-")){s[0]=""+(n1-n2);top=0;}
	if(s[1].equals("*")){s[0]=""+(n1*n2);top=0;}
	if(s[1].equals("/")){s[0]=""+(n1/n2);top=0;}
	if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
	s[++top]=""+ch;
}
}
String disp()
{
return s[0];
}
}











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

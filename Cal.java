import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Cal" width=400 height=400></applet>*/
public class Cal extends Applet implements ActionListener
{
char c[]={'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
Button b[];
TextField tf;
int i;
Label z;
String s;
String num1="0",num2="0";
boolean flag=true;
//char oper=' ';
String oper="";
int n1,n2,res=0;
public void init()
{
this.setLocationRelativeTo(null);
this.setLocation(400,400);
z=new Label("z");
b=new Button[15];
//setLayout(new GridLayout(4,4));
for(i=0;i<15;i++)
{
b[i]=new Button(""+c[i]);
b[i].addActionListener(this);
add(b[i]);
}
b[10].setLabel("+");
tf=new TextField();
tf.setForeground(Color.red);
add(tf);
}
public void actionPerformed(ActionEvent e)
{
String op=e.getActionCommand();
if(op.equals("+"))
{
z.setText("This is + sir");
add(z);
}
//char ch=op.charAt(0);
if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))
//if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
{
//oper=ch;
oper=op;
flag=false;
}
else
//if(ch=='=')
if(op.equals("="))
{
n1=Integer.parseInt(num1);
n2=Integer.parseInt(num2);
res=0;
/*switch(oper)
{
case '+':res=n1+n2;break;
case '-':res=n1-n2;break;
case '*':res=n1*n2;break;
case '/':res=n1/n2;break;
}*/
if(op.equals("+"))res=n1+n2;
tf.setText(""+res);
num1=""+res;
num2="0";
}
else
if(flag)
{
num1=num1+op;
}
else
num2=num2+op;
//repaint();
}
}
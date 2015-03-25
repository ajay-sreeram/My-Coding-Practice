import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Calc" width=500 height=500></applet>*/
 class Stk11
{
int top;
char st[];
Stk11()
{
st=new char[50];
top=-1;
}
void push(char s)
{
st[++top]=s;
}
char pop()
{
return st[top--];
}
char s()
{
return st[top];
}
int t()
{
return top;
}
}

 class Stk2
{
int top;
int st[];
Stk2()
{
st=new int[50];
top=-1;
}
void push(int s)
{
st[++top]=s;
}
int pop()
{
return st[top--];
}
}
public class Calc extends Applet implements ActionListener
{
Stk11 st1;
Stk2 st2;
Button b[];
char eq[],p[],w;
String c;
Panel pa;
int a;
int i,j,f;
int k=120,h=120;
boolean flag=true;
TextField t;
//Calc()
public void init()
{
i=0;j=0;a=0;
t=new TextField(16);
add(t);
st1=new Stk11();st2=new Stk2();
setLayout(new FlowLayout());
pa=new Panel();
eq=new char[50];
p=new char[50];
pa.setLayout(new GridLayout(4,4));
b=new Button[16];
b[0]=new Button("@");b[1]=new Button("0");b[2]=new Button("=");b[3]=new Button("+");
b[4]=new Button("1");b[5]=new Button("2");b[6]=new Button("3");b[7]=new Button("-");
b[8]=new Button("4");b[9]=new Button("5");b[10]=new Button("6");b[11]=new Button("*");
b[12]=new Button("7");b[13]=new Button("8");b[14]=new Button("9");b[15]=new Button("/");
for(i=0;i<16;i++)
{pa.add(b[i]);b[i].addActionListener(this);}
pa.setSize(200,200);
add(pa);

}
public void actionPerformed(ActionEvent e)
{
c=e.getActionCommand();
char ch=c.charAt(0);
if(ch!='=')
{
   if(ch=='@')
   {flag=true;a=0;}
   else
   {
     eq[a]=ch;
    a=a+1;
   }
}
else
{
eq[a]=')';
st1.push('(');i=0;j=0;
while(st1.t()>=0)
{
   switch(eq[i])
    {
     case '(':st1.push('(');break;
     case '+':while(st1.s()=='+'||st1.s()=='-'||st1.s()=='*'||st1.s()=='/')
                   p[j++]=st1.pop();
                   st1.push(eq[i]);break;
     case '-':while(st1.s()=='+'||st1.s()=='-'||st1.s()=='*'||st1.s()=='/')
                   p[j++]=st1.pop();
                   st1.push(eq[i]);break;
     case '*':while(st1.s()=='*'||st1.s()=='/')
                   p[j++]=st1.pop();
                   st1.push(eq[i]);break;
     case '/':while(st1.s()=='*'||st1.s()=='/')
                   p[j++]=st1.pop();
                   st1.push(eq[i]);break;
      case ')':while(st1.s()!='(')
                   p[j++]=st1.pop();
                   w=st1.pop();
                    break;
       default :p[j++]=eq[i];break;
   }
i++;
}
p[a]=')';i=0;
int x,y;
while(p[i]!=')')
{
   switch(p[i])
    {
     case '+':x=st2.pop();y=st2.pop();st2.push(y+x);break;
     case '-':x=st2.pop();y=st2.pop();st2.push(y-x);break;
      case '*':x=st2.pop();y=st2.pop();st2.push(y*x);break;
      case '/':x=st2.pop();y=st2.pop();st2.push(y/x);break;
      default :st2.push(p[i]);
     }
     i++;
 }
f=st2.pop();
t.setText(""+f);
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(""+f,k,h);
String r=new String(eq);
g.drawString(""+r,k,h+20);
String l=new String(p);
g.drawString(""+l,k,h+40);

}
/*public static void main(String args[])throws IOException
{
Calc ca=new Calc();
ca.setVisible(true);ca.setSize(500,500);ca.setTitle("calculator");
}*/
}
import java.awt.*;
import java.awt.event.*;
public class Home extends Frame implements Runnable,ActionListener
{
String st="TIC TAC TOE ";
Button play,help,quit;
boolean flag=true;

Home()
{
setLayout(null);
Thread.currentThread().setPriority(3);
Thread t=new Thread(this);
t.setPriority(8);
t.start();
play=new Button("PLAY");
help=new Button("HELP");
quit=new Button("QUIT");
setBackground(new Color(126,130,145));
play.setBounds(160,120,50,30);
help.setBounds(230,120,50,30);
quit.setBounds(300,120,50,30);
play.setForeground(new Color(150,90,40));
help.setForeground(new Color(150,90,40));
quit.setForeground(new Color(150,90,40));
play.setFont(new Font("Arial",Font.BOLD,15));
help.setFont(new Font("Arial",Font.BOLD,15));
quit.setFont(new Font("Arial",Font.BOLD,15));
play.setBackground(new Color(150,220,160));
help.setBackground(new Color(150,220,170));
quit.setBackground(new Color(150,220,160));
play.addActionListener(this);
help.addActionListener(this);
quit.addActionListener(this);
add(play);add(help);add(quit);

this.setBounds(470,250,500,200);
this.setVisible(true);
this.setTitle("Tic Tac Toe");

}
public void run()
{
while(true)
{
char q;
q=st.charAt(0);
st=st.substring(1);
st=st+q;
try{Thread.sleep(500);}
catch(InterruptedException e){}
repaint();
}
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("PLAY"))
{Tic tt=new Tic();this.setVisible(false);}
if(s.equals("HELP"))
{Help1 hh=new Help1();this.setVisible(false);}
if(s.equals("QUIT"))
{System.exit(0);}
}

public void paint(Graphics g)
{
g.setFont(new Font("Serief",Font.ITALIC,60));
g.setColor(new Color(180,195,147));
g.drawString(st,40,90);
if(flag)
{
g.drawString("*",400,170);
g.drawString("*",120,130);
g.drawString("*",450,180);
g.drawString("*",30,165);
g.drawString("*",50,140);
g.drawString("*",460,120);
g.drawString("*",110,180);
g.drawString("*",220,140);
g.drawString("*",380,130);
flag=false;
}
else
{
g.drawString("*",360,155);
g.drawString("*",410,160);
g.drawString("*",140,130);
g.drawString("*",420,180);
g.drawString("*",30,185);
g.drawString("*",70,120);
g.drawString("*",440,120);
g.drawString("*",118,160);
g.drawString("*",200,190);
flag=true;
}
}
public static void main(String args[])
{
Home h=new Home();
}
}



class Help1 extends Frame implements WindowListener
{
Panel p,p1,p2,p3;
Button bw[],bw1[],bw2[],bw3[];
Label lh;
Help1()
{
addWindowListener(this);
setBackground(new Color(126,130,145));
lh=new Label("4 Chances of winning the game");
lh.setFont(new Font("cambria",Font.PLAIN,25));
setForeground(new Color(180,195,147));
lh.setBounds(50,60,380,40);
this.setBounds(400,120,450,480);
this.setTitle("Help");
this.setVisible(true);setLayout(null);
p=new Panel();
p1=new Panel();
p2=new Panel();
p3=new Panel();
bw=new Button[25];bw1=new Button[25];bw2=new Button[25];bw3=new Button[25];
int i;
p.setLayout(new GridLayout(5,5));
p1.setLayout(new GridLayout(5,5));
p2.setLayout(new GridLayout(5,5));
p3.setLayout(new GridLayout(5,5));

for(i=0;i<25;i++)
{
bw[i]=new Button("*");
bw[i].setForeground(new Color(150,90,40));
bw[i].setFont(new Font("Arial",Font.BOLD,15));
bw[i].setBackground(new Color(150,220,160));
p.add(bw[i]);
bw1[i]=new Button("*");
bw1[i].setForeground(new Color(150,90,40));
bw1[i].setFont(new Font("Arial",Font.BOLD,15));
bw1[i].setBackground(new Color(150,220,160));
p1.add(bw1[i]);
bw2[i]=new Button("*");
bw2[i].setForeground(new Color(150,90,40));
bw2[i].setFont(new Font("Arial",Font.BOLD,15));
bw2[i].setBackground(new Color(150,220,160));
p2.add(bw2[i]);
bw3[i]=new Button("*");
bw3[i].setForeground(new Color(150,90,40));
bw3[i].setFont(new Font("Arial",Font.BOLD,15));
bw3[i].setBackground(new Color(150,220,160));
p3.add(bw3[i]);
}

for(i=10;i<15;i++)
bw[i].setBackground(new Color(180,20,30));
for(i=2;i<23;i=i+5)
bw1[i].setBackground(new Color(180,20,30));
bw2[0].setBackground(new Color(180,20,30));bw2[6].setBackground(new Color(180,20,30));bw2[12].setBackground(new Color(180,20,30));bw2[18].setBackground(new Color(180,20,30));bw2[24].setBackground(new Color(180,20,30));
bw3[4].setBackground(new Color(180,20,30));bw3[8].setBackground(new Color(180,20,30));bw3[12].setBackground(new Color(180,20,30));bw3[16].setBackground(new Color(180,20,30));bw3[20].setBackground(new Color(180,20,30));

p.setBounds(100,150,100,100);
p1.setBounds(250,150,100,100);
p2.setBounds(100,300,100,100);
p3.setBounds(250,300,100,100);
add(lh);
add(p);add(p1);add(p2);add(p3);
}

public void windowClosing(WindowEvent e){this.setVisible(false);Home h=new Home();}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}

}



class Tic extends Frame implements ActionListener,WindowListener
{
Button b[][];
int co1,co2,cx1,cx2;
boolean check;
int counts;
Tic()
{
addWindowListener(this);
check=true;
counts=0;
b=new Button[15][15];
setLayout(new GridLayout(15,15));
int i,j,k;
k=0;
for(i=0;i<15;i++)
{
	b[i]=new Button[15];
	for(j=0;j<15;j++,k++)
	{
	b[i][j]=new Button(""+k);
	b[i][j].setFont(new Font("arial",Font.PLAIN,1));
	b[i][j].setForeground(new Color(150,220,160));
	b[i][j].setBackground(new Color(150,220,160));
	add(b[i][j]);
	b[i][j].addActionListener(this);
	}
}
this.setTitle("Tic Tac Toe");
this.setBounds(230,1,900,700);
this.setVisible(true);
}

public void windowClosing(WindowEvent e){this.setVisible(false);Home h=new Home();}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}

public void actionPerformed(ActionEvent e)
{
++counts;
String s=e.getActionCommand();
if("x".equals(s)||"o".equals(s)){}
else
{
int i,j,k;
for(i=0;i<15;i++)
for(j=0;j<15;j++)
{
b[i][j].setBackground(new Color(150,220,160));
}	

for(i=0;i<15;i++)
	for(j=0;j<15;j++)
	
	if(s.equals(b[i][j].getLabel()))
	{
		b[i][j].setBackground(new Color(100,170,110));
	
		b[i][j].setFont(new Font("arial",Font.PLAIN,30));
		if(check==true)
		{
		b[i][j].setForeground(new Color(90,20,70));				
		b[i][j].setLabel("o");
		check=false;
		}
		else
		{
		b[i][j].setForeground(new Color(15,12,201));				
		b[i][j].setLabel("x");
		check=true;
		}
	}


for(i=0;i<15;i++)
{
	for(j=0;j<15;j++)
	{
	co1=0;cx1=0;co2=0;cx2=0;
	for(k=j;k<j+5;k++)
	{
		if(i<15&&k<15)
		{
		if("o".equals(b[i][k].getLabel()))
		co1++;
		if("o".equals(b[k][i].getLabel()))
		co2++;
		if("x".equals(b[i][k].getLabel()))
		cx1++;
		if("x".equals(b[k][i].getLabel()))
		cx2++;
		}
	}
	if(co1==5)
	{
	for(k=j;k<j+5;k++)
	{
		if(i<15&&k<15)
		{
		b[i][k].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wo z=new Wo(this);
	}
	if(co2==5)
	{
	for(k=j;k<j+5;k++)
	{
		if(i<15&&k<15)
		{
		b[k][i].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wo z=new Wo(this);
	}
	
	if(cx1==5)
	{
	for(k=j;k<j+5;k++)
	{
		if(i<15&&k<15)
		{
		b[i][k].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wx z=new Wx(this);
	}
	if(cx2==5)
	{
	for(k=j;k<j+5;k++)
	{
		if(i<15&&k<15)
		{
		b[k][i].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wx z=new Wx(this);
	}
	
}
}	
int p,q,m,count;
for(i=0;i<15;i++)
{
	for(m=0;m<15;m++)
	{
	co1=0;cx1=0;count=0;co2=0;cx2=0;
	for(p=i,q=m;count<5;q++,p++,count++)
	{
		if(p<15&&q<15)
		{
		if("o".equals(b[p][q].getLabel()))
		co1++;	
		if("x".equals(b[p][q].getLabel()))
		cx1++;	
		}
	}

	if(co1==5)
	{
	count=0;
	for(p=i,q=m;count<5;p++,q++,count++)
	{
		if(p<15&&q<15)
		{
		b[p][q].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wo z=new Wo(this);
	}
	
	if(cx1==5)
	{count=0;
	for(p=i,q=m;count<5;p++,q++,count++)
	{
		if(p<15&&q<15)
		{
		b[p][q].setBackground(new Color(190,30,30));
		try{Thread.sleep(500);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wx z=new Wx(this);
	}
	
	}
}



for(i=14;i>0;i--)
{
	for(m=0;m<15;m++)
	{
	co1=0;cx1=0;count=0;co2=0;cx2=0;
	for(p=i,q=m;count<5;p--,q++,count++)
	{
		if(p>0&&q<15)
		{
		if("o".equals(b[p][q].getLabel()))
		co1++;	
		if("x".equals(b[p][q].getLabel()))
		cx1++;	
		
		}
	}
	if(co1==5)
	{
	count=0;
	for(p=i,q=m;count<5;p--,q++,count++)
	{
		if(p<15&&q<15)
		{
		b[p][q].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wo z=new Wo(this);
	}
	if(cx1==5)
	{count=0;
	for(p=i,q=m;count<5;p--,q++,count++)
	{
		if(p<15&&q<15)
		{
		b[p][q].setBackground(new Color(190,30,30));
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
		}
	}
		try{Thread.sleep(200);}
		catch(InterruptedException ee){}
	
	Wx z=new Wx(this);
	}
	
	}
}

count=0;
for(i=0;i<15;i++)
for(j=0;j<15;j++)
if("o".equals(b[i][j].getLabel())||"x".equals(b[i][j].getLabel()))
count++;
if(count==225)
{
Wd d=new Wd(this);
}


Cou cc=new Cou(this);
}
}

}	

class Cou extends Thread
{
Tic tt;
int count;
boolean b;
Cou(Tic p)
{
count=p.counts;
b=p.check;tt=p;
this.start();
}
public void run()
{
try{Thread.sleep(30000);}
catch(InterruptedException ee){}
if(count==tt.counts&&b==tt.check)
{
	if(b==true)
	{
	Wx wx=new Wx(tt);
	}
	
	if(b==false)
	{
	Wo wo=new Wo(tt);
	}
}
}
}



class Wo extends Frame implements WindowListener
{
Tic t;
Wo(Tic p)
{
addWindowListener(this);
t=p;
this.setTitle("Winner");
this.setVisible(true);
this.setBounds(550,250,250,190);
setBackground(new Color(126,130,145));
}
public void windowClosing(WindowEvent e){this.setVisible(false);t.setVisible(false);Home h=new Home();}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}

public void paint(Graphics g)
{
g.setColor(new Color(170,170,170));
for(int l=0;l<6;l++)
g.drawRoundRect(20+l,35+l,210-2*l,140-2*l,20,20);
g.setFont(new Font("cambria",Font.PLAIN,20));
g.drawString(" 'O' WIN THE GAME",47,110);
}
}	
class Wx extends Frame implements WindowListener
{
Tic t;
Wx(Tic p)
{
addWindowListener(this);
t=p;
this.setTitle("Winner");
this.setVisible(true);
this.setBounds(550,250,250,190);
setBackground(new Color(126,130,145));
}
public void windowClosing(WindowEvent e){this.setVisible(false);t.setVisible(false);Home h=new Home();}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}

public void paint(Graphics g)
{
g.setColor(new Color(170,170,170));
for(int l=0;l<6;l++)
g.drawRoundRect(20+l,35+l,210-2*l,140-2*l,20,20);
g.setFont(new Font("cambria",Font.PLAIN,20));
g.drawString(" 'X' WIN THE GAME",47,110);
}
}

class Wd extends Frame implements WindowListener
{
Tic t;
Wd(Tic p)
{
t=p;
addWindowListener(this);
this.setVisible(true);
this.setTitle("Draw");
this.setBounds(550,250,250,190);
setBackground(new Color(126,130,145));
}
public void windowClosing(WindowEvent e){this.setVisible(false);t.setVisible(false);Home h=new Home();}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}

public void paint(Graphics g)
{
g.setColor(new Color(170,170,170));
for(int l=0;l<6;l++)
g.drawRoundRect(20+l,35+l,210-2*l,140-2*l,20,20);
g.setFont(new Font("cambria",Font.PLAIN,20));
g.drawString("OH ITS DRAW",47,110);
}
}	
	
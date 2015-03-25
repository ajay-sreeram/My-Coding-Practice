import java.awt.*;
import java.awt.event.*;
public class Tic extends Frame implements ActionListener
{
Button b[][];
int co1,co2,cx1,cx2;
boolean check;
Tic()
{
check=true;
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

this.setBounds(230,1,900,700);
this.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if("x".equals(s)||"o".equals(s)){}
else
{
int i,j,k;
for(i=0;i<15;i++)
	for(j=0;j<15;j++)
	
	if(s.equals(b[i][j].getLabel()))
	{
	
		b[i][j].setFont(new Font("arial",Font.PLAIN,30));
		if(check==true)
		{
		b[i][j].setForeground(new Color(150,90,40));				
		b[i][j].setLabel("o");
		check=false;
		}
		else
		{
		b[i][j].setForeground(new Color(150,90,40));				
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
}
}

public static void main(String args[])
{
Tic c=new Tic();

}
}	



class Wo extends Frame implements WindowListener
{
Tic t;
Wo(Tic p)
{
addWindowListener(this);
t=p;
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
	
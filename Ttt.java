import java.awt.*;
import java.awt.event.*;
public class Ttt extends Frame implements ActionListener
{
Button b[];
int count;
Ttt()
{
count=1;
b=new Button[9];
setLayout(new GridLayout(3,3));
for(int i=0;i<9;i++)
{
b[i]=new Button(""+i);
b[i].setFont(new Font("arial",Font.PLAIN,2));
add(b[i]);
b[i].addActionListener(this);}
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if("x".equals(s)||"o".equals(s)){}
else
{
int n=Integer.parseInt(s);
switch(n)
{
case 0:if(count==1)
	{
	count=0;
	b[0].setLabel("o");
	}
	else
	{
	count=1;
	b[0].setLabel("x");
	}
	b[0].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 1:if(count==1)
	{
	count=0;
	b[1].setLabel("o");
	}
	else
	{
	count=1;
	b[1].setLabel("x");
	}
	b[1].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 2:if(count==1)
	{
	count=0;
	b[2].setLabel("o");
	}
	else
	{
	count=1;
	b[2].setLabel("x");
	}
	b[2].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 3:if(count==1)
	{
	count=0;
	b[3].setLabel("o");
	}
	else
	{
	count=1;
	b[3].setLabel("x");
	}
	b[3].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 4:if(count==1)
	{
	count=0;
	b[4].setLabel("o");
	}
	else
	{
	count=1;
	b[4].setLabel("x");
	}
	b[4].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 5:if(count==1)
	{
	count=0;
	b[5].setLabel("o");
	}
	else
	{
	count=1;
	b[5].setLabel("x");
	}
	b[5].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 6:if(count==1)
	{
	count=0;
	b[6].setLabel("o");
	}
	else
	{
	count=1;
	b[6].setLabel("x");
	}
	b[6].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 7:if(count==1)
	{
	count=0;
	b[7].setLabel("o");
	}
	else
	{
	count=1;
	b[7].setLabel("x");
	}
	b[7].setFont(new Font("arial",Font.PLAIN,80));
	break;
case 8:if(count==1)
	{
	count=0;
	b[8].setLabel("o");
	}
	else
	{
	count=1;
	b[8].setLabel("x");
	}
	b[8].setFont(new Font("arial",Font.PLAIN,80));
	break;
}
if(
("x".equals(b[0].getLabel())&&"x".equals(b[4].getLabel())&&"x".equals(b[8].getLabel())||
(b[6].getLabel().equals("x")&&b[4].getLabel().equals("x")&&b[2].getLabel().equals("x"))||
(b[3].getLabel().equals("x")&&b[4].getLabel().equals("x")&&b[5].getLabel().equals("x"))||
(b[1].getLabel().equals("x")&&b[4].getLabel().equals("x")&&b[7].getLabel().equals("x"))||
("x".equals(b[0].getLabel())&&"x".equals(b[1].getLabel())&&"x".equals(b[2].getLabel()))||
("x".equals(b[2].getLabel())&&"x".equals(b[5].getLabel())&&"x".equals(b[8].getLabel()))||
("x".equals(b[6].getLabel())&&"x".equals(b[7].getLabel())&&"x".equals(b[8].getLabel()))||
("x".equals(b[1].getLabel())&&"x".equals(b[4].getLabel())&&"x".equals(b[7].getLabel()))||
("x".equals(b[3].getLabel())&&"x".equals(b[4].getLabel())&&"x".equals(b[5].getLabel()))||
("x".equals(b[0].getLabel())&&"x".equals(b[3].getLabel())&&"x".equals(b[6].getLabel()))))
{
Frame f=new Frame();
Label l=new Label("X WIN");
f.add(l);
f.setBounds(400,400,400,300);
f.setVisible(true);
}

if((b[0].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[8].getLabel().equals("o"))||
(b[6].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[2].getLabel().equals("o"))||
(b[3].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[5].getLabel().equals("o"))||
(b[1].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[7].getLabel().equals("o"))||
(b[0].getLabel().equals("o")&&b[1].getLabel().equals("o")&&b[2].getLabel().equals("o"))||
(b[2].getLabel().equals("o")&&b[5].getLabel().equals("o")&&b[8].getLabel().equals("o"))||
(b[6].getLabel().equals("o")&&b[7].getLabel().equals("o")&&b[8].getLabel().equals("o"))||
(b[1].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[7].getLabel().equals("o"))||
(b[3].getLabel().equals("o")&&b[4].getLabel().equals("o")&&b[5].getLabel().equals("o"))||
(b[0].getLabel().equals("o")&&b[3].getLabel().equals("o")&&b[6].getLabel().equals("o")))
{
Frame f=new Frame();
Label l=new Label("O WIN");
f.add(l);
f.setBounds(400,400,400,300);
f.setVisible(true);
}
	int count2;
	count2=0;
	for(int j=0;j<9;j++)
	{
	if("x".equals(b[j].getLabel())||"o".equals(b[j].getLabel()))
	count2++;
	}
	if(count2==9)
	{
	Frame f=new Frame();
	Label l=new Label("OH ITS DRAW");
	f.add(l);
	f.setBounds(400,400,400,300);
	f.setVisible(true);
	}

	
}
}
public static void main(String ars[])
{
Ttt aa=new Ttt();
aa.setBounds(100,100,500,500);
aa.setVisible(true);
}
}
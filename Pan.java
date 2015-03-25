import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Pan" width=400 height=400></applet>*/
public class Pan extends Applet implements ActionListener
{
Button b[]=new Button[10];
Panel p=new Panel();
Button k=new Button();
Label l=new Label();
public void init()
{
	int i;
	setLayout(new BorderLayout());
	for(i=0;i<=9;i++)
	{
	b[i]=new Button(" "+i);
	b[i].addActionListener(this);
	p.add(b[i]);
	}

	p.setLayout(new GridLayout(4,4,5,5));
	
	p.setBounds(80,80,60,60);
	add(p,BorderLayout.NORTH);
}
	
public void actionPerformed(ActionEvent e)
{
	
	
	l.setText("You clicked :"+e.getActionCommand()+" AJAY");
	//l.setBounds(80,80,150,40);
	add(l,BorderLayout.SOUTH);
Button k=new Button("BUTTON");
add(k,BorderLayout.WEST);
}
 }
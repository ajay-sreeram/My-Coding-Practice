import java.awt.*;
import java.awt.event.*;
class Flowout extends Frame implements ActionListener
{
Label l[];Button b;
int i;
Flowout()
{
b=new Button("THIS");
add(b);
b.addActionListener(this);
l=new Label[10];
setLayout(new FlowLayout(FlowLayout.TRAILING));
for(i=0;i<10;i++)
{
l[i]=new Label("LABEL:"+i+"  ");
}
}
public void actionPerformed(ActionEvent ee)
{
try{
for(i=0;i<10;i++)
{
Thread.sleep(1000);
add(l[i]);
}
}
catch(InterruptedException e){}
}
public static void main(String args[])
{
Flowout f=new Flowout();
f.setBounds(50,50,400,400);
f.setVisible(true);
f.setTitle("FLOWLAYOUT");
}
}
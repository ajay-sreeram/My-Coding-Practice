import java.awt.*;
import java.awt.event.*;
public class Help1 extends Frame
{
Panel p,p1,p2,p3;
Button bw[],bw1[],bw2[],bw3[];
Label lh;
Help1()
{
setBackground(new Color(126,130,145));
lh=new Label("4 Chances of winning the game");
lh.setFont(new Font("cambria",Font.PLAIN,25));
setForeground(new Color(180,195,147));
lh.setBounds(50,60,380,40);
this.setBounds(400,120,450,480);
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
public static void main(String arg[])
{
Help1 h=new Help1();
}
}


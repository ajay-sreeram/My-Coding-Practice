import java.awt.*;
import java.awt.event.*;
public class Help extends Frame
{
Panel p[];
Button bw1[],bw2[],bw3[],bw4[];
Help()
{
p=new Panel[5];
int i;
bw1=new Button[25];
bw2=new Button[25];
bw3=new Button[25];
bw4=new Button[25];
for(i=0;i<25;i++)
{
bw1[i]=new Button("*");
bw1[i].setForeground(new Color(150,90,40));
bw1[i].setFont(new Font("Arial",Font.BOLD,15));
bw1[i].setBackground(new Color(150,220,160));
bw2[i]=new Button("*");
bw2[i].setForeground(new Color(150,90,40));
bw2[i].setFont(new Font("Arial",Font.BOLD,15));
bw2[i].setBackground(new Color(150,220,160));
bw3[i]=new Button("*");
bw3[i].setForeground(new Color(150,90,40));
bw3[i].setFont(new Font("Arial",Font.BOLD,15));
bw3[i].setBackground(new Color(150,220,160));
bw4[i]=new Button("*");
bw4[i].setForeground(new Color(150,90,40));
bw4[i].setFont(new Font("Arial",Font.BOLD,15));
bw4[i].setBackground(new Color(150,220,160));
}
setLayout(null);
for(i=0;i<4;i++)
p[i].setLayout(new GridLayout(5,5));
for(i=10;i<15;i++)
bw1[i].setBackground(new Color(200,30,30));

int j;
for( j=0;j<25;j++)
p[0].add(bw1[j]);
for(i=10;i<15;i++)
bw1[i].setBackground(new Color(150,220,160));
for(i=2;i<23;i+=5)
bw1[i].setBackground(new Color(200,30,30));
for( j=0;j<25;j++)
p[1].add(bw1[j]);
for(j=0;j<25;j++)
p[2].add(bw3[j]);
for(j=0;j<25;j++)
p[3].add(bw4[j]);

p[0].setBounds(10,60,200,200);
p[1].setBounds(230,60,200,200);
p[2].setBounds(10,270,200,200);
p[3].setBounds(230,270,200,200);

}
public static void main(String args[])
{
Help w=new Help();
w.setBounds(50,50,500,500);
w.setVisible(true);
}
}
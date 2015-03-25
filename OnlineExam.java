import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="OnlineExam" width=500 height=500>
</applet>
*/

public class OnlineExam extends Applet implements ActionListener {

	String ques[],opt[][],ans[];
	Checkbox cb1 , cb2 , cb3 , cb4;
	Checkbox cb5;
	CheckboxGroup cbg;
	Label l1;
	Button b1 , b2;
	static int i;
	int noca = 0,noqa = 0;
        public int count;
    @Override
	public void init(){
	count=0;
		ques = new String[10];
		ques[0] = "1.C language has been developed by";
		ques[1] = "2.C can be used on";
		ques[2] = "3.C programs are converted into machine language with the help of";
		ques[3] = "4.The maximum value that an integer constant can have is";
		ques[4] = "5.A C variable cannot start with";
		ques[5] = "6.The break statement is used to exit from";
		ques[6] = "7.Which of the following statement is used to take the control to the beginning of the loop?";
		ques[7] = "8.A do-while loop is useful when we want that the statements within the loop must be executed";
		ques[8] = "9.On which of the following types can % operator not be used";
		ques[9] = "10.In C,Arithmetic instruction cannot contain";
		opt = new String[10][4];
		opt[0][0] = "Ken Thompson";
		opt[0][1] = "Dennis Ritchie";
		opt[0][2] = "Peter Norton";
		opt[0][3] = "Martin Richards";
		opt[1][0] = "MS-DOS OS";
		opt[1][1] = "Linux OS";
		opt[1][2] = "Windows OS";
		opt[1][3] = "All the above";
		opt[2][0] = "An Editor";
		opt[2][1] = "A Compiler";
		opt[2][2] = "An OS";
		opt[2][3] = "None of the above";
		opt[3][0] = "-32767";
		opt[3][1] = "32767";
		opt[3][2] = "1.7014e+38";
		opt[3][3] = "-1.7014e+38";
		opt[4][0] = "An alphabet";
		opt[4][1] = "A number";
		opt[4][2] = "A special symbol";
		opt[4][3] = "Both 2 & 3 above";
		opt[5][0] = "An if statement";
		opt[5][1] = "A for loop";
		opt[5][2] = "A program";
		opt[5][3] = "The main() function";
		opt[6][0] = "exit";
		opt[6][1] = "break";
		opt[6][2] = "continue";
		opt[6][3] = "None of the above";
		opt[7][0] = "Only once";
		opt[7][1] = "Atleast once";
		opt[7][2] = "More than once";
		opt[7][3] = "None of the above";
		opt[8][0] = "int variable";
		opt[8][1] = "float variable";
		opt[8][2] = "int constant";
		opt[8][3] = "All the above";
		opt[9][0] = "Variables";
		opt[9][1] = "Constants";
		opt[9][2] = "Variable names on right side of =";
		opt[9][3] = "Constants on left side of =";
		ans = new String[10];
		ans[0] = "Dennis Ritchie";
		ans[1] = "All the above";
		ans[2] = "A Compiler";
		ans[3] = "32767";
		ans[4] = "Both 2 & 3 above";
		ans[5] = "A for loop";
		ans[6] = "continue";
		ans[7] = "Atleast once";
		ans[8] = "float variable";
		ans[9] = "Constants on left side of =";
		b1 = new Button("Next");
	    l1 = new Label(ques[0]);
		cbg = new CheckboxGroup();
		cb1 = new Checkbox(opt[0][0],cbg,false);
		cb2 = new Checkbox(opt[0][1],cbg,false);
		cb3 = new Checkbox(opt[0][2],cbg,false);
		cb4 = new Checkbox(opt[0][3],cbg,false);
		cb5=new Checkbox("NONE",cbg,true);;		
		add(l1);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(b1);
		b1.addActionListener(this);
	}


	public void actionPerformed(ActionEvent ae){
        count++;
		if(count==9)
		b1.setLabel("Submit");
		if(count==10)
		{
		 l1.setText("") ;
		 cb1.setVisible(false);
		 cb2.setVisible(false);
		 cb3.setVisible(false);
		 cb4.setVisible(false);
		 b1.setLabel("Retry");
		 JOptionPane.showMessageDialog(null,"No of questions answered:"+noqa+"\n No of correct answers:"+noca,"Results",JOptionPane.INFORMATION_MESSAGE);
	     count=0;
		}
		else
		{
		 b1.setLabel("Next");
		 if(cb1.getState()){
			noqa++;
	    	}
		 else if(cb2.getState()){
		 	noqa++;
		 }
         else if(cb3.getState()){
        	noqa++;
		 }
         else if(cb4.getState()){
        	noqa++;
		 }
		 noca+= cbg.getSelectedCheckbox().getLabel().toString().equals(ans[i]) ? 1 : 0;
		cbg.setSelectedCheckbox(cb5);
		cb1.setLabel(opt[count][0]);
		cb2.setLabel(opt[count][1]);
		cb3.setLabel(opt[count][2]);
		cb4.setLabel(opt[count][3]);
		
		l1.setText(ques[count]);
		}
		repaint();
	}

	public void paint(Graphics g){

	}
}

import java.util.*;
import java.net.*;
//import java.text.*;
public class Counting
{
 public static void main(String[] args) 
{
String paragraph = "Hi, this is merit campus, I am not the king of java\r\nI am also not the emperor of java I don't like to rule over people, I like to win their love";
 getParagraphDetails(paragraph);

    }


public static void getParagraphDetails(String paragraph)
 {
//String temp=paragraph.replaceAll("[^a-zA-Z ]+", "");
String temp=paragraph.replaceAll(" ","");
System.out.println(temp);

String lines[]=paragraph.split("\r\n");
int line=lines.length;
int i,j;
String sline,sword;
String words[];
int word,ch;
word=0;ch=0;
int count=0;
for(i=0;i<lines.length;i++)
{
sline=lines[i].replaceAll("[^a-zA-Z ]+", "");
System.out.println(sline);
words=sline.split(" ");

for(j=0;j<words.length;j++)
{
sword=words[j];
//ch1+=sword.length();
if(sword.equals("a")||sword.equals("an")||sword.equals("the")||sword.equals("is")){count+=sword.length();}
else
{System.out.println(sword); word++;  ch+=sword.length();}
}
}
int ch1=temp.length()-count;

System.out.println("ch1:"+temp.length());

System.out.println("line:"+line+"word:"+word+"ch"+ch);
}
} 
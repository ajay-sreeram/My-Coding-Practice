import java.io.*;
import java.net.*;
public class Download
{
public static void main(String args[])throws Exception
{
//12,13
//1-23
String url[]=new String[24];
String file[]=new String[24];
int i;
for(i=1;i<=23;i++)
{
if(i<10)
 {
  //http://www.sph.umich.edu/csg/abecasis/class/2006/615.01.pdf
  url[i]="http://www.sph.umich.edu/csg/abecasis/class/2006/615.0"+i+".pdf";
  file[i]="File0"+i+".pdf";
 }
 else
 {
   url[i]="http://www.sph.umich.edu/csg/abecasis/class/2006/615."+i+".pdf";
   file[i]="File"+i+".pdf";
 }
}
System.out.println("Opening connection");
URL u;
InputStream in;
FileOutputStream fos;
int length = -1;
byte[] buffer;
for(i=1;i<=23;i++)
{
 if(i!=12&&i!=13)
  {
    u = new URL(url[i]);
    in= u.openStream();
    fos=new FileOutputStream(new File(file[i]));
    System.out.println("reading file "+i+"...");
    length=-1;
    buffer=new byte[1024];
    while((length=in.read(buffer))>-1){
      fos.write(buffer,0,length);}
    fos.close();
    in.close();
    System.out.println("file "+i+"was downloaded");
  }
}   

}
}
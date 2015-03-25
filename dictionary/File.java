import java.io.*;
public class File
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fs=new FileOutputStream("ex.txt");
		DataOutputStream ds=new DataOutputStream(fs);
		String st="ajay hai";
		ds.writeBytes(st+"\n");
		ds.writeBytes("nextline");
		fs.close();
			System.out.println("compleated");
			
	}
}
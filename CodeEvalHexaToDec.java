import java.io.*;
public class CodeEvalHexaToDec{
public static void main(String args[])throws IOException{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String line="aa";
    	
	while ((line = buffer.readLine()) != null) {
		line=(new StringBuilder(line)).reverse().toString();
		int num=0;
		for(int i=0;i<line.length();i++){
			switch(line.charAt(i)){
			case '0':num=num+0*(int)Math.pow(16,i);break;
			case '1':num=num+1*(int)Math.pow(16,i);break;
			case '2':num=num+2*(int)Math.pow(16,i);break;
			case '3':num=num+3*(int)Math.pow(16,i);break;
			case '4':num=num+4*(int)Math.pow(16,i);break;
			case '5':num=num+5*(int)Math.pow(16,i);break;
			case '6':num=num+6*(int)Math.pow(16,i);break;
			case '7':num=num+7*(int)Math.pow(16,i);break;
			case '8':num=num+8*(int)Math.pow(16,i);break;
			case '9':num=num+9*(int)Math.pow(16,i);break;
			case 'a':num=num+10*(int)Math.pow(16,i);break;
			case 'b':num=num+11*(int)Math.pow(16,i);break;
			case 'c':num=num+12*(int)Math.pow(16,i);break;
			case 'd':num=num+13*(int)Math.pow(16,i);break;
			case 'e':num=num+14*(int)Math.pow(16,i);break;
			case 'f':num=num+15*(int)Math.pow(16,i);break;
			}
			
		}
		System.out.println(num);
	}
}
}
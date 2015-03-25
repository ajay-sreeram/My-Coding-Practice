import java.io.*;
import java.util.*;
public class CodeEvalJustifyText {
    public static void main (String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		File file=new File("JustifyResult.txt");
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        String line=null;
		while(line!=null||(line=buffer.readLine())!=null){
			if(line.length()<=80){
					System.out.println(line);
					writer.append(line+"\n");
					line=null;
				}
			else{
				if(line.charAt(78)==' '||line.charAt(79)==' '){
					System.out.println(line.substring(0,79));
					writer.append(line.substring(0,79)+"\n");
					line=line.substring(79,line.length());
					continue;
				}
				else{
					int last=line.substring(0,80).lastIndexOf(' ');
					if(last!=-1){
						do{	
							String tmp=line.substring(0,last+1);
							line=line.substring(last+1);
							String tmparr[]=tmp.split(" ");
							int cntSpaces=tmparr.length-1;
							int tvar=80-(tmp.length()-cntSpaces);
							int currentspaces=cntSpaces;
							while(tvar-currentspaces>0)
								currentspaces+=cntSpaces;
							currentspaces-=cntSpaces;
							int remainder=tvar-currentspaces;
							
							int spaceLen=currentspaces/cntSpaces;
								
							String result="";
							int i;
							for(i=0;i<tmparr.length-1;i++){
								if(remainder!=0){
									remainder--;
									result=result+tmparr[i];
									for(int j=0;j<=spaceLen;j++)
										result=result+" ";
								}
								else{
									result=result+tmparr[i];
									for(int j=0;j<spaceLen;j++)
										result=result+" ";
								}
							}
							result=result+tmparr[i];
							System.out.println(result);
							writer.append(result+"\n");
						}while(line.length()>80);
						System.out.println(line);
						writer.append(line+"\n");
					}
					else{
						System.out.println(line.substring(0,80));
						writer.append(line.substring(0,80)+"\n");
						line=line.substring(80,line.length());
						continue;
					}
					line=null;
				}
			}
		}
	writer.close();
	}
}
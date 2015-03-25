// Sample code to read in test cases:
import java.io.*;
public class CodeEvalDecrypt2 {
    public static void main (String[] args) throws IOException {
       // File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = buffer.readLine()) != null) {
       String given[]=line.split("\\|");
			int wlen=Integer.parseInt(given[0].trim());
			char ch=given[1].trim().charAt(0);
			String tmparr[]=given[2].trim().split(" ");
			int i,j,tmp;
			int n=0;
			int p=0,q=0;
			j=0;
			tag:
			for(i=0;i<tmparr.length;i++){
				for(j=wlen+i;j<tmparr.length;j++){
					for(p=i,q=j,tmp=0;tmp<wlen&j<tmparr.length;tmp++,p++,q++){
						if(!tmparr[p].trim().equals(tmparr[q].trim())){
							break;
						}else{
		
						}
					}
					if(tmp==wlen){
						n=Integer.parseInt(tmparr[q-1].trim())-(int)ch;
						if(n>=0){
							int k,tk=0;
							for(k=i;tk<wlen;k++,tk++){
								if(Integer.parseInt(tmparr[k].trim())-n==32)
									break;
							}
							if(tk==wlen)
								break tag;
						}
					}
				}
			}
			for(i=0;i<tmparr.length;i++)
				System.out.print((char)(Integer.parseInt(tmparr[i].trim())-n));
			System.out.println();
		}
	}
}
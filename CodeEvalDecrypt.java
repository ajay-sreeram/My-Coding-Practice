import java.io.*;
//import java.util.*;
public class CodeEvalDecrypt{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		//twos(Integer.parseInt(br.readLine()));	
		while((line=br.readLine())!=null){
			String given[]=line.split("\\|");
			int wlen=Integer.parseInt(given[0].trim());
			char ch=given[1].trim().charAt(0);
			String tmparr[]=given[2].trim().split(" ");
			int i,j,tmp;
			int n=0;
			int p=0,q=0;
			j=0;
			//System.out.println("TMPARR len:"+tmparr.length);
			tag:
			for(i=0;i<tmparr.length;i++){
				for(j=wlen+i;j<tmparr.length;j++){
					for(p=i,q=j,tmp=0;tmp<wlen&j<tmparr.length;tmp++,p++,q++){
						if(!tmparr[p].trim().equals(tmparr[q].trim())){
							break;
						}else{
			//				System.out.print(" p:"+p+" q:"+q+" letnum:"+tmparr[p]+" tmp:"+tmp);
						}
					}
					//System.out.println();
					if(tmp==wlen){
						n=Integer.parseInt(tmparr[q-1].trim())-(int)ch;
				//		System.out.println("Words len:"+wlen);
						if(n>=0)
						break tag;
					}
					//System.out.println("HELLO");
				}
			}
			/* System.out.println("i:"+i);
			System.out.println("j:"+j);
			System.out.println("n:"+n);
			 */
			for(i=0;i<tmparr.length;i++)
				System.out.print((char)(Integer.parseInt(tmparr[i].trim())-n));
			System.out.println();
		}
	}
}
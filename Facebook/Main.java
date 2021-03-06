import java.io.*;
public class Main{
	public static void main (String[] args) throws IOException {
		BufferedReader buffer=new BufferedReader(new FileReader("input.in"));
		PrintWriter out=new PrintWriter("output.out");
		String line;
		while((line=buffer.readLine())!=null){
			line=line.trim();
			int n=Integer.parseInt(line);
			for(int i=0;i<n;i++){
				line=buffer.readLine();
				char minarr[]=line.toCharArray();
				char maxarr[]=line.toCharArray();
				int len=minarr.length;
				int j;
				String minValue,maxValue;
				minValue=line;
				maxValue=line;
				boolean mincheck=true,maxcheck=true;
				int k=0;
				for(k=0;k<len;k++){
					int min=100,max=-1;
					int minpos=k,maxpos=k;
					for(j=k;j<len;j++){
						int tmp=(int)minarr[j]-48;
						if(mincheck&&tmp<min){
							if(!(k==0&&tmp==0)){
							min=tmp;
							minpos=j;
							}
						}
						tmp=(int)maxarr[j]-48;
						if(maxcheck&&tmp>max){
							if(!(k==0&&tmp==0)){
							max=tmp;
							maxpos=j;
							}
						}
					}
					if(k!=minpos){
					char tmp=minarr[k];
					minarr[k]=minarr[minpos];
					minarr[minpos]=tmp;
					minValue=new String(minarr);
					mincheck=false;
					}
					if(k!=maxpos){
					char tmp=maxarr[k];
					maxarr[k]=maxarr[maxpos];
					maxarr[maxpos]=tmp;
					maxValue=new String(maxarr);
					maxcheck=false;
					}
				}
				//System.out.println("Case #"+(i+1)+": "+minValue+" "+maxValue);
				out.println("Case #"+(i+1)+": "+minValue+" "+maxValue);
			}
		}
		out.close();
	}
}
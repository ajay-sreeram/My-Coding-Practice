import java.io.*;
class HackerRankGridSearch {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int t=Integer.parseInt(buffer.readLine());
		for(int cnt=0;cnt<t;cnt++){
			String tarr[]=buffer.readLine().trim().split(" ");
			int fr=Integer.parseInt(tarr[0]);
			String field[]=new String[fr];
			int i,j;
			for(i=0;i<fr;i++)
				field[i]=buffer.readLine();
			tarr=buffer.readLine().trim().split(" ");
			int sr=Integer.parseInt(tarr[0]);
			String search[]=new String[sr];
			for(i=0;i<sr;i++)
				search[i]=buffer.readLine();
			for(i=0;i<=fr-sr;i++){
				int tmp=i;
				for(j=0;j<sr;j++,tmp++){
					if(field[tmp].replace(search[j],"").length()==field[j].length())
						break;
				}
				if(j==sr)
				{
					System.out.println("YES");		
					break;
				}
			}
			if(i>fr-sr)
				System.out.println("NO");
		}
	}
}

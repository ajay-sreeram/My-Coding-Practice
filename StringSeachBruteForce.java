import java.io.*;
class StringSeachBruteForce {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		line=buffer.readLine();
		char st[]=line.trim().toCharArray();
		String line2;
		line2=buffer.readLine();
		char match[]=line2.toCharArray();
		int i,j;
		for(i=0;i<st.length-match.length;i++){
			j=0;
			while(j<match.length&&match[j]==st[i+j])
				j++;
			if(j==match.length)
				break;
		}
		if(i!=st.length-match.length)
			System.out.println("Matched");
		else
			System.out.println("NOT MATCHED");
	}
}

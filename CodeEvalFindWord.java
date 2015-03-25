import java.io.*;
class CodeEvalFindWord {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		char grid[][]=new char[3][];
			grid[0]=new char[]{'A','B','C','E'};
			grid[1]=new char[]{'S','F','C','S'};
			grid[2]=new char[]{'A','D','E','E'};
			
		char st[];
		while((line=buffer.readLine())!=null){
			st=line.toCharArray();
			int i,j;
			boolean check=false;
			lab:
			for(i=0;i<grid.length;i++){
				for(j=0;j<grid[i].length;j++){
					if(grid[i][j]==st[0])
						if(fun(grid,i,j,st,0)){
							check=true;
							break lab;
						}
				}
			}
			if(check)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
	public static boolean fun(char grid[][],int x,int y,char st[],int i){
		if(i==st.length)
			return true;
		if(i>st.length)
			return false;
		if(x<0||x>2||y<0||y>3)
			return false;
		if(grid[x][y]!=st[i])
			return false;
		if(fun(grid,x-1,y,st,i+1))return true;
		if(fun(grid,x,y-1,st,i+1))return true;
		if(fun(grid,x+1,y,st,i+1))return true;
		if(fun(grid,x,y+1,st,i+1))return true;
		return false;
	}
}

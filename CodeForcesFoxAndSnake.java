import java.io.*;
public final class CodeForcesFoxAndSnake {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String tarr[]=buffer.readLine().trim().split(" ");
		int r=Integer.parseInt(tarr[0]);
		int c=Integer.parseInt(tarr[1]);
		int i,j;
		boolean ccheck=true;
		boolean rcheck=true;
		for(i=1;i<=r;i++){
			if(rcheck){
				for(j=1;j<=c;j++){
					System.out.print("#");
				}
				rcheck=false;
			}else{
				rcheck=true;
				if(ccheck){
					ccheck=false;
					for(j=1;j<c;j++){
						System.out.print(".");
					}
					System.out.print("#");
				}else{
					ccheck=true;
					System.out.print("#");
					for(j=1;j<c;j++){
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}
}

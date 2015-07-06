import java.io.*;
public class Cube {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
		int l=Integer.parseInt(br.readLine());;
		int i=0;
		System.out.println();
		for(i=0;i<l;i++)
			System.out.print("*");
		System.out.println();
		for(int line=1;line<l/2;line++){
			System.out.print("*");
			for(i=1;i<l-1;i++)
				if(i==line-1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("*");
			for(i=1;i<line;i++)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
		for(i=1;i<l/2-1;i++)
			System.out.print(" ");
		for(i=0;i<l+1;i++)
			System.out.print("*");
		System.out.println();
		for(int line=1;line<l/2;line++){
			System.out.print("*");
			for(i=1;i<l/2-1;i++)
				System.out.print(" ");
			System.out.print("*");
			if(l%2==0){
					for(i=1;i<l/2;i++)
				System.out.print(" ");
			}else{
					for(i=0;i<l/2;i++)
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(i=1;i<l/2;i++)
				System.out.print(" ");
			System.out.print("*");	
			System.out.println();
		}
		for(i=1;i<l+1;i++)
			System.out.print("*");
		for(i=1;i<l/2;i++)
			System.out.print(" ");
		System.out.print("*");
		System.out.println();
		for(int line=1;line<l/2;line++){
			for(i=1;i<l/2;i++)
				if(i==line)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("*");
			if(l%2==0){
				for(i=1;i<l/2+line;i++)
					System.out.print(" ");	
			}else{
				for(i=1;i<l/2+line+1;i++)
					System.out.print(" ");	
				
			}
			
			System.out.print("*");
			for(i=1;i<l/2-line;i++)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
		for(i=1;i<l/2;i++)
			System.out.print(" ");
		for(i=1;i<l+2;i++)
			System.out.print("*");
		
	}
}

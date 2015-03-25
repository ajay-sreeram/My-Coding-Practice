import java.io.*;
import java.util.*;
public final class CodeForcesFindLoop {
	static boolean check;
	static int x;
	static int y;
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		String tar[]=buffer.readLine().trim().split(" ");
		int r=Integer.parseInt(tar[0]);
		int c=Integer.parseInt(tar[1]);
		char arr[][]=new char[r][];
		int k,i=0,j=0;
		check=false;
		char tarr[][]=new char[r][];
		for(i=0;i<arr.length;i++){
			arr[i]=buffer.readLine().trim().toCharArray();
		}
		 for(k=0;k<r;k++){
			//tarr[k]=new char[tarr[k].length];
			tarr[k]=Arrays.copyOf(arr[k],arr[k].length);
		} 
		  for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				if(check==false){
					x=i;y=j;
		//			System.out.println("COMPLEATD");
					 for(k=0;k<r;k++)
						arr[k]=Arrays.copyOf(tarr[k],tarr[k].length); 
					fun(arr,arr[i][j],i,j,0);
				}
				else
					break;
			}
			if(check==true)
				break;
		}  
		
		//fun(arr,arr[0][0],0,0,0);
		System.out.println("No");
	}
	public static void fun(char arr[][],char clr,int i,int j,int dir){
		if(check==false&&dir!=1&&j>0)
			fun(arr,clr,i,j,i,j-1,3);
		if(check==false&&dir!=3&&j<arr[0].length-1)
			fun(arr,clr,i,j,i,j+1,1);
		if(check==false&&dir!=2&&i>0)
			fun(arr,clr,i,j,i-1,j,4);
		if(check==false&&dir!=4&&i<arr.length-1)
			fun(arr,clr,i,j,i+1,j,2);
	}
	public static void fun(char arr[][],char clr,int i,int j,int pi,int pj,int dir){
		if(pi<0||pj<0||pi>=arr.length||pj>=arr[0].length)
			return;
		if(pi==x&&pj==y){
			/* switch(dir){
						case 1:System.out.println("pi:"+pi+" pj:"+pj+" > i:"+x+" j:"+y);break;
						case 2:System.out.println("pi:"+pi+" pj:"+pj+" v i:"+x+" j:"+y);break;
						case 3:System.out.println("pi:"+pi+" pj:"+pj+" < i:"+x+" j:"+y);break;
						case 4:System.out.println("pi:"+pi+" pj:"+pj+" ^ i:"+x+" j:"+y);break;
					} */
			System.out.println("Yes");//+" x:"+x+" y:"+y);
			check=true;
			System.exit(0);
		}else{
			if(pi<0||pi>=arr.length||pj<0||pj>=arr[0].length)
				return;
			if(arr[pi][pj]==clr){				
				arr[pi][pj]='.';
				//try{
					/* switch(dir){
						case 1:System.out.println("pi:"+pi+" pj:"+pj+" > i:"+x+" j:"+y);break;
						case 2:System.out.println("pi:"+pi+" pj:"+pj+" v i:"+x+" j:"+y);break;
						case 3:System.out.println("pi:"+pi+" pj:"+pj+" < i:"+x+" j:"+y);break;
						case 4:System.out.println("pi:"+pi+" pj:"+pj+" ^ i:"+x+" j:"+y);break;
					} */
				//	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
				//	String st=buffer.readLine();
				//}
				//catch(IOException e){
				//}	
				fun(arr,clr,pi,pj,dir);			
			}
				
		}
	}
}

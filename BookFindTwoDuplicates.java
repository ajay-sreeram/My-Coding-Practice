import java.io.*;
class BookFindTwoDuplicates {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String tarr[]=line.split(" ");
			int arr[]=new int[tarr.length];
			int i;
			for(i=0;i<arr.length;i++)
				arr[i]=Integer.parseInt(tarr[i]);
			find(arr);
		}
	}
	public static void find(int arr[]){
		int xor=arr[0],i;
		
		for(i=1;i<arr.length;i++){
			xor=xor^arr[i];
		}
		for(i=1;i<=arr.length-2;i++)
			xor=xor^i;
		int x=0,y=0;
		int rightBit=xor&~(xor-1);
		for(i=1;i<=arr.length-2;i++){
			if((i&rightBit)==1)
				x=x^i;
			else
				y=y^i;
		}
		for(i=0;i<arr.length;i++){
			if((arr[i]&rightBit)==1)
				x=x^arr[i];
			else
				y=y^arr[i];
		}
		System.out.println(x+":"+y+"::"+xor);
	}
}

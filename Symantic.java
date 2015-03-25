import java.io.*;
public class  Symantic
{ 
//1-inner node,2-leaf,0-empty
static int max1,max2;
	public static void main(String args[]){
		String arr[]=new String[]//{null,"D1","C1","C2"};
		{null,"D1","D2","D3","D4","D5","D6",null,"C1",null,"C2","C3","D7","D8",null,null,null,null,null,null,null,null,null,null,"C4",null,"C5","C6",null,null,null,null};
		maxMediators(arr);
	}
    public static void maxMediators(String[] input1)
    {
		max1=0;max2=0;
		int arr[]=new int[input1.length];
		for(int i=0;i<input1.length;i++){
			if(input1[i]==null)
				arr[i]=0;
			else if(input1[i].charAt(0)=='C')
				arr[i]=2;
			else
				arr[i]=1;
		}
		//for(int i=0;i<arr.length;i++){
		//	System.out.println(i+":"+arr[i]);
		//}
        printPaths(arr,1,0);
		System.out.println("\nmax1:"+max1+" max2:"+max2+" =>"+(max1-2+max2-2+1));
    }
	public static void printPaths(int arr[],int index,int pathLen){
		if(index>=arr.length||arr[index]==0)
			return ;
		pathLen++;
		if((2*index>=arr.length||arr[2*index]==0)&&(2*index+1>=arr.length||arr[2*index+1]==0))
		{
				System.out.println("\nindex:"+index+"h:"+pathLen);
			if(pathLen>max2){
				max2=pathLen;
				if(max2>max1){
					int tmp=max2;
					max2=max1;
					max1=tmp;
				}
			}
		}
		else{
			printPaths(arr,2*index,pathLen);
			printPaths(arr,2*index+1,pathLen);
			
		}
	}		
}
import java.util.*;
public class Hari2{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String st=in.nextLine();
String stArr[]=st.split(" ");
int buff[]=new int[stArr.length];
for(int i=0;i<stArr.length;i++)
	buff[i]=i;
sort(stArr,buff);
for(int i=0;i<stArr.length;i++)
	System.out.print(" "+stArr[i]);
}
public static void sort(String arr[],int buff[]){
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++)
		if(arr[i].length()>arr[j].length()){
		String stTemp=arr[j];
		arr[j]=arr[i];
		arr[i]=stTemp;
		int tmp=buff[j];
		buff[j]=buff[i];
		buff[i]=tmp;
		}
}
}
}

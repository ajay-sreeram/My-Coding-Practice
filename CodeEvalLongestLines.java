import java.io.*;
import java.util.*;
import java.text.*;
public class CodeEvalLongestLines {
    public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		int n=Integer.parseInt(buffer.readLine());
		int tmp=0;
		String arr[]=new String[n];
		while(tmp!=n){
			line=buffer.readLine();
			arr[tmp]=line;
			tmp++;
		}
		sort(arr);
		while((line=buffer.readLine())!=null&&line.trim().length()!=0){
			insert(arr,line);
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	public static void sort(String arr[]){
	int i,j;
	for(i=0;i<arr.length;i++)
		for(j=i+1;j<arr.length;j++){
			if(arr[i].length()<=arr[j].length())
			{
				//swap(arr[i],arr[j]);
				String tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
	public static void insert(String arr[],String line){
		int i,j;
		int len=line.length();
		for(i=0;i<arr.length;i++){
			if(line.length()>=arr[i].length()){
				break;
			}
		}
		if(i<arr.length){
			String tmp=arr[i];
			arr[i]=line;
			for(++i;i<arr.length;i++){
				//swap(tmp,arr[i]);
				String tmp1=tmp;
				tmp=arr[i];
				arr[i]=tmp1;
			}
		}
		else if(i==arr.length){
				i--;
			if(line.length()>=arr[i].length()){
				//swap(line,arr[i-1]);
				String tmp1=line;
				line=arr[i];
				arr[i]=tmp1;
			}
		}
		
		//System.out.println("ARRAY:"+Arrays.toString(arr));
	}
	public static void swap(String s1,String s2){
	String tmp=s1;
	s1=s2;
	s2=tmp;
	}
	
}
import java.io.*;
//import java.util.*;
public class CodeEValBrokenDigits {
	static int vals[][];
	public static void main (String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			String given[]=line.split(";");
			vals=new int[12][];
			fun(given[0].split(" "),given[1]);
			String num=given[1].trim();
			boolean overallcheck=false;
			for(int i=0;i<vals.length;i++){
				String tmp=given[1].replace(".","");
				int k=0;
				for(int j=i;j<vals.length;j++,k++){
					int dig=Integer.parseInt(""+tmp.charAt(k));
					if(contains(vals[j],dig)==false&&k==tmp.length)
						break;
				}
				if(k==tmp.length){
					boolean check=true;
					for(int j=i,tvar=0;j<vals.length&&tvar<num.length();j++,tvar++)
						if(num.charAt(tvar)=='.')
							if(vals[j][vals[j].length-1]==0){
								check=false;
								break;
							}
					if(check){
						System.out.println("1");
						overallcheck=true;
						break;
					}
				}
			}
			if(overallcheck==false)
				System.out.println("0");
		}
	}
	public static void contains(int arr[],int digit){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==digit)
				return true;
		}
		return false;
	}
	public static void fun(String arr[],String num){
		//int vals[][]=new int[arr.length][];
		for(int i=0;i<arr.length;i++){
			int tmp[]=new int[arr[i].length()+1];
			for(int j=0;j<arr[i].length();j++){
				if(arr[i].charAt(j)=='1')
					tmp[j+1]=1;
				else
					tmp[j+1]=0;
			}
			vals[i]=fun2(tmp);
		}
		
		
		
	}
	public static int[] fun2(int digit[]){
		//0-9 and dot
		int arr[]=new int[11];
		char tmp[][]=new char[][]{
								{1,2,3,4,5,6},
								{2,3},
								{1,2,4,5,7},
								{1,2,3,4,7},
								{2,3,6,7},
								{1,2,3,6,7},
								{1,3,4,5,6,7},
								{1,2,3},
								{1,2,3,4,5,6,7},
								{1,2,3,6,7}
								};
		for(i=0;i<tmp.length;i++){
			for(j=0;j<tmp[i].length;j++){
				if(digit[tmp[i][j]]==0)
					break;
			}
			if(j==tmp[i].length)
				arr[i]=1;
		}
		if(digit[digit.length-1]==1)
			arr[arr.length-1]=1;
		return arr;
	}
}
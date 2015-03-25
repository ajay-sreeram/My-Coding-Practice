import java.io.*;
//import java.util.*;
public class CodeEvalDigitStatistics{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
//twos(Integer.parseInt(br.readLine()));	
while((line=br.readLine())!=null){
	String tarr[]=line.trim().split(" ");
	int digit=Integer.parseInt(tarr[0]);
	long n=Long.parseLong(tarr[1]);
	switch(digit){
		case 2:twos(n);break;
		case 3:threes(n);break;
		case 4:fours(n);break;
		case 5:fives(n);break;
		case 6:sixs(n);break;
		case 7:sevens(n);break;
		case 8:eights(n);break;
		case 9:nines(n);break;
	}
}
}
public static void twos(long n){
	long arr[]=new long[4];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/4;
	int tmp=(int)(n%4);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: 0, 2: "+arr[0]+", 3: 0, 4: "+arr[1]+", 5: 0, 6: "+arr[3]+", 7: 0, 8: "+arr[2]+", 9: 0");
}
public static void threes(long n){
	long arr[]=new long[4];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/4;
	int tmp=(int)(n%4);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: "+arr[3]+", 2: 0, 3: "+arr[0]+", 4: 0, 5: 0, 6: 0, 7: "+arr[2]+", 8: 0, 9: "+arr[1]);
}
public static void fours(long n){
	long arr[]=new long[2];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/2;
	int tmp=(int)(n%2);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: 0, 2: 0, 3: 0, 4: "+arr[0]+", 5: 0, 6: "+arr[1]+", 7: 0, 8: 0, 9: 0");
}
public static void fives(long n){
	System.out.println("0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: "+n+", 6: 0, 7: 0, 8: 0, 9: 0");
}
public static void sixs(long n){
	System.out.println("0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: "+n+", 7: 0, 8: 0, 9: 0");
}
public static void sevens(long n){
	long arr[]=new long[4];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/4;
	int tmp=(int)(n%4);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: "+arr[3]+", 2: 0, 3: "+arr[2]+", 4: 0, 5: 0, 6: 0, 7: "+arr[0]+", 8: 0, 9: "+arr[1]);
}
public static void eights(long n){
	long arr[]=new long[4];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/4;
	int tmp=(int)(n%4);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: 0, 2: "+arr[2]+", 3: 0, 4: "+arr[1]+", 5: 0, 6: "+arr[3]+", 7: 0, 8: "+arr[0]+", 9: 0");
}
public static void nines(long n){
	long arr[]=new long[2];
	int i=0;
	for(i=0;i<arr.length;i++)
		arr[i]=n/2;
	int tmp=(int)(n%2);
	for(i=0;i<tmp;i++)
		arr[i]++;
	System.out.println("0: 0, 1: "+arr[1]+", 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: "+arr[0]);
}

}
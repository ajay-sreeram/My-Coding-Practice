import java.util.*;
public class tempp{

public static void main(String args[])throws java.lang.Throwable{
Scanner in=new Scanner(System.in);
System.out.println("Enter key(4 numbers) in single Line");
String temp[]=in.nextLine().split(" ");
int key[][];
int i,j,k;
double size=Math.sqrt(temp.length);
if(size==(long)size)
{
	key=new int[(int)size][];
	k=0;
	for(i=0;i<(int)size;i++){
		key[i]=new int[(int)size];
		for(j=0;j<(int)size;j++)
			{key[i][j]=Integer.parseInt(temp[k]);k++;}	
	}
	int det=Math.abs(inv(key[0][0]*key[1][1]-key[1][0]*key[0][1]));
	int tempint=key[0][0];
	key[0][0]=key[1][1]*det;
	key[1][0]=(-1*key[1][0])*det;
	key[0][1]=(-1*key[0][1])*det;
	key[1][1]=tempint*det;
	
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			key[i][j]%=26;
			
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			if(key[i][j]<0)
				key[i][j]=26+key[i][j];
				
	/*System.out.println("Inverse key:");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			System.out.print(key[i][j]+" ");
	System.out.println();*/
	
	System.out.println("Enter encrypted text:");
	String text=in.nextLine();
	if(text.length()%2!=0)
		text=text+"z";
	System.out.println("Decripted text is:");
	for(i=0;i<text.length()-1;i+=2)
		System.out.print(decript(text.substring(i,i+2),key));
	
}
else{
System.out.println("not a square matrix");
return ;
}
}

public static String decript(String st,int key[][]){
int num[]=new int[2];
num[0]=((int)st.charAt(0))-97;
num[1]=((int)st.charAt(1))-97;
int t1,t2;
t1=key[0][0]*num[0]+key[0][1]*num[1];
t2=key[1][0]*num[0]+key[1][1]*num[1];
t1%=26;
t2%=26;
if(t1<0)
	t1=26+t1;
if(t2<0)
	t2=26+t2;

return ""+(char)(t1+97)+(char)(t2+97);

}

public static List<Integer> list;
public static int result=0;
public static int inv(int n){
	list=new ArrayList<Integer>();
	list.add(1);
	invRec(n);
	return result;
}
public static void invRec(int num){
	int x1,x2,x3,y1,y2,y3;
	x1=1;
	x2=0;
	x3=26;
	y1=0;
	y2=1;
	y3=num;
	int q=x3/y3;int t1,t2,t3;
	while(y3!=1&&y3!=0){
		q=x3/y3;
		t1=x1;t2=x2;t3=x3;
		x1=y1;
		x2=y2;
		x3=y3;
		y1=t1-q*y1;
		y2=t2-q*y2;
		y3=t3-q*y3;
	}
//	System.out.println();
if(y3==1)
	{
	if(list.contains(y2))
		{
			result=y2;
			return ;
		}
	else
		{
			list.add(y2);
			invRec(y2);
		}
	}
if(y3==0)
	{
		result=0;
		return;
	}

}

}
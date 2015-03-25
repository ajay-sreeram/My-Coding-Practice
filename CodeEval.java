/*
##########
#        #
#    * o #
#  o     #
/    o   #
# o *    #
#        #
#        #
#        #
##########

##########
#  /\ /\ #
# /  * o\#
#/ o/ \ /#
/  / o X #
# o * / \#
#/ \ /  /#
#\  X  / #
# \/ \/  #
##########
*/
import java.util.*;
import java.io.*;
public class CodeEval{
public static void main(String args[])throws IOException{
//Scanner in=new Scanner(System.in);
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String st="";
while((st=in.readLine().trim())!=null&&st.length()>2){
//System.out.println("\nresult:\n"+st);

	int i,j,k,p,q;
	char arr[][]=new char[15][15];
	for(i=1,k=0;i<=10;i++){
		for(j=1;j<=10;j++){
			arr[i][j]=st.charAt(k++);
		}
	}

	System.out.println("\nBEFORE");
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=10;j++)
			System.out.print(arr[i][j]);
		System.out.println();
	}

	int cnt=1;
	if(arr[1][1]=='\\')
		fun(arr,1+1,1+1,4,cnt);
	else if(arr[1][1]=='/')
		return;
	else if(arr[1][10]=='/')
		fun(arr,1+1,10-1,3,cnt);
	else if(arr[1][10]=='\\')
		return;
	else if(arr[10][1]=='/')
		fun(arr,10-1,1+1,1,cnt);
	else if(arr[10][1]=='\\')
		return;
	else if(arr[10][10]=='\\')
		fun(arr,10-1,10-1,2,cnt);
	else if(arr[10][10]=='/')
		return;
	else
	{
		for(i=2;i<10;i++){
			if(arr[i][1]=='/')
				{fun(arr,i-1,1+1,1,cnt);break;}
			if(arr[i][1]=='\\')
				{fun(arr,i+1,1+1,4,cnt);break;}
			
			if(arr[i][10]=='/')
				{fun(arr,i+1,10-1,3,cnt);break;}
			if(arr[i][10]=='\\')
				{fun(arr,i-1,10-1,2,cnt);break;}
				
			if(arr[1][i]=='/')
				{fun(arr,1+1,i-1,3,cnt);break;}
			if(arr[1][i]=='\\')
				{fun(arr,1+1,i+1,4,cnt);break;}
				
			if(arr[10][i]=='/')
				{fun(arr,10-1,i+1,1,cnt);break;}
			if(arr[10][i]=='\\')
				{fun(arr,10-1,i-1,2,cnt);break;}
		}
	}

	System.out.println("AFTER");
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=10;j++)
			System.out.print(arr[i][j]);
		System.out.println();
	}
	
	//st="";
	//for(i=1;i<=10;i++)
	//	st=st+(new String(arr[i]));
	//System.out.println(st);
}
}

public static void fun(char arr[][],int p,int q,int type,int cnt){
if(cnt==20)
	return;

if(p<1||p>10||q<1||q>10)
	return;
if(
	(p==1&&q==1)
	||
	(p==1&&q==10)
	||
	(p==10&&q==10)
	||
	(p==10&&q==1)
  )
  return ;
if(arr[p][q]=='o')
	return;
	
if(arr[p][q]=='*')
{
	if(type==1)
	{
		fun(arr,p-1,q+1,1,cnt);
		fun(arr,p+1,q+1,4,cnt);
		fun(arr,p-1,q-1,2,cnt);
		return;
	}
	if(type==2)
	{
		fun(arr,p-1,q-1,2,cnt);
		fun(arr,p-1,q+1,1,cnt);
		fun(arr,p+1,q-1,3,cnt);
		return;
	}
	if(type==3)
	{
		fun(arr,p+1,q-1,3,cnt);
		fun(arr,p-1,q-1,2,cnt);
		fun(arr,p+1,q+1,4,cnt);
		return;
	}
	if(type==4)
	{
		fun(arr,p+1,q+1,4,cnt);
		fun(arr,p-1,q+1,1,cnt);
		fun(arr,p+1,q-1,3,cnt);
		return;
	}
}

if(arr[p][q]=='#'){
	if(type==1&&p==1)
	{
		q--;
		fun(arr,p+1,q+1,4,cnt);
		return;
	}
	if(type==1&&q==10)
	{
		p++;
		fun(arr,p-1,q-1,2,cnt);
		return;
	}
	
	if(type==2&&p==1)
	{
		q++;
		fun(arr,p+1,q-1,3,cnt);
		return;
	}
	if(type==2&&q==1)
	{
		p++;
		fun(arr,p-1,q+1,1,cnt);
		return;
	}
	
	if(type==3&&p==10)
	{
		q++;
		fun(arr,p-1,q-1,2,cnt);
		return;
	}
	if(type==3&&q==1)
	{
		p--;
		fun(arr,p+1,q+1,4,cnt);
		return;
	}
	
	if(type==4&&p==10)
	{
		q--;
		fun(arr,p-1,q+1,1,cnt);
		return;
	}
	if(type==4&&q==10)
	{
		p--;
		fun(arr,p+1,q-1,3,cnt);
		return;
	}
}


if(arr[p][q]==' '||arr[p][q]=='/'||arr[p][q]=='\\'||arr[p][q]=='X')
{
	if(type==1)
	{
		if(arr[p][q]!='X')
		{
			if(arr[p][q]=='\\')
				arr[p][q]='X';
			else
				arr[p][q]='/';
		}
		fun(arr,p-1,q+1,1,cnt+1);
		return;
	}
	if(type==2)
	{
		if(arr[p][q]!='X')
		{
			if(arr[p][q]=='/')
				arr[p][q]='X';
			else
				arr[p][q]='\\';
		}
		fun(arr,p-1,q-1,2,cnt+1);
		return;
	}
	if(type==3)
	{
		if(arr[p][q]!='X')
		{
			if(arr[p][q]=='\\')
				arr[p][q]='X';
			else
				arr[p][q]='/';
		}
		fun(arr,p+1,q-1,3,cnt+1);
	}
	if(type==4)
	{
		if(arr[p][q]!='X')
		{
			if(arr[p][q]=='/')
				arr[p][q]='X';
			else
				arr[p][q]='\\';
		}
		
		//System.out.println("HELLO");
		
		fun(arr,p+1,q+1,4,cnt+1);
	}
}

}


}
//import java.util.*;
public class Solution6{
public static void main(String args[]){
java.util.Scanner in=new java.util.Scanner(System.in);

String st[];
int i,j;
int t=Integer.parseInt(in.nextLine());
for(j=0;j<t;j++)
{
st=in.nextLine().split(" ");
char arr[]=new char[st.length];
for(i=0;i<st.length;i++)
	arr[i]=st[i].charAt(0);
if(arr[0]!='{'||arr[arr.length-1]!='}')
System.out.println("Compilation Errors");
else
{
arr=java.util.Arrays.copyOfRange(arr,1,arr.length-1);
//System.out.println(Arrays.toString(arr));
if(check(arr))
System.out.println("No Compilation Errors");
else
System.out.println("Compilation Errors");
}
}

}



public static boolean check(char arr[])
{
if(arr.length==0)
return false;
Stack main,nrml;
int cnt;
main=new Stack();
nrml=new Stack();
char tmp;
int i;
boolean checking=false;
for(i=0;i<arr.length;i++)
{
	if(nrml.pos()!=-1||main.pos()!=-1)
		return false;
	char ch=arr[i];
	if(ch=='<')
		{
			if(checking==false)
				checking=true;
			else
				return false;
			cnt=0;
			main.push(ch);
			i++;
				if(i==arr.length)
					return false;
			while(arr[i]!='>'&&main.pos()>=0)
			{
				switch(arr[i]){
				case '{':main.push(arr[i]);break;
				case '}':if(main.pos()>0&&main.cur()=='{')
							tmp=main.pop();
						else
							return false;
						break;
				case 'P':cnt++;break;
				default:return false;
				}
				if(cnt>100)
					return false;
				i++;
				if(i==arr.length)
					return false;
			}
			if(arr[i]=='>')
			tmp=main.pop();
			
		}
	else if(ch=='(')
	{
		nrml.push(ch);
		cnt=0;
		i++;
			if(i==arr.length)
					return false;
		while(arr[i]!=')')
		{
			switch(arr[i])
			{
				case '{':nrml.push(arr[i]);break;
				case '}':if(nrml.cur()=='{')
							nrml.pop();
						else
							return false;
				case 'P':	cnt++;break;
				default : return false;
			}
			i++;
			if(i==arr.length)
					return false;
		}
		if(arr[i]==')')
			nrml.pop();
		if(cnt>100)
			return false;
	}
	else
	return false;
}
if(i==arr.length&&main.pos()==-1&&nrml.pos()==-1&&checking)
return true;
else
return false;


}

}


class Stack{
int top;
char arr[];
public Stack()
{
top=-1;
arr=new char[10000];
}
public void push(char c)
{
arr[++top]=c;
}
public char pop(){
return arr[top--];
}
public char cur()
{
return arr[top];
}
public int pos()
{
return top;
}
}

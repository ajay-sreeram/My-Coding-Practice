import java.io.*;
import java.util.*;
class Stack{
	char arr[];
	int loc;
	public Stack(){
		loc=-1;
		arr=new char[40];
	}
	public char pop(){
		return arr[loc--];
	}
	public void push(char ch){
		loc++;
		arr[loc]=ch;
	}
	public boolean isEmpty(){
		if(loc==-1)
			return true;
		else
			return false;
	}
	public char top(){
		return arr[loc];
	}
}
public class Infix{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String tmp=br.readLine().trim();
			System.out.println(fun(tmp.toCharArray()));
		}
	}
	public static String fun(char arr[]){
		String st="";
		int i=0;
		Stack stack=new Stack();
		stack.push(arr[i]);
		i++;
		while(!stack.isEmpty()&&i<arr.length){
			if(Character.isLetter(arr[i])){
				st=st+arr[i];
				i++;
				continue;
			}
			if(arr[i]==')'){
				while(!stack.isEmpty()&&stack.top()!='('){
					st=st+stack.pop();
				}
				char tmp;
				if(!stack.isEmpty())
					tmp=stack.pop();
			}
			else
				stack.push(arr[i]);
			i++;
		}
		return st;
	}
}

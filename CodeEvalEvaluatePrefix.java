import java.io.*;
import java.util.*;
class Node{
	public int data;
	public Node next;
	public Node(int data){
		this.data=data;
	}
}

class Stack{
Node node;
public Stack(){
	node=null;
}
public void push(int num){
	Node newNode=new Node(num);
	newNode.next=node;
	node=newNode;
}
public int pop(){
	int val=node.data;
	node=node.next;
	return val;
}
public int top(){
	return node.data;
}
public boolean isEmpty(){
	if(node==null)
		return true;
	else
		return false;
}
}

public class CodeEvalEvaluatePrefix{
public static void main (String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
		while((line=buffer.readLine())!=null){
			line=new StringBuilder(line).reverse().toString();
			String arr[]=line.split(" ");
			Stack stk=new Stack();
			//System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i++){
				try{
					int n=Integer.parseInt(arr[i].trim());
					stk.push(n);
				}
				catch(NumberFormatException e){
					int val1,val2;
					String tmp=arr[i].trim();
					if(tmp.equals("+")){
						val1=stk.pop();
						val2=stk.pop();
						stk.push((int)(val1+val2));
					}
					else if(tmp.equals("*")){
						val1=stk.pop();
						val2=stk.pop();
						stk.push((int)(val1*val2));
					}
					else if(tmp.equals("/")){
						val1=stk.pop();
						val2=stk.pop();
						stk.push((int)(val1/val2));
					}
				}
			//	System.out.println("TOP:"+stk.top());
			}
			System.out.println(stk.pop());
		}
	}
}
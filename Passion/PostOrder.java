class Node{
int data;
Node left;
Node right;
public Node(int data){
this.data=data;
}
public int getData(){
return this.data;
}
public void setData(int data){
this.data=data;
}
public Node getLeft(){
return left;
}
public void setLeft(Node left){
this.left=left;
}
public Node getRight(){
return right;
}
public void setRight(Node right){
this.right=right;
}
}

class StackNode{
Node val;
StackNode next;
public StackNode(Node val){
this.val=val;
}
}

class Stack{
StackNode head;
public Node top(){
return head.val;
}
public void push(Node n){
if(head==null)
	head=new StackNode(n);
else
	{
		StackNode tmp=new StackNode(n);
		tmp.next=head;
		head=tmp;
		
	}
}

public Node pop(){
if(head==null)
	return null;
Node tmp=head.val;
head=head.next;
return tmp;
}

public boolean isEmpty(){
if(head==null)
	return true;
else
	return false;
}
}


public class PostOrder{
	public static void main(String args[]){
		Node root=new Node(1);
		Node t1=new Node(4);
		Node t2=new Node(5);
		Node t3=new Node(6);
		Node t4=new Node(7);
		Node t5=new Node(2);
		Node t6=new Node(3);
		t5.setLeft(t1);
		t5.setRight(t2);
		t6.setLeft(t3);
		t6.setRight(t4);
		root.setLeft(t5);
		root.setRight(t6);
		traversal(root);
	}
	public static void traversal(Node root){
	Stack s=new Stack();
	while(true){
		if(root!=null){
			s.push(root);
			root=root.getLeft();
		}
		else{
			if(s.isEmpty()){
				System.out.println("EMPTY");
				return;
			}
			else{
				if(s.top().getRight()==null)
				{
					root=s.pop();
					System.out.println(root.getData());
					if(root==s.top().getRight()){
						System.out.println(s.top().getData());
						s.pop();
					}
				}
			}
			if(!s.isEmpty())
				root=s.top().getRight();
			else
				root=null;
		}
	}
	}
}
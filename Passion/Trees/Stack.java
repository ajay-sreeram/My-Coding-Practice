public class Stack{
QNode ptr;
public boolean isEmpty(){
if(ptr==null)
	return true;
return false;
}
public void push(BinaryTreeNode val){
QNode node=new QNode();
node.setVal(val);
node.setNext(ptr);
ptr=node;
}
public BinaryTreeNode pop(){
QNode node=ptr;
ptr=ptr.getNext();
return node.getVal();
}
public BinaryTreeNode top(){
return ptr.getVal();
}

}
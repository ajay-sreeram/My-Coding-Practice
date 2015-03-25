public class QNode{
BinaryTreeNode val;
QNode next;
/*public QNode(BinaryTreeNode val){
	this.val=val;
}*/
public void setVal(BinaryTreeNode val){
this.val=val;
}
public BinaryTreeNode getVal(){
	return val;
}
public void setNext(QNode node){
next=node;
}
public QNode getNext(){
return next;
}
}
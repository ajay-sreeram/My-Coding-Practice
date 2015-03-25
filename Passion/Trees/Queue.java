public class Queue{
QNode frontNode;
QNode rearNode;
void enQueue(BinaryTreeNode val){
	QNode node=new QNode();
	node.setVal(val);
	if(frontNode==null)
		frontNode=node;
	else{
		rearNode.setNext(node);
	}
	rearNode=node;
}

BinaryTreeNode deQueue(){
QNode node;
if(frontNode==rearNode){
	node=frontNode;
	frontNode=rearNode=null;
}
else{
	node=frontNode;
	frontNode=frontNode.next;
}
return node.getVal();
}

boolean isEmpty(){
if(frontNode==null)
	return true;
return false;
}

}
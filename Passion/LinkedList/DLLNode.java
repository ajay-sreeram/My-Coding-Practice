public class DLLNode{
int data;
DLLNode prevNode;
DLLNode nextNode;
public DLLNode(int data){
this.data=data;
prevNode=null;
nextNode=null;
}
public DLLNode(int data,DLLNode prevNode,DLLNode nextNode){
this.data=data;
this.prevNode=prevNode;
this.nextNode=nextNode;
}
public int getData(){
	return data;
}
public void setData(int data){
	this.data=data;
}
public void setPrevNode(DLLNode prevNode){
	this.prevNode=prevNode;
}
public void setNextNode(DLLNode nextNode){
	this.nextNode=nextNode;
}
public DLLNode getPrevNode(){
	return prevNode;
}
public DLLNode getNextNode(){
	return nextNode;
}
}
public class PreOrder{
public static void main(String args[]){
BinaryTreeNode root=new BinaryTreeNode();
root.setData(1);
BinaryTreeNode tmp1=new BinaryTreeNode();
tmp1.setData(2);
BinaryTreeNode tmp2=new BinaryTreeNode();
tmp2.setData(3);
BinaryTreeNode tmp3=new BinaryTreeNode();
tmp3.setData(4);
BinaryTreeNode tmp4=new BinaryTreeNode();
tmp4.setData(5);
BinaryTreeNode tmp5=new BinaryTreeNode();
tmp5.setData(6);
BinaryTreeNode tmp6=new BinaryTreeNode();
tmp6.setData(7);
root.setLeft(tmp1);
root.setRight(tmp2);
tmp1.setLeft(tmp3);
tmp1.setRight(tmp4);
tmp2.setLeft(tmp5);
tmp2.setRight(tmp6);
preOrder(root);
System.out.println();
//preOrder2(root);
preOrder3(root);
}

public static void preOrder(BinaryTreeNode node){
if(node==null)
	return;
System.out.print(" "+node.getData());
preOrder(node.left);
preOrder(node.right);
}
public static void preOrder2(BinaryTreeNode node){
Queue q=new Queue();
q.enQueue(node);
while(!q.isEmpty()){
	BinaryTreeNode tmp=q.deQueue();
	System.out.print(" "+tmp.getData());
	if(tmp.getLeft()!=null)
		q.enQueue(tmp.getLeft());
	if(tmp.getRight()!=null)
		q.enQueue(tmp.getRight());		
}
}
public static void preOrder3(BinaryTreeNode root){
Stack s=new Stack();
while(true)
{
	while(root!=null){
		System.out.print(" "+root.getData());
		s.push(root);
		root=root.getLeft();
	}
	if(s.isEmpty())
		break;
	root=s.pop();
	root=root.getRight();
}
}

}
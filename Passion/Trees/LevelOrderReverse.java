public class LevelOrderReverse{
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
levelOrder(root);

}
static void levelOrder(BinaryTreeNode root){
	Queue q=new Queue();
	Stack s=new Stack();
	q.enQueue(root);
	while(!q.isEmpty()){
		BinaryTreeNode node=q.deQueue();
		if(node.getLeft()!=null)
			q.enQueue(node.getRight());
		if(node.getRight()!=null)
			q.enQueue(node.getLeft());
		s.push(node);
	}
	while(!s.isEmpty()){
		System.out.print(" "+s.pop().getData());
	}
}
}

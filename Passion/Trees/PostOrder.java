public class PostOrder{
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
postOrder(root);
System.out.println();
//preOrder2(root);
postOrder3(root);
}
static void postOrder(BinaryTreeNode root){
if(root==null)
	return;
postOrder(root.getLeft());
postOrder(root.getRight());
System.out.print(" "+root.getData());
}

static void postOrder3(BinaryTreeNode root){
Stack s=new Stack();
while(true){
	while(root!=null){
		s.push(root);
		root=root.getLeft();
	}
	if(s.isEmpty())
			return;
		BinaryTreeNode tmp=s.pop();
		System.out.print(" "+tmp.getData());
	if(s.isEmpty())
			return;	
	if(s.top().getRight()!=null)
	{
		if(s.top().getRight()!=tmp){
			//s.push(s.top().getRight());
			root=s.top().getRight();
		}
	}
}

}

}

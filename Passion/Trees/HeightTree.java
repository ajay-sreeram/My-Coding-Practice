//max represent diameter of tree, level represent height of binary tree
public class HeightTree{
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
System.out.println("Height:"+height(root));
}
public static int height(BinaryTreeNode root){
int level=1;
Queue q=new Queue();
q.enQueue(root);
q.enQueue(null);
int max=0,cnt=1;

while(!q.isEmpty()){
BinaryTreeNode tmp=q.deQueue();
if(tmp==null){
	level++;
	if(!q.isEmpty())
		q.enQueue(null);
	if(cnt>max)
		max=cnt;
	cnt=0;
	continue;
}
cnt++;
if(tmp.getLeft()!=null)
	q.enQueue(tmp.getLeft());
if(tmp.getRight()!=null)
	q.enQueue(tmp.getRight());
}

return max;
}
}
public class Ancestors{
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
BinaryTreeNode node=new BinaryTreeNode();
node.setData(5);
ancestors(root,node);
}
static int ancestors(BinaryTreeNode root,BinaryTreeNode node){
if(root==null)
	return 0;
if((root.getLeft()!=null&&root.getLeft().getData()==node.getData())||(root.getRight()!=null&&root.getRight().getData()==node.getData())||ancestors(root.getLeft(),node)==1||ancestors(root.getRight(),node)==1)
{
	System.out.print(" "+root.getData());
	return 0;
}
return 1;
} 
}
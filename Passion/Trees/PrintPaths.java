public class PrintPaths{
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
int patharr[]=new int[20];
paths(root,patharr,0);
}

static void paths(BinaryTreeNode node,int patharr[],int pathLen){
patharr[pathLen]=node.getData();
pathLen++;
if(node.getLeft()==null&&node.getRight()==null)
	printPaths(patharr,pathLen);
else{
	paths(node.getLeft(),patharr,pathLen);
	paths(node.getRight(),patharr,pathLen);
}
}

static void printPaths(int arr[],int len){
for(int i=0;i<len;i++)
	System.out.print(" "+arr[i]);
System.out.println();
}
}
public class TreeNode{
int data;
TreeNode nextSibling;
TreeNode firstChild;
public int getData(){
	return data;
}
public void setData(int data){
	this.data=data;
}
public TreeNode getFirstChild(){
	return firstChild;
}
public void setFirstChild(TreeNode firstChild){
	this.firstChild=firstChild;
}
public void setNextSibling(TreeNode nextSibling){
	this.nextSibling=nextSibling;
}
public TreeNode getNextSibling(){
	return nextSibling;
}
}
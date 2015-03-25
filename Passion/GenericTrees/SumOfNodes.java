public class SumOfNodes{
public static void main(String args[]){
	TreeNode root=new TreeNode();
	root.setData(1);
	TreeNode b=new TreeNode();
	b.setData(2);
	TreeNode c=new TreeNode();
	c.setData(3);
	TreeNode d=new TreeNode();
	d.setData(4);
	TreeNode e=new TreeNode();
	e.setData(5);
	TreeNode f=new TreeNode();
	f.setData(6);
	TreeNode g=new TreeNode();
	g.setData(7);
	TreeNode h=new TreeNode();
	h.setData(8);
	TreeNode i=new TreeNode();
	i.setData(9);
	TreeNode j=new TreeNode();
	j.setData(10);
	TreeNode k=new TreeNode();
	k.setData(11);
	TreeNode l=new TreeNode();
	l.setData(12);
	TreeNode m=new TreeNode();
	m.setData(13);
	TreeNode n=new TreeNode();
	n.setData(14);
	TreeNode p=new TreeNode();
	p.setData(15);
	TreeNode q=new TreeNode();
	q.setData(16);
	root.setFirstChild(b);
	b.setNextSibling(c);
	c.setNextSibling(d);
	d.setFirstChild(h);
	d.setNextSibling(e);
	e.setFirstChild(i);
	i.setNextSibling(j);
	j.setFirstChild(p);
	p.setNextSibling(q);
	e.setNextSibling(f);
	f.setFirstChild(k);
	k.setNextSibling(l);
	l.setNextSibling(m);
	f.setNextSibling(g);
	g.setFirstChild(n);
	System.out.println("SUM IS:"+sum(root));
}
public static int sum(TreeNode node){
if(node==null)
	return 0;
System.out.print(" "+node.getData());
return node.getData()+sum(node.getFirstChild())+sum(node.getNextSibling());
}
}

import java.io.*;
class KthSmallestInTree {
	public static void main(String[] args)throws IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buffer.readLine())!=null){
			
		}
	}
	public static Node KthSmallest(Node root,int k,int cnt){
		if(root==null)
			return null;
		Node left=Kthsmallest(root.left,k,cnt);
		if(left!=null)
			return left;
		if(++cnt==k)
			return root;
		return Kthsmallest(root.right,k,cnt);
	}
}

class Trie{
	private TstNode root;
	private class TstNode{
		char data;
		boolean isWord;
		TstNode left,right,middle;
		public TstNode(char ch){
			this.data=ch;
			this.isWord=false;
		}
		public TstNode(char ch,boolean check){
			this.data=ch;
			this.isWord=check;
		}
	}
	public boolean contains(String key){
		return auxContains(root,key,0);
	}
	public boolean auxContains(TstNode cur,String key,int index){
		if(cur==null)
			return false;
		if(key.charAt(0)==cur.data){
			if(key.length()>1)
				return auxContains(cur.middle,key.substring(1));
			return cur.isWord;
		}else if(key.charAt(0)<cur.data){
			return auxContains(cur.left,key);
		}else
			return auxContains(cur.right,key);
	}
	public void add(String key){
		root=auxAdd(root,key);
	}
	public TstNode auxAdd(TstNode cur,String key){
		if(cur==null){
			TstNode cur=new TstNode(key.charAt(0));
		}
		if(key.charAt(0)==cur.data){
			if(key.length()>1)
				cur.middle=auxContains(cur.middle,key.substring(1));
			else
				cur.isWord=true;
		}else if(key.charAt(0)<cur.data){
			cur.left=auxContains(cur.left,key);
		}else{
			cur.right=auxContains(cur.right,key);
		}
		return cur;
	}
}
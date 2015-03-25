import java.util.*;
public class Solution10 {
	public static void main(String args[]){
		System.out.println(new Solution10().subsetsWithDup(new char[]{'a','a','b'}));
	}
    public List<List<String>> subsetsWithDup(char[] num) {
        List<List<String>> res=new LinkedList<List<String>>();
        for(int i=1;i<=num.length;i++)
            auxSubSetWithDup(res,num,"",i,0);
        res.add(new LinkedList<String>());
        return res;
    }
    public void auxSubSetWithDup(List<List<String>> res,char num[],String list,int size,int index){
        if(list.length()==size){
			if(valid(list)){
				List<String> lst=new LinkedList<String>();
				lst.add(list);
				res.add(lst);
            }
            return;
        }
        for(int d=index;d<num.length;d++){
            list=list+num[d];
	         auxSubSetWithDup(res,num,list,size,d+1);
    		list=list.substring(0,list.length()-1);
	    }
    }
	public boolean valid(String st){
		return st.equals(new StringBuilder(st).reverse().toString());
	}
}
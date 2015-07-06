public class StringInString {
	public static void main(String args[]){
		StringInString s=new StringInString();
		System.out.println(s.minWindow("ADOBECODEBANC","ABC"));
	}
	public String minWindow(String S, String T) {
	    int sl,tl;
	    sl=S.length();tl=T.length();
	    int needToFind[]=new int[256];
	    int cnt,min,begin,end,found[]=new int[256];
	    min=Integer.MAX_VALUE;
	    begin=end=cnt=0;
	    for(int i=0;i<tl;i++)
	        needToFind[(int)T.charAt(i)]++;
	    for(int s=0,e=0;e<sl;e++){
	        if(needToFind[(int)S.charAt(e)]==0)
	            continue;
	        found[(int)S.charAt(e)]++;
	        if(found[(int)S.charAt(e)]<=needToFind[(int)S.charAt(e)])
	            cnt++;
	        if(cnt==tl){
	            while(needToFind[(int)S.charAt(s)]==0||found[(int)S.charAt(s)]>needToFind[(int)S.charAt(s)]){
	                if(found[(int)S.charAt(s)]>needToFind[(int)S.charAt(s)])
	                    found[(int)S.charAt(s)]--;
	                s++;
	            }
	            int curLen=e-s+1;
	            if(curLen<min){
	                min=curLen;
	                begin=s;
	                end=e;
					System.out.println("begin:"+s+" end:"+e+" len:"+min+" string:"+S.substring(s,e));
	            }
	        }
	    }
	    if(cnt!=tl)
	        return "";
	    //return S.substring(begin,min);
		return "NULL";
	}
}

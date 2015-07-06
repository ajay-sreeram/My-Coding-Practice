import java.util.*;
public class Hashing {
	public static void main(String args[]){
		Hashing h=new Hashing();
		List<String> lst=new ArrayList<String>();
		lst.add("cat");lst.add("dog");lst.add("god");lst.add("tca");
		System.out.println("RES:"+h.anagrams(lst));
		
	}
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
	    HashMap<String,ArrayList<Integer>> hm=new HashMap<String,ArrayList<Integer>>();
	    int i=1;
	    for(String st:A){
	        char arr[]=st.toCharArray();
	        Arrays.sort(arr);
	        String tmp=new String(arr);
	        ArrayList<Integer> al=hm.get(tmp);
	        if(al==null){
	            al=new ArrayList<Integer>();
	            al.add(i);
				hm.put(tmp,al);
	        }else{
	            al.add(i);
	        }
	        i++;
	    }
		System.out.println("HM:"+hm);
	    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	    for(Map.Entry<String, ArrayList<Integer>> map : hm.entrySet()){
	        list.add(map.getValue());
	    }
        return list;
	}
}

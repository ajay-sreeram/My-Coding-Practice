import java.util.*;
public class Chain {
	public static void main(String args[]){
		Chain f=new Chain();
		ArrayList<String> c=new ArrayList<String>();
		//["hot","dot","dog","lot","log"]
		c.add("hot");
		c.add("dot");
		c.add("dog");
		c.add("lot");
		c.add("log");
		System.out.println(c);
		System.out.println("RESULT:"+f.ladderLength("hit","cog",c));
		
	}
public int ladderLength(String start, String end, ArrayList<String> dictV) {
    LinkedList<String> queue = new LinkedList<String>();
    dictV.add(end);
    queue.add(start);
    int step = 0;
	ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
	//res.add(start);
    while (!queue.isEmpty()) {
        LinkedList<String> level = new LinkedList<String>();
        step++;
		while (!queue.isEmpty()) {
            String q = queue.poll();
            if (q.equals(end)){
                return step;
			}
            for (int i = 0; i < start.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    String s = q.substring(0, i) + c + q.substring(i + 1, start.length());
                    if (dictV.contains(s)) {
                        level.add(s);
                        dictV.remove(s);
                    }
                }
            }
        }
        queue = level;
		int i,j;
					
		System.out.println(level);
    }
    return 0;
}
}
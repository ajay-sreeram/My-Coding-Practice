import java.util.*;

public class ThreeSum {
public static void main(String args[]){
	System.out.println(new ThreeSum().threeSum(new int[]{-4,-4,-3,-2,-1,0,2}));
} 
 public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
		System.out.println(Arrays.toString(num));
        int i,j;
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        for(i=0;i<num.length-2;i++){
            System.out.println("I:"+i);
			int next=num[i],s=i+1,e=num.length-1;
            int sum;
            while(s<e){
				System.out.println("NEXT:"+next+" S:"+num[s]+" E:"+num[e]);
                sum=next+num[s]+num[e];
                if(sum==0){
                    List<Integer> list=new LinkedList<Integer>();
                    list.add(next);list.add(num[s]);list.add(num[e]);
                    if(!res.contains(list))
                    res.add(list);
					while (s < e && num[s] == num[s+1]) s++;
					while (s < e && num[e] == num[e-1]) e--;
                    s++;e--;
                }
                else if(sum>0){
                    e--;
                }else{
                    s++;
                }
            }
        }
        return res;
    }
}
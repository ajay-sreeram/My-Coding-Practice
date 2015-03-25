import java.io.*;
import java.util.*;
public class MinDivHack2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int z=0;z<tests;z++){
			int n=Integer.parseInt(br.readLine());
			String tarr[]=br.readLine().split(" ");
			HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				HashMap<Integer,Integer> tmp=factors(Integer.parseInt(tarr[i]));
				for( Integer key : tmp.keySet() ) {
					if(hm.containsKey(key)){
						if(hm.get(key)<tmp.get(key))
							hm.put(key,tmp.get(key));
					}else{
						hm.put(key,tmp.get(key));
					}
				}
			}
			int res=0;
			for ( Integer key : hm.keySet() ) {
				//System.out.println("KEY:"+key+" val:"+hm.get(key));
				res+=hm.get(key);
			}
			System.out.println(res);
		}
	}
	public static HashMap<Integer,Integer> factors(int n){
		HashMap<Integer,Integer> hm=new  HashMap<Integer,Integer>();
		while (n%2 == 0)
		{
			if(hm.containsKey(2)){
				hm.put(2, hm.get(2) + 1);
			}else{
				hm.put(2,1);
			}
			n = n/2;
		}
		for (int i = 3; i <= Math.sqrt(n); i = i+2)
		{
			while (n%i == 0)
			{
				if(hm.containsKey(i)){
					hm.put(i, hm.get(i) + 1);
				}else{
					hm.put(i,1);
				}
				n = n/i;
			}
		}
		if (n > 2){
			if(hm.containsKey(n)){
				hm.put(n, hm.get(n) + 1);
			}else{
				hm.put(n,1);
			}
		}
		return hm;
	}
}	

import java.util.*;
public class Ips {
	
	public static void main(String args[]){
		System.out.println("0100100");
		System.out.println(restoreIpAddresses("0100100"));
	}
    public static ArrayList<String> res;
	public static ArrayList<String> restoreIpAddresses(String A) {
	    ArrayList<String> ips=new ArrayList<String>();
	    res=new ArrayList<String>();
	    Ips(0,new ArrayList<String>(),A);
	    return res;
	}
	public static void Ips(int p,List<String> ip,String st){
	    if(ip.size()==4){
	        if(p==st.length())
	            res.add(ip.get(0)+"."+ip.get(1)+"."+ip.get(2)+"."+ip.get(3));
	    }else{
    	    for(int size=1;size<=3;size++){
    	         if(p+size<=st.length()) {
    	             String tmp=st.substring(p,p+size);
    	             if(tmp.length()>1&&tmp.charAt(0)=='0')
    	                continue;
    	             int num=Integer.parseInt(tmp);
    	             if(num<=255){ 
    	                 ip.add(tmp);
						 System.out.println("POS:"+p);
    	                 System.out.println(ip+" :"+ip.size()+" pos:"+(p+size)+" len:"+st.length());
						 Ips(p+size,ip,st);
						 //System.out.println(ip);
    	                 ip.remove(tmp);
    	             }
    	         }
    	    }
	    }
	}
}

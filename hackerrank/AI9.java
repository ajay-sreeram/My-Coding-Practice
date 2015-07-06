import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        int len=st.length()/3;
        if(len==0)
            System.out.println("0");
        else{
            int count=0;
            List<String> list1=new <String>ArrayList();
			
			for(int l=1;l<=st.length();l++){
				for(int i=0;i+l<=st.length();i+=l){
					String tmp=st.substring(i,i+l);
					if(!list1.contains(tmp))
						list1.add(tmp);
				}
			}
			
			List<String> list2=new <String>ArrayList();
			for(int l=1;l<=len;l++){
				for(int i=0;i+l<=st.length();i+=l){
					String tmp=st.substring(i,i+l);
					if(!list2.contains(tmp))
						list2.add(tmp);
				}
			}
            String arr1[]=new String[list1.size()];
            arr1=list1.toArray(arr1);
			
			String arr2[]=new String[list2.size()];
            arr2=list2.toArray(arr2);
			
			
			//System.out.println(Arrays.toString(arr));
            List<String> list=new ArrayList<String>();
            for(int i=0;i<arr1.length;i++){
                String st1=arr1[i];
                for(int j=0;j<arr2.length;j++){
                    if(i!=j){       
                        String st2=arr2[j];
                        String tmp="1"+st1+":2"+st2;
                        if(!list.contains(tmp)){
                            list.add(tmp);
                            if(st.equals(st1+st2+st2))
                                count++;
                            if(st.equals(st2+st1+st2))
                                count++;
                            if(st.equals(st2+st2+st1))
                                count++;
                            
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
public class AtoI {
	public static void main(String args[]){
		String a=" -88297 248252140B12 37239U4622733246I218  9 1303   44 A83793H3G2 1674443R591 4368 7  97";
		System.out.println(atoi(a));
	}
	public static int atoi(final String A) {
	    char arr[]=A.trim().toCharArray();
	    if(arr.length==0)
	        return 0;
	    int i,ch0=(int)arr[0];
	    if(!(arr[0]=='-'||arr[0]=='+'||(ch0>=48&&ch0<=57)))
	        return 0;
	    long max;
	    if(arr[0]=='-'){
	        i=1;
	        max=(long)Integer.MAX_VALUE+1;
	    }else if(arr[0]=='+'){
	       i=1;
	       max=Integer.MAX_VALUE;
	    }else{
	        i=0;
	        max=Integer.MAX_VALUE;
	    }
	    long num=0;
	    
	    for(;i<arr.length;i++){
			System.out.println(i+":"+arr[i]);
	        if((int)arr[i]>=48&&(int)arr[i]<=57){
	            num=num*10+((int)arr[i]-48);
				System.out.println("num:"+num+" max:"+max);
	            if(num>max)
	                return 0;
	        }else{
	            break;
	        }
			System.out.println("HELLO");
	    }
	    return (int)num;
	}
}

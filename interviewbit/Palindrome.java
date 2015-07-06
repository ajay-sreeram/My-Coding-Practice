public class Palindrome {
	public static void main(String args[]){
		String st="A man, a plan, a canal: Panama";
		System.out.println(st);
		System.out.println(isPalindrome(st));
	}
	public static int isPalindrome(String A) {
	    int l=0,h=A.length()-1;
	    A=A.toLowerCase();
	    while(l<=h){
	        System.out.println("l:"+l+">"+A.charAt(l)+" h:"+h+">"+A.charAt(h));
			if(A.charAt(l)!=A.charAt(h))
	            return 0;
	        l++;
	        while(!(Character.isDigit(A.charAt(l))||Character.isLetter(A.charAt(l)))){
	            l++;
	        }
	        h--;
	        while(!(Character.isDigit(A.charAt(h))||Character.isLetter(A.charAt(h)))){
	            h--;
	        }
			
	    }
	    return 1;
	}
}

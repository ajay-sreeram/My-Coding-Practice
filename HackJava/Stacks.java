import java.io.*;
public class Stacks {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			String stack="";
			int i=0;
			top:
			while(i<line.length()){
				//System.out.println("First "+line.charAt(i)+" "+stack);
				switch(line.charAt(i)){
					case '{': 
					stack=stack+"}";
					break;
					case '[':
					stack=stack+"]";
					break;
					case '(':
					stack=stack+")";
					break;
					case '}': case ']': case ')':
					if(stack.length()==0)
						break top;
					if(stack.charAt(stack.length()-1) == line.charAt(i))
					{
						if(stack.length()>0)
							stack=stack.substring(0,stack.length()-1);
						else
							break top;
					}else{
						break top;
					}	
				}
				//System.out.println(line.charAt(i)+" "+stack);
				i++;
			}
			if(i==line.length()&&stack.length()==0)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}

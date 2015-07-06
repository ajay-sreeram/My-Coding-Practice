import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Question{
    String stmt;
    int ans[];
   // int cnt[];
    public Question(String st){
        stmt=st.substring(0,st.length()-1);
        ans=new int[5];
       // cnt=new int[5];
    }
}
class Answer{
    String stmt;
    List<Integer> list;
    public Answer(String st){
        stmt=st;
        list=new ArrayList<Integer>();
    }
}
public class Para {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		String stt=in.nextLine();
		stt=stt.replace('.','`');
        String given[]=stt.split("`");
        Question q[]=new Question[5];
        Answer ans[]=new Answer[5];
        int i;
        for(i=0;i<5;i++)
            q[i]=new Question(in.nextLine());
        String tmpp[]=in.nextLine().split(";");
        for(i=0;i<5;i++)
            ans[i]=new Answer(tmpp[i]);
        for(i=0;i<given.length;i++){
            for(int j=0;j<5;j++){
                if(given[i].contains(ans[j].stmt))
                    ans[j].list.add(i);
            }
        }
        
		System.out.println("------------------------------------------------------"+given.length);
		//System.out.println(Arrays.toString(given));
		
        for(i=0;i<5;i++){
			System.out.println("ANS"+i+" :"+ans[i].stmt);
            String question[]=q[i].stmt.split(" ");
            int cnt=0;
            for(int j=0;j<5;j++){
                List<Integer> list=ans[j].list;
                int max=0;
                for(int k:list){
                    cnt=0;
                    for(int l=0;l<question.length;l++){
                        if(given[k].contains(question[l])){
                            cnt++;
                        }
                    }
                    if(max<cnt)
                        max=cnt;
                }
                q[i].ans[j]=max;
            }
        }
        
        for(i=0;i<5;i++){
            int p=0,max=0;
            for(int j=0;j<5;j++)
                if(q[i].ans[j]>max){
                    max=q[i].ans[j];
                    p=j;
                }
            System.out.println(ans[p].stmt);
        }
    }
}
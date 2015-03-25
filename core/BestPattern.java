public class BestPattern
{
public static void main(String s[])
    {
        String answers = "AAAAADDDDDCCCCBCBB";
        System.out.println("The best block pattern with only three letters is : " + getBestPattern(answers));

    }


private static PatternDetails getBestPattern(String answers) { 
List<String> list=new ArrayList<String>();
permutation("","ABC" ,list); 
permutation("", "BCD",list); 
permutation("", "ACD",list); 
permutation("", "ABD",list); 
Collections.sort(list,new Comparator<String>(){
public int compare(String s1,String s2){return s1.compareTo(s2);}});
int max=0;
String maxs="";
int i,j;
for(String s:list)
{
String my="";
int temp=0;
for(i=0;i<s.length();i++)
for(j=0;j<answers.length()/3;j++)
my+=""+s.charAt(i);
for(i=0;i<answers.length();i++)
if(my.charAt(i)==answers.charAt(i))
temp++;
if(temp>max)
{max=temp;maxs=s;}
}
PatternDetails pd=new PatternDetails(maxs,max);
return pd;

} 
 
public static void permutation(String prefix, String str,List<String> list) {
    int n = str.length();
    if (n == 0) 
    list.add(prefix);
    else 
   {
 for (int i = 0; i < n; i++)
permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),list);
    }
}

} 
class PatternDetails { 
 
String pattern; 
int marks; 
 
public PatternDetails(String pattern, int marks) { 
this.pattern = pattern; 
this.marks = marks; 
} 
 
@Override 
public String toString() { 
return pattern + " - " + marks; 
} 
} 
import java.util.*;
class ListOfWords 
{ 
    public static void main(String s[])
    {
        char input[] = {'B', 'A', 'T'};
        
        List<String> words = getListOfWords(input);
        
        for(String word : words)
        {
            System.out.println(word);
        }

    }


public static List<String> getListOfWords(char input[]) 
{ 

List<String> result = new ArrayList<String>();
 if (input.length == 2)
 { 
result.add("" + input[0] + input[1]); 
result.add("" + input[1] + input[0]);
 }
 else 
{
 	for (int i = 0; i < input.length; i++) 
	{
	 char[] trimmed = removeCharAt(input, i); 
	final List<String> combinations = getListOfWords(trimmed); 
	for (String combination : combinations)
	 {
		 result.add("" + input[i] + combination);
	 }
	 }
 }
 Collections.sort(result);
 return result;

} 
 
public static char[] removeCharAt(char input[], int index) 
{ 

char[] result = new char[input.length - 1];
 int k = 0; 
for (int j = 0; j < input.length; j++) { if (j == index) continue; result[k] = input[j]; k++; } return result;

} 
}

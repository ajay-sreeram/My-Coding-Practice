import java.util.*;
public class MeritD1
{
public static void main(String[] args) 
{
String result = "";
 int lastWordOccurredCount = 0;
 String[] words = paragraph.split(" ");
 for (int i = 0; i < words.length - 1; i++) 
{ 
String word = words[i];
 if (!word.equalsIgnoreCase(result))
 {
	 int wordOccuredCount = 0;
	 for (int j = i; j < words.length; j++)
	 {
	 if (word.equalsIgnoreCase(words[j]))
	 {
	 wordOccuredCount++; 
	} 
	}
	 if (wordOccuredCount > lastWordOccurredCount) 
	{ lastWordOccurredCount = wordOccuredCount; result = word; } 
} 
}
 return result; 

}
}
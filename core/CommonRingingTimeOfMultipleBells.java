Write a program to identify the time when the bells will ring together next, given their ringing frequency.
Input (String, List):Jan 19 2013 09:55, [2, 5, 10]
Output (String):Jan 19 2013 10:05


class CommonRingingTimeOfMultipleBells 
{ 
    public static void main(String s[])
    {
        ArrayList frequency = new ArrayList();
        frequency.add(2);
        frequency.add(5);
        frequency.add(10);
        System.out.println("Next Common Ringing Time is : " + getCommonRingingTime("Jan 19 2013 09:55", frequency));

    }


public static String getCommonRingingTime(String lastRungTime, List<Integer> frequencies) { 
String result = null;
DateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm");
Calendar cal = Calendar.getInstance();

try
{
int lcm = frequencies.get(0).intValue();
 
for(int i=1;i<frequencies.size();i++)
lcm = gcd(lcm, frequencies.get(i).intValue());

Date before = df.parse(lastRungTime);

cal.setTime(before);
cal.add(Calendar.MINUTE,lcm);
}
catch(Exception e){}
result = df.format(cal.getTime());
return result; 
}
public static int gcd(int a, int b)
{
   int num1, num2;
if (a > b) {
 num1 = a;
 num2 = b;
  } 
else {
 num1 = b;
 num2 = a;
 }
for (int i = 1; i <= num2; i++) {
  if ((num1 * i) % num2 == 0) {
    return i * num1;
     }
   }
return 1;
}
}
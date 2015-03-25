//({}[((({{}})[{()}]))])

class Stack
{
char stk[];
int top;
public Stack(int n)
{
top=-1;
stk=new char[n];
}
public void push(char c)
{
stk[++top]=c;
}
public char pop()
{
return stk[top--];
}
public int loc()
{
return top;
}
}
public class Techgig3
{
public static void main(String args[])
{
String result;//=validString("({}[((({{}})[{()}]))])");

result=validString("[[{}]]]");
System.out.println(result);
}

public static String validString(String input1)
    {
try{
Stack st=new Stack(input1.length());
int i=0;
char temp;
for(i=0;i<input1.length();i++)
{
temp=input1.charAt(i);
if(temp=='(')
st.push(')');
else
if(temp=='{')
st.push('}');
else
if(temp=='[')
st.push(']');
else
if(temp!=st.pop())
break;
}
if(st.loc()==-1&&i==input1.length())
return "Correct";
else
return "Incorrect";
}
catch(Exception e)
{return "Incorrect";}
}
}
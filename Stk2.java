package stack;
public class Stk2
{
int top;
int st[];
Stk2()
{
st=new int[50];
top=-1;
}
void push(char s)
{
st[++top]=s;
}
int pop()
{
return st[top--];
}
}
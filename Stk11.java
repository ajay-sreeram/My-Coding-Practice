package stack;

public class Stk11
{
int top;
char st[];
Stk11()
{
st=new char[50];
top=-1;
}
void push(char s)
{
st[++top]=s;
}
char pop()
{
return st[top--];
}
char s()
{
return st[top];
}
int t()
{
return top;
}
}
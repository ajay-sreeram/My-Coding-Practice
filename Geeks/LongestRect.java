public class LongestRect
{
public static void main(String args[])
{
int hist[]=new int[]{6,2,5,4,5,2,6};
int n=7;
System.out.println(getMaxArea(hist,n));
}
public static int getMaxArea(int hist[],int n){
Stack s=new Stack();
int tp,i=0;
int max=0;
int areatop;
while(i<n)
{
	if(s.top()==-1||hist[s.top()]<=hist[i])
	s.push(i++);
	else
	{
		tp=s.top();
		s.pop();
		areatop=hist[tp]*(s.top()==-1 ?i : i - s.top() - 1 );
		if(max<areatop)
		max=areatop;
	}
}

while(s.top()!=-1)
{
tp=s.top();
s.pop();
areatop=hist[tp]*(s.top()==-1 ? i:i - s.top() -1);
if(max<areatop)
	max=areatop;

}
return max;
}


}



class Stack
{
int arr[];
int tp;
public Stack()
{
tp=-1;
arr=new int[100];
}
public void push(int t)
{
arr[++tp]=t;
}
public void pop()
{
tp--;
}
public int top()
{
return arr[tp];
} 
}
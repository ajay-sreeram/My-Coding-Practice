import java.util.*;
public class SolutionD{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String st[]=sc.nextLine().split(" ");
int n=Integer.parseInt(st[0]);
int t=Integer.parseInt(st[1]);
List<String> lst=new ArrayList<String>();
//List lb=new ArrayList();
int n1,n2,i,j,k;
String tmp,temp;
for(i=0;i<t;i++)
{
temp="";
st=sc.nextLine().split(" ");
n1=Integer.parseInt(st[0]);
n2=Integer.parseInt(st[1]);
if(n1<n2)
temp=""+n1+" "+n2;
else
temp=""+n2+" "+n1;
lst.add(temp);
}
//Collections.sort(lst);;

List<Integer> l1=new ArrayList<Integer>();
List<Integer> l2=new ArrayList<Integer>();
//List<Double> testList=new ArrayList();
st=lst.get(0).toString().split(" ");
n1=Integer.parseInt(st[0]);		
l1.add(n1);
for(i=0;i<t;i++)
{
	for(j=0;j<lst.size();j++)
	{
		st=lst.get(j).toString().split(" ");
		n1=Integer.parseInt(st[0]);
		n2=Integer.parseInt(st[1]);
		if((!l1.contains(n1))&&(!l2.contains(n1))&&(!l1.contains(n2))&&(!l2.contains(n2)))//n1,n2 not in l1,l2
		continue;
		if((l1.contains(n1)&&l2.contains(n2))||(l1.contains(n2)&&l2.contains(n1)))
		continue;
		if(l1.contains(n1))
			l1.add(n2);
		else if(l1.contains(n2))
			l1.add(n1);
		else if(l2.contains(n1))
			l2.add(n2);
		else if(l2.contains(n2))
			l2.add(n1);
		
		lst.remove(j);
	}
}
for(i=0;i<lst.size();i++)
{
		st=lst.get(i).toString().split(" ");
		n1=Integer.parseInt(st[0]);
		n2=Integer.parseInt(st[1]);
	
	if((l1.contains(n1)&&l2.contains(n2))||(l1.contains(n2)&&l2.contains(n1)))
		continue;
	l1.add(n1);l2.add(n2);
}

if(l1.size()+l2.size()==n)
System.out.println("Yes");
else
System.out.println("No");
	
	}

}

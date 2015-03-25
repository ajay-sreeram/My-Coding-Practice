//Hard level
public class Hard
{
public static void main(String args[])
{
String st="acdabebaae";
//if(st.length()<2)
//return "0";
String st2="";
char temp;
int i,j,k;
double itemp;
//System.out.println(st);

for(i=0;i<st.length();i++)
{
if(st2.indexOf(""+st.charAt(i))==-1)
st2+=""+st.charAt(i);
}

char arr[]=st2.toCharArray();
//System.out.println(new String(arr));

for(i=0;i<st2.length();i++)
 for(j=0;j<st2.length()-1;j++)
 if(arr[j]>arr[j+1])
 {
   temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
 }

//System.out.println(new String(arr));
st2=new String(arr);
double val[]=new double[st2.length()];

for(i=0;i<st2.length();i++)
val[i]=(double)(st.length()-st.replaceAll(""+st2.charAt(i),"").length())/st.length();

//System.out.println(new String(arr));

//for(i=0;i<st2.length();i++)
//System.out.print(" "+val[i]);

//System.out.println();

for(i=0;i<st2.length();i++)
 for(j=0;j<st2.length()-1;j++)
 if(val[j]<val[j+1])
 {
    itemp=val[j];
    val[j]=val[j+1];
    val[j+1]=itemp;
   temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
 }
//System.out.println(new String(arr));

//for(i=0;i<st2.length();i++)
//System.out.print(" "+val[i]);

String result="";
st2=new String(arr);
for(i=0;i<st.length();i++)
{ 
   for(j=0;j<st2.length();j++)
   { 
       if(st2.charAt(j)==st.charAt(i))
        {
           if(j!=st2.length()-1)
           {
             for(k=0;k<j;k++)
               result+=""+'1';
	result+=""+'0';
           }
          else
            for(k=0;k<j;k++)
               result+=""+'1';
          }
     }
}
  
System.out.println(result);
}
}
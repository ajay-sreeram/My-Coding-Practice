import java.io.*;
import java.sql.*;
public class WordDb
{
static int n;
static int total;
static Connection con;
static PreparedStatement pstmt;
static ResultSet rs;
static FileOutputStream fs;
static DataOutputStream ds;
		
public static void main(String args[])throws IOException
{
try{

int i,j,k;
String arr[]=new String[4];
arr[0]="ensi";
arr[1]="isnr";
arr[2]="aioa";
arr[3]="lpab";
String st,posStr;
n=4;
total=0;
int count=7;
st="";posStr="";
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dictionary","dictionary");
fs=new FileOutputStream("abcdwords.txt");
ds=new DataOutputStream(fs);
		
for(count=3;count<=16;count++)
for(i=0;i<n;i++)
for(j=0;j<n;j++)
k=rec(arr,i,j,st,count,posStr);

System.out.println("\n total:"+total);
fs.close();
}
catch(Exception e)
{System.out.println(e);}
}


public static int check(String st,char p)
{
for(int i=0;i<st.length();i++)
if(st.charAt(i)==p)
return 1;
return 0;
}
public static int check1(String st,int i,int j)
{
String temp;
for(int x=0,y=1;y<st.length();x++,y++)
{
temp=""+st.charAt(x)+st.charAt(y);
//System.out.println("temp:"+temp+"num:"+i+""+j);
if(temp.equals(""+i+""+j))
return 1;
}
return 0;
}


public static int rec(String arr[] , int i , int j , String st , int len,String posSt)throws Exception
{ 
if(st.length()==len)
{
System.out.print(st+"  ");
pstmt=con.prepareStatement("select * from dict where word=?");
pstmt.setString(1,st);

//Statement stmt=con.createStatement();
//ResultSet rst=stmt.executeQuery("select * from dict where word='"+st+"'");

rs=pstmt.executeQuery();
if(rs.next())
{
		ds.writeBytes(st+"\n");
}
st="";
posSt="";
total++;
pstmt.close();
rs.close();
return 1;
}
//else if(check(st,arr[i].charAt(j))==0)
else if(check1(posSt,i,j)==0)
{
	posSt+=""+i+""+j;
	st+=arr[i].charAt(j);
	if(i-1>=0&&j-1>=0)
	if(rec(arr,i-1,j-1,st,len,posSt)!=0)
	return 0;
	if(i-1>=0)
	if(rec(arr,i-1,j,st,len,posSt)!=0)
	return 0;
	if(i-1>=0&&j+1<n)
	if(rec(arr,i-1,j+1,st,len,posSt)!=0)
	return 0;
	if(j+1<n)
	if(rec(arr,i,j+1,st,len,posSt)!=0)
	return 0;
	if(i+1<n&&j+1<n)
	if(rec(arr,i+1,j+1,st,len,posSt)!=0)
	return 0;
	if(i+1<n)
	if(rec(arr,i+1,j,st,len,posSt)!=0)
	return 0;
	if(i+1<n&&j-1>=0)
	if(rec(arr,i+1,j-1,st,len,posSt)!=0)
	return 0;
	if(j-1>=0)
	if(rec(arr,i,j-1,st,len,posSt)!=0)
	return 0;
}
return 0;
}

}
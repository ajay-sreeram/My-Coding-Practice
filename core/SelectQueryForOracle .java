class SelectQueryForOracle 
{ 
    public static void main(String s[])
    {
        College college = new College();
        String query = selectStatement(college);
        System.out.println(query);

    }


public static String selectStatement(Object entity) { 
String result = null;
Class c = entity.getClass();
java.lang.reflect.Field f[]=c.getDeclaredFields();
result="SELECT ";
List<String> list=new ArrayList<String>();
for(int i=0;i<f.length;i++)
list.add(f[i].getName().toUpperCase());
Collections.sort(list,new Comparator<String>(){
public int compare(String s1,String s2){return s1.compareTo(s2);}});

if(list.contains("ID"))
{result+="ID";list.remove("ID");}
else
{result+=list.get(0);list.remove(list.get(0));}
for(int i=0;i<list.size();i++)
result+=", "+list.get(i);

result+=" FROM "+c.getName().toUpperCase()+";";
return result;
}
}

class College { 
 
int numberOfStudents; 
int numberOfBranches; 
int numberOfFaculty; 
String collegeCode; 
String address; 
String collegeName; 
} 
public class MyBasicStaticMemberClass 
{
    public static class MyStaticMemberExampleClass 
    {
        public void printStatus() 
        {
            System.out.println("Inside static member class");
        }
    }
    public static void main(String a[]) 
    {
        StaticMemberTestClass staticMemberTest = new StaticMemberTestClass();
        staticMemberTest.testMemberClass();
        System.out.println("Inside Main");
    }
    static 
    {
        System.out.println("Static Block");
    }
}
class StaticMemberTestClass 
{
        public void testMemberClass() 
        {
            MyBasicStaticMemberClass.MyStaticMemberExampleClass myStaticMemberExample = new MyBasicStaticMemberClass.MyStaticMemberExampleClass();
            myStaticMemberExample.printStatus();
            System.out.println("Inside Class");
        }
}
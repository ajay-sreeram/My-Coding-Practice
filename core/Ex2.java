class Ex2
{
 public static void main(String []args) 
    {
        OutPut O = new OutPut();
        O.string();
    }
    
    void string() 
    {
        OutPut1 t = new OutPut1();
        System.out.print(t.x + " ");

        OutPut1 t2 = fix(t);
        System.out.println(t.x + " " + t2.x);
    }
    
    OutPut1 fix(OutPut1 tt) 
    {
        tt.x -= 42;
        return tt;
    }
}

class OutPut1
{
    byte x = 42;
}
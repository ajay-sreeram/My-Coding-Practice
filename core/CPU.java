class MotherBoard 
{
    protected MotherBoard()
    {
        System.out.print(" MotherBoard ");
    }
}

public class CPU extends MotherBoard 
{
    private CPU()
    {
        System.out.print(" Inside CPU ");
    }

    public static void main(String args[])
    {
        new CPU();
    }
}
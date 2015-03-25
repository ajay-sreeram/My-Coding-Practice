public class MeritCampus
{
public static void main(String []args)
{}
}
class Merit
{
Merit(String s)
{}
Merit()
{}
}
class Campus extends Merit
{
Campus()
{}
Campus(String s)
{
super(s);
}
void insert()
{
Merit f = new Campus() { };
}
}